package cc.carretera;

import es.upm.babel.cclib.Monitor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 */
public class CarreteraMonitor implements Carretera {

    private boolean[][] sensoresPresion;

    Monitor mutex;

    // offer()->meter poll()->sacar
    Queue<Buga> colaEntrada = new LinkedList<>();
    ArrayList<Buga> colaAvanzar = new ArrayList<>();
    Buga elemAvanceActual = null;

    ArrayList<Buga> colaCirculando = new ArrayList<>();
    ArrayList<Buga> infoIDs = new ArrayList<>();

    public CarreteraMonitor(int segmentos, int carriles) {
        // TODO: inicializar estado, monitor y conditions
        sensoresPresion = new boolean[segmentos][carriles];
        mutex = new Monitor();
        for (int i = 0; i < segmentos; i++) {
            for (int j = 0; j < carriles; j++) {
                sensoresPresion[i][j] = false;
            }
        }
    }

    public Pos entrar(String id, int tks) {

        mutex.enter();

        if (!hayCarriles(0)) {
            Monitor.Cond c = mutex.newCond();
            colaEntrada.add(new Buga(id, tks, c, null));
            c.await();
        }
        // cargamos el elemento pos carril con el primer carrill disponible
        Pos carril = carrilDisponible(0);
        // activamos los sensores de presion en el segmento-carril correspondiente
        sensoresPresion[carril.getSegmento()][carril.getCarril()] = true;
        Buga cocheSalida = new Buga(id, tks, null, carril);
        for (Buga coche : colaEntrada) {
            if (coche.id == null ? id == null : coche.id.equals(id)) {
                colaEntrada.poll();
                break;
            }
        }

        infoIDs.add(cocheSalida);

        Pos output = new Pos(carril.getSegmento() + 1, carril.getCarril() + 1);
        desbloquear();
        mutex.leave();
        return output;
    }

    public Pos avanzar(String id, int tks) {

        mutex.enter();
        Buga coche = buscarId(id);
        // comprobamos que no hay carriles disponibles en el siguiente segmento
        if (!hayCarriles(coche.pos.getSegmento() + 1)) {
            Monitor.Cond c = mutex.newCond();
            colaAvanzar.add(new Buga(id, tks, c, coche.pos));
            c.await();
        }
        Pos carril = carrilDisponible(coche.pos.getSegmento() + 1);
        sensoresPresion[coche.pos.getSegmento()][coche.pos.getCarril()] = false;
        sensoresPresion[carril.getSegmento()][carril.getCarril()] = true;// null ponter exc.
        coche = buscarId(id);
        for (int i = 0; i < infoIDs.size(); i++) {
            if (infoIDs.get(i).id.equals(coche.id)) {
                infoIDs.set(i, new Buga(coche.id, tks, null, carril));
            }
        }
        for (int i = 0; i < colaAvanzar.size(); i++) {
            if (colaAvanzar.get(i).id.equals(coche.id)) {
                colaAvanzar.remove(colaAvanzar.get(i));
            }
        }

        Pos output = new Pos(carril.getSegmento() + 1, carril.getCarril() + 1);
        desbloquear();
        mutex.leave();
        return output;

    }

    public void circulando(String id) {
        // TODO: implementar circulando
        mutex.enter();

        Buga coche = buscarId(id);
        if (coche.tks > 0) {
            Monitor.Cond c = mutex.newCond();
            colaCirculando.add(new Buga(coche.id, coche.tks, c, coche.pos));
            c.await();
        }

        desbloquear();
        mutex.leave();

    }

    public void salir(String id) {
        // TODO: implementar salir
        mutex.enter();

        Buga coche = buscarId(id);

        sensoresPresion[coche.pos.getSegmento()][coche.pos.getCarril()] = false;
        infoIDs.remove(coche);

        desbloquear();
        mutex.leave();
    }

    public void tick() {
        // TODO: implementar tick
        mutex.enter();
        Buga elem = null;
        for (int i = 0; i < colaCirculando.size(); i++) {
            elem = colaCirculando.get(i);
            if (elem.tks > 0) {
                colaCirculando.set(i, new Buga(elem.id, elem.tks - 1, elem.cond, elem.pos));
            }
        }
        for (int i = 0; i < infoIDs.size(); i++) {
            elem = infoIDs.get(i);
            if (elem.tks > 0) {
                infoIDs.set(i, new Buga(elem.id, elem.tks - 1, null, elem.pos));
            }
        }
        desbloquear();
        mutex.leave();
    }

    public void desbloquear() {
        boolean signaled = false;
        for (int i = 0; i < colaCirculando.size() && !signaled; i++) {
            if (colaCirculando.get(i).tks < 1) {
                signaled = true;
                colaCirculando.get(i).cond.signal();
                colaCirculando.remove(colaCirculando.get(i));
            }
        }

        if (!signaled && hayCarriles(0) && colaEntrada.size() > 0) {
            signaled = true;
            Buga aux = colaEntrada.poll();
            aux.cond.signal();
        }

        for (int j = 0; j < colaAvanzar.size() && !signaled; j++) {
            Buga elemAvanzar = buscarId(colaAvanzar.get(j).id);
            System.out.print(elemAvanzar.id);
            if (elemAvanzar.pos.getSegmento()<sensoresPresion.length-1&&hayCarriles(elemAvanzar.pos.getSegmento() + 1)) {
                signaled = true;
                colaAvanzar.get(j).cond.signal();
            }
        }
    }

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

    public Buga buscarId(String id) {
        Buga res = null;
        for (Buga iteracion : infoIDs) {
            if (iteracion.id == null ? id == null : iteracion.id.equals(id)) {
                res = iteracion;
                break;
            }
        }
        return res;
    }

    static class Buga {

        private String id;
        private int tks;
        private Monitor.Cond cond;
        private Pos pos;

        Buga(String id, int tks, Monitor.Cond cond, Pos pos) {
            this.id = id;
            this.tks = tks;
            this.cond = cond;
            this.pos = pos;
        }
    }

}
