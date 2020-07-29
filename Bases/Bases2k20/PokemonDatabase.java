package pokemon;

import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PokemonDatabase {
	
    // Atributos

	private static Connection conn = null;
	private Statement st = null;
	private ResultSet rs = null;
	private PreparedStatement pst = null;
	
	// Constructor

	public PokemonDatabase() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e){
			//e.printStackTrace();
			System.out.println("No se ha podido cargar la clase Driver");
		}	
	}
	// --------------------------------------------------------------------
	
	// Metodos Auxiliares

	// Este metodo se encargara de limpiar (cerrar) todo lo que sea necesario excepto la conexion,
	// ya que la conexion se debe mantener abierta hata que se cierre el programa
	private void performCleanup() {
		try {
			if(st != null) st.close(); //cierre de statement
			if(rs != null) rs.close(); //cierre de resultset
			if(pst != null) pst.close(); //cierre de prepared statement
			if (conn != null && conn.getAutoCommit() == false) conn.setAutoCommit(true); //si el autocomit esta a false lo pone a true
		} catch (SQLException e) {
			System.out.printf("Error al realizar los cierres. Mensaje de la Excepción: <%s>\n Código de Error: %d\n Estado SQL: %s\n\nA continuación se muestra el stack de llamada que ha provocado este error: \n", e.getMessage(), e.getErrorCode(),  e.getSQLState());
			e.printStackTrace();
		}
	}
	// --------------------------------------------------------------------

	// Connect & Disconnect
	
	/**
	 * 
	 * @return <true> si se realiza la conexion y <false> si hay algun error al respecto.
	 */
	public boolean connect() {
		boolean conexion = true;
		if (conn == null) { //connect se ejecuta en todas las funciones. En caso de estar la conexion abierta no se ejecuta.
			String serverAddress = "localhost:3306";
			String db = "pokemon";
			String user = "pokemon_user";
			String pass = "pokemon_pass";
			String url = "jdbc:mysql://" + serverAddress + "/" + db;
			try{
				conn = DriverManager.getConnection(url, user, pass);
				System.out.println("El usuario " + user + " se ha conectado correctamente a la base de datos " + db);
			} catch (SQLException e) {
				System.out.println("No se ha podido conectar con la base de datos");
				System.out.println("Mensaje de error: " + e.getMessage());
				System.out.println("Codigo de error: " + e.getErrorCode());
				System.out.println("Estado SQL: " + e.getSQLState());
				conexion = false;
				System.out.print("A continuacion se presenta la traza de la pila:");
				e.printStackTrace();
			}	
		}
		return conexion;
	}	
	// --------------------------------------------------------------------

	/**
	 * 
	 * @return <true> si se realiza la desconexion con exito y <false> si hay algun error.
	 */
	public boolean disconnect() {
		boolean desconectado = true;
		try{
			performCleanup();
			if(conn != null) conn.close();
			System.out.println("Se ha desconectado correctamente de la base de datos");
		} catch (SQLException e){
			//e.printStackTrace();
			System.out.println("No se ha podido desconectar de la BD");
			System.out.println("Mensaje de error: " + e.getMessage());
			System.out.println("Codigo de error: " + e.getErrorCode());
			System.out.println("Estado SQL: " + e.getSQLState());
			desconectado = false;
		}	
		return desconectado;
	}	
	// --------------------------------------------------------------------

	// Creacion de Tablas

	/**
	 * Crea una nueva tabla "aprende".
	 * @return <true> si lo consigue y <false> si hay algun error durante la creacion de la tabla
	 */
	public boolean createTableAprende() {
		connect();
		boolean creada = true;
		try {		
			String query = "CREATE TABLE aprende ( " +
							"n_pokedex INT, " +
							"id_ataque INT, " +
							"nivel INT, " +
							"PRIMARY KEY (n_pokedex, id_ataque), " +
							"FOREIGN KEY (n_pokedex) REFERENCES especie(n_pokedex) " +
							"ON DELETE CASCADE ON UPDATE CASCADE, " +
							"FOREIGN KEY (id_ataque) REFERENCES ataque(id_ataque) " +
							"ON DELETE CASCADE ON UPDATE CASCADE "+
							");" ;
			st = conn.createStatement();
			st.executeUpdate(query);
			System.out.println("Tabla aprende creada correctamente");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Error al crear la tabla aprende");
			System.out.println("Mensaje de error: " + e.getMessage());
			System.out.println("Codigo de error: " + e.getErrorCode());
			System.out.println("Estado SQL: " + e.getSQLState());
			creada = false;
		} finally {
			performCleanup();
		}
		return creada;
	}
	// --------------------------------------------------------------------

	/**
	 * Crea una nueva tabla "conoce".
	 * @return <true> si lo consigue y <false> si hay algun error durante la creacion de la tabla.
	 */
	public boolean createTableConoce() {
		connect();
		boolean creada = true;
		try {
			String query = "CREATE TABLE conoce ( " +
							"n_pokedex INT, " +
							"n_encuentro INT, " +
							"id_ataque INT, " +
							"PRIMARY KEY (n_pokedex, n_encuentro, id_ataque), " +
							"FOREIGN KEY (n_pokedex, n_encuentro) REFERENCES ejemplar(n_pokedex, n_encuentro) " +
							"ON DELETE CASCADE ON UPDATE CASCADE, " +
							"FOREIGN KEY (id_ataque) REFERENCES ataque(id_ataque) " +
							"ON DELETE CASCADE ON UPDATE CASCADE "+
							");" ;
			st = conn.createStatement();
			st.executeUpdate(query);
			System.out.println("Tabla conoce creada correctamente");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Error al crear la tabla conoce");
			System.out.println("Mensaje de error: " + e.getMessage());
			System.out.println("Codigo de error: " + e.getErrorCode());
			System.out.println("Estado SQL: " + e.getSQLState());
			creada = false;
		} finally {
			performCleanup();
		}
		return creada;
	}
	// --------------------------------------------------------------------

	// Cargado de Ficheros CSV

	/**
	 * @param <filename> que contiene el nombre del archivo del que se va a leer.
	 * @return <int> que contiene la cantidad de transferencias de datos que se han realizado a partir de este archivo. Si todo va bien, deberia ser la misma cantidad de elementos que hayan dentro del fichero.
	 */
	public int loadAprende(String fileName) {
		connect();
		ArrayList<Aprende> lista = Aprende.readData(fileName);
		int lista_size = lista.size();
		int cont = 0;
		String query = "INSERT INTO aprende (n_pokedex, id_ataque, nivel) VALUES (?,?,?);";
		
		for (int index = 0; index < lista_size ; index++){
			try{
			st = conn.createStatement();
			pst = conn.prepareStatement(query);
			pst.setInt(1, lista.get(index).getId_especie());
			pst.setInt(2, lista.get(index).getId_ataque());
			pst.setInt(3, lista.get(index).getNivel());
			cont+=pst.executeUpdate(); //Cada transaccion es independiente. EN este punto se ejecuta el commit
			}catch (SQLException e) {
				System.out.println("Error al introducir el elemento " + index + " en la tabla aprende");
			} finally {
				performCleanup();
			}
		}		
		return cont;
	}
	// --------------------------------------------------------------------

	/**
	* @param <filename> que contiene el nombre del archivo del que se va a leer.
	* @return <int> que contiene el tamaño de la lista de movimientos, o 0 si hay algún tipo de error.
	*/
	public int loadConoce(String fileName) {
		connect();
		ArrayList<Conoce> lista = Conoce.readData(fileName);
		int lista_size = lista.size();
		try{
			conn.setAutoCommit(false); //Ponemos autocomit a false que es mas sencillo que usar Start Transaction
			String query = "INSERT INTO conoce (n_pokedex, n_encuentro , id_ataque) VALUES (?,?,?);";
			pst = conn.prepareStatement(query);
			for (int index = 0; index < lista_size ; index++){
				pst.setInt(1, lista.get(index).getId_especie());
				pst.setInt(2, lista.get(index).getN_encuentro());
				pst.setInt(3, lista.get(index).getId_ataque());
				pst.executeUpdate();
			}
			conn.commit(); //Si todo ha salido bien hacemos commit para introducir los datos
		}catch (SQLException e) {
			System.out.println("Error al introducir los datos en la tabla conoce");
			lista_size = 0;
		} finally {
			performCleanup();
		}
		return lista_size;
	}
	// --------------------------------------------------------------------
	
	/**
	 * Este metodo generara una enciclopedia (Pokedex) que contenga la informacion basica de una especie pokemon.
	 * @return ArrayList<Especie> que contiene un listado de especies pokemon con todos sus datos relevantes.
	 */
	public ArrayList<Especie> pokedex() {
		connect();
		ArrayList<Especie> lista_pokedex = new ArrayList<Especie>();
		try {
			st = conn.createStatement();
			String query = "SELECT * FROM especie;";
			rs = st.executeQuery(query);
			while (rs.next()){
				Especie esp = new Especie(rs.getInt("n_pokedex"),rs.getString("nombre"),rs.getString("descripcion"),rs.getInt("evoluciona"));
				lista_pokedex.add(esp);
			}
		} catch (SQLException e) {
			System.out.println("Error en la pokedex");
			lista_pokedex = null; //Si hay errores se devuelve un ArrayList<Especie> = null
		} finally {
			performCleanup();
		}
		return lista_pokedex;
	}
	// --------------------------------------------------------------------
	
	// Otros
	
	/**
	 * @return ArrayList<Ejemplar> que contiene un listado de ejemplares ordenados por el numero de la pokedex. Si hay algun error, devolvera <null>. 
	 */
	public ArrayList<Ejemplar> getEjemplares() {
		connect();
		ArrayList<Ejemplar> lista_ejemplares = new ArrayList<Ejemplar>();
		try {
			st = conn.createStatement();
			String query = "SELECT n_pokedex, n_encuentro, apodo, sexo, nivel, infectado FROM ejemplar ORDER BY n_pokedex, n_encuentro ASC;";
			rs = st.executeQuery(query);
			while (rs.next()){
				String sexo = rs.getString("sexo");
				Character s = null; 
				if(sexo != null){
				  s = sexo.charAt(0);
				}
				Ejemplar ejem = new Ejemplar(rs.getInt("n_pokedex"),rs.getInt("n_encuentro"),rs.getString("apodo"),s,rs.getInt("nivel"),rs.getInt("infectado"));
				lista_ejemplares.add(ejem);
			}
		} catch (SQLException e) {
			System.out.println("Error");
			lista_ejemplares= null; //Si hay errores se devuelve un ArrayList<Ejemplar> = null
		} finally {
			performCleanup();
		}
		return lista_ejemplares;
		}
	// --------------------------------------------------------------------

	// Suponiendo que no hayan Pokemon infectados
	
	/**
	 * @param ejemplares ArrayList<Ejemplar> que contiene un listado de ejemplares
	 * @param dias <int> que representa la cantidad de dias que han pasado.
	 * @return <int> que contiene el numero de infectados al cabo de n <dias>.
	 */
	public int coronapokerus(ArrayList<Ejemplar> ejemplares, int dias) {
		//Si el numero de dias  es cero devuelve 0. El metodo main utilizado restringe dias a solo los numeros naturales
		//y no cuenta el 0 como numero natural, pero asegurarse nunca esta de mas
		if(dias <= 0) return 0;
		
		connect();
		
		int infectados = 0;
		
		String query =	"UPDATE ejemplar " + 
							"SET infectado=1 " +
							"WHERE n_pokedex=? AND " +
							"n_encuentro=? AND " + 
							"infectado=0; ";
		
		Ejemplar primerEjemplar = Ejemplar.ejemplarRandom(ejemplares); //El primer dia se infecta a un ejemplar
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, primerEjemplar.getN_pokedex());
			pst.setInt(2, primerEjemplar.getN_encuentro());
			pst.executeUpdate();
			infectados++; //y aumenta el numero de infectados
		} catch (SQLException e){
			System.out.println("Error en el primer ejemplar " + primerEjemplar.getN_pokedex() +" "+ primerEjemplar.getN_encuentro());
		} finally {
			performCleanup();
		}
		
		if (infectados > 0){ //Si se ha infectado correctamente el primer ejemplar seguimos infectando, sino no tendria sentido seguir infectando
			for (int i = 1; i<dias ; i++){
				
				int acumInfect = 0;
				
				try {
					conn.setAutoCommit(false); //Solo se hara comit de cada dia en caso de que no haya fallos
					for (int j = 0; j<infectados; j++) {
						Ejemplar aleatorio = Ejemplar.ejemplarRandom(ejemplares);
						
						pst = conn.prepareStatement(query);
						pst.setInt(1, aleatorio.getN_pokedex());
						pst.setInt(2, aleatorio.getN_encuentro());
						int resultado = pst.executeUpdate();
						
						if (resultado == 1){ //Si se infecta correctamente
							acumInfect++;
						}
					}
					conn.commit();
					infectados += acumInfect; //Si se ejecuta el commit entonces sumamos los nuevos infectados
					
				} catch (SQLException e){
					System.out.println("Error en infectados del dia " + i); //Si hay algun error en los infectados sabremos que dia ha sido
				} finally {
					performCleanup();
				}
			}
		}
		
		return infectados;
	}
	// --------------------------------------------------------------------
	
	/**
	 * @param n_pokedex : la posicion en la pokedex en la que se encuentra el pokemon en cuestion.
	 * @param filename : path a la imagen que queremos como sprite.
	 * @return <true> si se puede aplicar un sprite a un pokemon, o <false> si falla o no lo consigue por alguna razon.
	 */
	public boolean getSprite(int n_pokedex, String filename){
		boolean stored = false;
		try {
			if (connect()) {
				String query = "SELECT sprite FROM especie WHERE n_pokedex = ?;";
				pst = conn.prepareStatement(query);
				Blob blob =  null;
				pst.setInt(1, n_pokedex);
				rs = pst.executeQuery();
				byte[] data = null;

				while(rs.next()) {
					blob = rs.getBlob("sprite");
					if (blob != null){
						data = blob.getBytes(1, (int) blob.length());
						System.out.println("Imagen Creada Con Exito!!");
					}
					else {
						System.out.println("No Existe La Imagen De Este Pokemon");
						return stored;
					}
				}
					
				FileOutputStream outputFileStream = new FileOutputStream(filename);
				outputFileStream.write(data);
				
				outputFileStream.close();
				stored = true;
			}		
		} catch (IOException e) {
			System.out.println("No se ha podido crear la imagen.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("No se ha podido obtener la imagen.");
			e.printStackTrace();
		} finally {
			performCleanup();
	}
	return stored;

	}
	// --------------------------------------------------------------------
	
} // END
