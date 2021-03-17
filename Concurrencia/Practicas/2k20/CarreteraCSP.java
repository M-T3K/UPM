package cc.carretera;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.jcsp.lang.Alternative;
import org.jcsp.lang.Any2OneChannel;
import org.jcsp.lang.CSProcess;
import org.jcsp.lang.Channel;
import org.jcsp.lang.Guard;
import org.jcsp.lang.One2OneChannel;
import org.jcsp.lang.ProcessManager;

import es.upm.babel.cclib.Monitor;


public class CarreteraCSP implements Carretera, CSProcess {

    private final int segmentos;
    private final int carriles;

    private boolean[][] sensoresPresion;

    private static final int ENTRAR = 0;
    private static final int AVANZAR = 1;
    private static final int SALIR = 2;
    private static final int CIRCULANDO = 3;
    private static final int TICK = 4;

    private Any2OneChannel chEntrar;
    private Any2OneChannel chAvanzar;
    private Any2OneChannel chSalir;
    private Any2OneChannel chCirculando;
    private Any2OneChannel chTick;

    public CarreteraCSP(int segmentos, int carriles) {

        this.segmentos = segmentos;
        this.carriles = carriles;

        sensoresPresion = new boolean[segmentos][carriles];
        for (int i = 0; i < segmentos; i++) {
            for (int j = 0; j < carriles; j++) {
                sensoresPresion[i][j] = false;
            }
        }

        chEntrar = Channel.any2one();
        chAvanzar = Channel.any2one();
        chSalir = Channel.any2one();
        chCirculando = Channel.any2one();
        chTick = Channel.any2one();

        new ProcessManager(this).start();
    }

    public Pos entrar(String car, int tks) {
        One2OneChannel cResp = Channel.one2one();
         quinteto coche = new quinteto (car, tks, null, tks, cResp);
        chEntrar.out().write(coche);

        return (Pos) cResp.in().read();
    }

    public Pos avanzar(String car, int tks) {

        One2OneChannel cResp = Channel.one2one();
        quinteto coche = new quinteto(car,tks,null,0, cResp);
        chAvanzar.out().write(coche);

        return (Pos) cResp.in().read();
    }

    public void salir(String car) {

        One2OneChannel cResp = Channel.one2one();
        par coche = new par(car, cResp);
        chSalir.out().write(coche);

        cResp.in().read();
    }

    public void circulando(String car) {

        One2OneChannel cResp = Channel.one2one();
        par coche = new par(car, cResp);
        chCirculando.out().write(coche);

        cResp.in().read();
    }

    public void tick() {

        One2OneChannel cResp = Channel.one2one();
        chTick.out().write(cResp);

        cResp.in().read();
    }

    // Código del servidor
    public void run() {
        Guard[] inputs = new Guard[5];

        inputs[ENTRAR] = chEntrar.in();
        inputs[AVANZAR] = chAvanzar.in();
        inputs[SALIR] = chSalir.in();
        inputs[CIRCULANDO] = chCirculando.in();
        inputs[TICK] = chTick.in();

        Alternative servicios = new Alternative(inputs);

        Queue<quinteto> colaEntrar = new LinkedList<>();
        Queue<par> colaSalir = new LinkedList<>();
        ArrayList<quinteto> colaAvanzar = new ArrayList<>();
        ArrayList<par> colaCirculando = new ArrayList<>();
        ArrayList<quinteto> infoIDs = new ArrayList<>();
      
        // Bucle principal del servicio
        while (true) {
            int servicio = servicios.fairSelect();

            switch (servicio) {
                case ENTRAR:
                    colaEntrar.add((quinteto) chEntrar.in().read());
                    break;

                case AVANZAR:
                    colaAvanzar.add((quinteto) chAvanzar.in().read());
                    break;
                case SALIR:
                    colaSalir.add((par) chSalir.in().read());
                    break;
                case CIRCULANDO:
                    colaCirculando.add((par) chCirculando.in().read());
                    break;

                case TICK:
                    One2OneChannel cResp = (One2OneChannel) chTick.in().read();
                    for (quinteto coche : infoIDs) {
                    	coche.setTmp(coche.getTmp() - 1);
                        infoIDs.set(infoIDs.indexOf(coche), coche);
                    }
                    cResp.out().write(null);
                    break;
            }
            boolean hayCambio = true;
            while (hayCambio) {
                hayCambio = false;
                //ENTRAR
                if (colaEntrar.size() > 0 && hayCarriles(0)) {
                    hayCambio = true;
                    quinteto coche = colaEntrar.poll();
                    Pos pos = carrilDisponible(0);
                    coche.setPos(pos);
                    infoIDs.add(coche);
                    sensoresPresion[pos.getSegmento()][pos.getCarril()] = true;
                    coche.getCh().out().write(sumarUno(pos));
                }
                //AVANZAR
                for (int i = 0; i < colaAvanzar.size(); i++) {
                    quinteto cocheAvanzar = colaAvanzar.get(i);
                    for (int j = 0; j < infoIDs.size(); j++) {
                        quinteto cocheCompleto = infoIDs.get(j);
                        if ((cocheAvanzar.getNombre() == null ? cocheCompleto.getNombre() == null : cocheAvanzar.getNombre().equals(cocheCompleto.getNombre()))
                                && (hayCarriles(cocheCompleto.getPos().getSegmento() + 1))) {
                            hayCambio = true;
                            Pos pos = carrilDisponible(cocheCompleto.getPos().getSegmento() + 1);
                            sensoresPresion[cocheCompleto.getPos().getSegmento()][cocheCompleto.getPos().getCarril()] = false;
                            cocheCompleto.setPos(pos);
                            cocheCompleto.setTmp(cocheAvanzar.getTmp());
                            infoIDs.set(infoIDs.indexOf(cocheCompleto), cocheCompleto);
                            sensoresPresion[pos.getSegmento()][pos.getCarril()] = true;
                            colaAvanzar.remove(cocheAvanzar);
                            cocheAvanzar.getCh().out().write(sumarUno(pos));
                            i--;
                            break;
                        }
                    }
                }
                //SALIR
                if (colaSalir.size() > 0) {
                    hayCambio = true;
                    par coche = colaSalir.poll();
                    for (int i = 0; i < infoIDs.size(); i++) {
                        quinteto cocheCompleto=infoIDs.get(i);
                        if ((coche.getNombre() == null ? cocheCompleto.getNombre() == null : coche.getNombre().equals(cocheCompleto.getNombre()))) {
                            Pos pos = cocheCompleto.getPos();
                            sensoresPresion[pos.getSegmento()][pos.getCarril()] = false;
                            infoIDs.remove(i);
                            coche.getCh().out().write(null);
                            break;
                        }
                    }
                }
                //CIRCULANDO
                for (int i = 0; i < colaCirculando.size(); i++) {

                    par coche = colaCirculando.get(i);
                    for (quinteto cocheCompleto : infoIDs) {

                        if ((coche.getNombre() == null ? cocheCompleto.getNombre() == null : coche.getNombre().equals(cocheCompleto.getNombre()))
                                && (cocheCompleto.getTmp() < 1)) {
                            hayCambio = true;
                            colaCirculando.remove(coche);
                            coche.getCh().out().write(null);
                            i--;
                            break;
                        }
                    }
                }
            }
        }
    }

    //MMMMMMMMMMEEEEEEEETTTTTTTTTTTTTOOOOOOOOOOODDDDDDDDDDDDDDDDOOOOOOOSSSSSSSSS
    public boolean hayCarriles(int segmento) {
        boolean res = false;

        for (int i = 0; i < sensoresPresion[segmento].length; i++) {
            if (sensoresPresion[segmento][i] == false) {
                res = true;
                break;
            }
        }

        return res;
    }

    public Pos carrilDisponible(int segmento) {
        Pos sol = null;
        for (int i = 0; i < sensoresPresion[segmento].length; i++) {
            if (sensoresPresion[segmento][i] == false) {
                sol = new Pos(segmento, i);
                break;
            }
        }

        return sol;
    }

    public Pos sumarUno(Pos pos) {
        return new Pos(pos.getSegmento() + 1, pos.getCarril() + 1);
    }
    
    
    class quinteto { 

		int tmp;
		String nombre;
		Pos pos;
		int tmp2;
		One2OneChannel ch;

		private quinteto(String nombre, int tmp, Pos pos, int tmp2, One2OneChannel ch){
			this.nombre = nombre;
			this.tmp = tmp;
			this.pos = pos;
			this.tmp2 = tmp2;
			this.ch = ch;
		}


		
		
		public int getTmp2() {
			return tmp2;
		}

		public int getTmp(){
			return tmp;
		}
		
		public void setTmp(int otro) {
			this.tmp = otro;
		}

		public String getNombre(){
			return nombre;
		}
		
		public One2OneChannel getCh(){
			return ch;
		}
		public Pos getPos() {
			return pos;
		}
		
		public void setPos(Pos otro) {
			this.pos = otro;
		}

	}
    
    class par { 

		String nombre;
		One2OneChannel ch;

		private par(String nombre, One2OneChannel ch){
			this.nombre = nombre;
			this.ch = ch;
		}


		public String getNombre(){
			return nombre;
		}
		
		public One2OneChannel getCh(){
			return ch;
		}
	}
	
}
