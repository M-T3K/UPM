import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// My Imports
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AsociacionCervecera {

	// Definicion de la Estructura de Datos para almacenar los empleados

	static private class Empleado {
		
		//Attributes changed to private
		private int idEmpleado; // INT
		private String name; 	// VARCHAR[50]
		private String dir; 	// VARCHAR[100]
		private String tlfn;	// VARCHAR[15]
		private float salario;  // FLOAT
		private int idBar;  	//

		public Empleado(int idEmpleado, String name, String dir, String tlfn, float salario, int idBar) {
			this.idEmpleado = idEmpleado;
			this.name = name;
			this.dir = dir;
			this.tlfn = tlfn;
			this.salario = salario;
			this.idBar = idBar;
		}

		public int getIdEmpleado() {
			return idEmpleado;
		}

		public void setIdEmpleado(int idEmpleado) {
			this.idEmpleado = idEmpleado;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDir() {
			return dir;
		}

		public void setDir(String dir) {
			this.dir = dir;
		}

		public String getTlfn() {
			return tlfn;
		}

		public void setTlfn(String tlfn) {
			this.tlfn = tlfn;
		}

		public float getSalario() {
			return salario;
		}

		public void setSalario(float salario) {
			this.salario = salario;
		}

		public int getIdBar() {
			return idBar;
		}

		public void setIdBar(int idBar) {
			this.idBar = idBar;
		}
		
	};
	// -------------------------------------------------------------------------------------

	// Estructura de Datos para almacenar todo lo que concierne a un Fabricante.
	static private class Fabricante {
		
		// Attributes changed to private
		private int idFabricante; // INT
		private String name; 	  // VARCHAR[50]
		private String tlfn; 	  // VARCHAR[15]
		private String email;	  // VARCHAR[100]

		public Fabricante(int idFabricante, String name, String tlfn, String email) {
			this.idFabricante = idFabricante;
			this.name = name;
			this.tlfn = tlfn;
			this.email = email;
		}

		// Setter and getters included
		
		public int getIdFabricante() {
			return idFabricante;
		}

		public void setIdFabricante(int idFabricante) {
			this.idFabricante = idFabricante;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTlfn() {
			return tlfn;
		}

		public void setTlfn(String tlfn) {
			this.tlfn = tlfn;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
	}
	// -------------------------------------------------------------------------------------


	// Otros miembros
	private static Connection conn;
	
	// Main Method
	public static void main(String[] args) {
		AsociacionCervecera ac = new AsociacionCervecera();
		
		ac.mainMenu();
		
		
		// DBclose() tras finalizar mainMenu()
		ac.DBclose();
		
	}
	// -------------------------------------------------------------------------------------



	// Other Methods

	/*
	* @return : Devuelve 'true' si es capaz de establecer una conexion y 'false' si hay algun tipo de error o si ya habia una conexion abierta previamente.
	*/
	public boolean DBconnect() {

		String driver = "com.mysql.jdbc.Driver";

		try {

			Class.forName(driver);

			if (conn == null) {

				String serverAddress = "localhost:3306";
				String usr = "bd";
				String pwd = "bdupm";
				String name = "AsociacionCervecera";
				String url = "jdbc:mysql://" + serverAddress + "/" + name;
				conn = DriverManager.getConnection(url, usr, pwd);

				System.out.println("Conectado a base de datos");

				return true;
			}
		} 
		catch (SQLException e) {
			//e.printStackTrace();
			System.err.println("Mensaje: "    + e.getMessage());
			System.err.println("C�digo: "     + e.getErrorCode());
			System.err.println("Estado SQL: " + e.getSQLState() );
			
		}
		catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Driver no encontrado");
		}

		return false;
	}
	// -------------------------------------------------------------------------------------

	/*
	* @return: 'true' si es capaz de cerrar la conexion y 'false' si no.
	*/
	public boolean DBclose() {

		try {

			if (!conn.isClosed() && conn != null) {
				conn.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	// -------------------------------------------------------------------------------------

	/*
	* @return: 'true' si se puede crear la tabla y 'false' si la tabla no se ha podido crear o ya existe.
	*/
	public boolean createTableEmpleado() {
		
		DBconnect();
		
		String sql = "CREATE TABLE empleado (ID_empleado INT , nombre VARCHAR(50) NOT NULL, direccion VARCHAR(100), telefono VARCHAR(15) UNIQUE, salario FLOAT, ID_bar INT, PRIMARY KEY(ID_EMPLEADO), FOREIGN KEY(ID_bar) REFERENCES bar (ID_bar) ON DELETE CASCADE ON UPDATE CASCADE);";

		Statement st = null;

		try {

			st = conn.createStatement();
			st.execute(sql);
			st.close();
		}
		catch (SQLException ex) {
			//e.printStackTrace();
			System.err.println("La tabla empleado ya existe");
			System.err.println("Mensaje: "    + ex.getMessage());
			System.err.println("C�digo: "     + ex.getErrorCode());
			System.err.println("Estado SQL: " + ex.getSQLState() );

			try {
				if( st != null) {
					st.close();
				}
			}
			catch(SQLException e) {

				System.err.println("Mensaje: "    + e.getMessage());
				System.err.println("C�digo: "     + e.getErrorCode());
				System.err.println("Estado SQL: " + e.getSQLState() );
			}
			finally {
				return false;
			}
		}

		return true;
	}
	// -------------------------------------------------------------------------------------

	/*
	* @return: 'true' si se puede crear la tabla y 'false' si la tabla no se ha podido crear o ya existe.
	*/
	public boolean createTableGusta() {
		
		DBconnect();
		
		String sql = "CREATE TABLE gusta (ID_socio INT, ID_cerveza INT, ID_bar INT, PRIMARY KEY(ID_socio,ID_cerveza,ID_bar), FOREIGN KEY(ID_socio) REFERENCES socio (ID_socio) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY(ID_cerveza) REFERENCES cerveza (ID_cerveza) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY(ID_bar) REFERENCES bar (ID_bar) ON DELETE CASCADE ON UPDATE CASCADE);";

		Statement st = null;

		try {

			st = conn.createStatement();
			st.execute(sql);
			st.close();
		}
		catch (SQLException ex) {
			//e.printStackTrace();
			System.err.println("La tabla gusta ya existe");
			System.err.println("Mensaje: "    + ex.getMessage());
			System.err.println("C�digo: "     + ex.getErrorCode());
			System.err.println("Estado SQL: " + ex.getSQLState() );

			try {
				if( st != null) {
					st.close();
				}
			}
			catch(SQLException e) {

				System.err.println("Mensaje: "    + e.getMessage());
				System.err.println("C�digo: "     + e.getErrorCode());
				System.err.println("Estado SQL: " + e.getSQLState() );
			}
			finally {
				return false;
			}
		} 
		
		catch (Exception e) {
			return false;
		}
		
		return true;
	}
	// -------------------------------------------------------------------------------------


	/*
	* @return 'true' si inserta todos los empleados requeridos a una transicion por insercion, y 'false' si no es posible realizar todas las inserciones.
	*/
	public boolean loadEmpleados() {

		DBconnect(); // Nos conectamos a la Base de Datos

		// Inicializamos los empleados para usarlo posteriormente
		Empleado[] empleados = { 
				new Empleado(1,  "Carmen Martín", "C/ Sol, 1",		"699999999", (float) 1600.00, 1),
				new Empleado(2, "Ana Ruiz", 	  "C/ Luna, 2 ",    "699999988", (float) 1300.00, 2),
				new Empleado(3, "Mario Moreno",   "C/ Estrella, 3", "699999977", (float) 1200.00, 2),
				new Empleado(4, "Laura Romero",   "C/ Mercurio, 4", "699999966", (float) 1450.00, 3),
				new Empleado(5, "Luis Ruiz", 	  "C/ Venus, 5",    "699999955", (float) 1350.00, 3),
				new Empleado(6, "Benito Gil", 	  "C/ Marte, 6",    "699999944", (float) 1500.00, 3),
				new Empleado(7, "Dolores Molina", "C/ Júpiter, 7",  "699999933", (float) 1350.00, 4),
				new Empleado(8, "Julio Garrido",  "C/ Júpiter, 7",  "699999922", (float) 1350.00, 4),
				new Empleado(9, "Pilar Romero",   "C/ Saturno, 8",  "699999911", (float) 1650.00, 5) 
		};

		PreparedStatement pt = null;

		try {
			
			String SQL = "INSERT INTO empleado(ID_empleado,nombre,direccion,telefono,salario,ID_bar) VALUES (?,?,?,?,?,?)";
			pt = conn.prepareStatement(SQL);

			// Iteramos por todos los empleados y preparamos el Statement
			for (int i = 0; i < empleados.length; ++i) {
				pt.setInt(1, empleados[i].getIdEmpleado());
				pt.setString(2,empleados[i].getName());
				pt.setString(3,empleados[i].getDir());
				pt.setString(4,empleados[i].getTlfn());
				pt.setFloat(5, empleados[i].getSalario());
				pt.setInt(6, empleados[i].getIdBar());
				pt.executeUpdate(); // Ejecutamos el update
			}
		}
		catch (SQLException ex) {
			System.err.println("Inserci�n fallida");
			System.err.println("Mensaje: "    + ex.getMessage());
			System.err.println("C�digo: "     + ex.getErrorCode());
			System.err.println("Estado SQL: " + ex.getSQLState() );

			try {
				if( pt != null) {
					pt.close();
				}
			}
			catch(SQLException e) {
				System.err.println("Mensaje: "    + e.getMessage());
				System.err.println("C�digo: "     + e.getErrorCode());
				System.err.println("Estado SQL: " + e.getSQLState() );
			}
			finally {
				return false;
			}
		}

		return true;
	}
	// -------------------------------------------------------------------------------------

	/*
	* @return: Carga los datos del fichero especificado por "fileName", y los inserta en la base de datos. Devuelve 'true' si se consigue insertar 
	*    	   los datos, y 'false' si no. En el caso de que no se puedan insertar, la base de datos no se cambia.
	*/
	public boolean loadGustos(String fileName) {
		
		DBconnect();
		
		ArrayList<Gusto> g = readData(fileName);
		String SQL = "INSERT INTO gusta (ID_socio,ID_cerveza,ID_bar) VALUES(?,?,?);";

		PreparedStatement statement = null;

		try {
			
			statement = conn.prepareStatement(SQL);
			//Se hace commit solo cuando indicado
			conn.setAutoCommit(false);	

			for (Gusto gus : g) {

				statement.setInt(1, gus.getIdSocio());
				statement.setInt(2, gus.getIdCerveza());
				statement.setInt(3, gus.getIdBar());
				statement.executeUpdate();
			}
			
			// Confirmamos los cambios
			conn.commit();
			//Restauramos el autocommit
			conn.setAutoCommit(true);
			statement.close(); // Avoid memleak

		} catch (SQLException ex) {
			
			//ex.printStackTrace();
			try {

				conn.rollback();
				conn.setAutoCommit(true);
				statement.close();
				System.err.println("Inserci�n fallida, vuelta al estado alterior");
				System.err.println("Mensaje: "    + ex.getMessage());
				System.err.println("C�digo: "     + ex.getErrorCode());
				System.err.println("Estado SQL: " + ex.getSQLState() );
			}
			catch(SQLException e) {
				System.err.println("Rollback Fallido");
				System.err.println("Mensaje: "    + e.getMessage());
				System.err.println("C�digo: "     + e.getErrorCode());
				System.err.println("Estado SQL: " + e.getSQLState() );
			}
			finally {
				return false;
			}
			
		}
				
		return true;
	}
	// -------------------------------------------------------------------------------------

	/*
	* @return: Almacena todos los bares de la tabla 'bares' en un ArrayList<Bar>. Si no hay bares, se devuelve vacia.
	* 		   Devuelve 'null' si ocurre algun error.
	*/
	public ArrayList<Bar> getBarData() {
		
		DBconnect();
		
		ArrayList<Bar> bars = new ArrayList<Bar>();
		String SQL = "SELECT * FROM bar;";
		Statement statement = null;
		ResultSet res= null;

		try {
			statement = conn.prepareStatement(SQL);
			res = statement.executeQuery(SQL);

			while (res.next()) {
				Bar bar = new Bar(res.getInt(1), res.getString(2), res.getString(3));
				bars.add(bar);
			}
			statement.close();
			res.close();
		} catch (SQLException ex) {
			//ex.printStackTrace();
			System.err.println("Mensaje de error: "+ex.getMessage());
			System.err.println("Codigo de error: "+ex.getErrorCode());
			System.err.println("Estado SQL: "+ex.getSQLState());

			try {
				if( statement != null) {

					statement.close();
				}
			}
			catch(SQLException e) {
				System.err.println("Mensaje de error: "+e.getMessage());
				System.err.println("Codigo de error: "+e.getErrorCode());
				System.err.println("Estado SQL: "+e.getSQLState());
			}
			finally {
				return null;
			}
		}

		return bars;
	}
	// -------------------------------------------------------------------------------------

	/*
	* @return : Lista al usuario la lista de todos los fabricantes, y le pide que elija uno;
	* 			Devuelve un ArrayList<Cerveza> conteniendo todas las Cervezas de este mismo fabricante.
	* 			Esta lista estara vacia cuando no hay fabricantes o cervezas de este fabricante.
	* 			Asimismo, esta lista sera 'null' cuando ocurra algun error.
	*/
	public ArrayList<Cerveza> getCervezasFabricante() {

		DBconnect();
		
		ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>(); // Para evitar acceder multiples veces a la misma base de datos,
																		 // ya que seria un poco redundante
		String SQL = "SELECT * FROM fabricante;";
		Statement statement = null;
		ResultSet res = null; 

		// Primera Parte: Obtenemos todos los fabricantes de cervezas y los almacenamos (para que despues no tengamos que acceder nuevamente a la base de datos)
		// ya que seria redundante.
		try {
			statement = conn.prepareStatement(SQL);
			res = statement.executeQuery(SQL);

			while(res.next()) {
				Fabricante fab = new Fabricante(res.getInt(1), res.getString(2), res.getString(3), res.getString(4));
				fabricantes.add(fab);
			}
			statement.close();
			res.close();
		}
		catch(SQLException ex) {
			System.err.println("Mensaje de error: "+ex.getMessage());
			System.err.println("Codigo de error: "+ex.getErrorCode());
			System.err.println("Estado SQL: "+ex.getSQLState());
			try {
				if( statement != null) {

					statement.close();
				}
			}
			catch(SQLException e) {
				System.err.println("Mensaje de error: "+e.getMessage());
				System.err.println("Codigo de error: "+e.getErrorCode());
				System.err.println("Estado SQL: "+e.getSQLState());
			}
			finally {
				return null;
			}
		}

		// Parte 2: Imprimimos todos los fabricantes en pantalla.
		Scanner scan = new Scanner(System.in);
		boolean selected = false; // Ha seleccionado el usuario un fabricante valido?
		int chosen = -1;
		while( !selected) {
			System.out.println("Por favor, seleccione uno de los siguientes fabricantes:");
			int i;
			for( i = 0; i < fabricantes.size(); ++i) {
				System.out.printf("%d) Fabricante %s\n", i, fabricantes.get(i).name); // Aqui empezara la lista en 0, aunque quiza eso podria ser confuso
			}
			
			// Hemos decidido que se pueda elegir por los numeros asignados a cada nombre.
			chosen = scan.nextInt();
			if( chosen < 0 || chosen > i) {
				System.out.println("ERROR: Ese fabricante no es uno valido.");				
			}
			else {
				selected = true;
				chosen = fabricantes.get(chosen).getIdFabricante(); // Realmente lo que nos interesa es la id del fabricante.
			}
		}

		// Si cerramos este Scan nos salta una excepcion en la seccion inmutable del codigo proporcionado
		// scan.close(); 

		// Ya no necesitamos la lista de fabricantes por lo que nullificamos todos los punteros para que el GC vacie memoria
		fabricantes.clear();
		// Aqui creamos las cervezas
		ArrayList<Cerveza> cervezas = new ArrayList<Cerveza>();

		// Acceso a la siguiente base de datos para obtener los fabricantes
		SQL = "SELECT * FROM cerveza WHERE ID_fabricante=?;";
		
		PreparedStatement pt = null;
		try {
			pt = conn.prepareStatement(SQL);
			pt.setInt(1, chosen);
			res = pt.executeQuery(SQL);
			while(res.next()) {
				Cerveza c = new Cerveza(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4));
				if(c.getIdFabricante() == chosen) {
					cervezas.add(c);
				}
			}
			pt.close();
			res.close();
		}
		catch(SQLException ex) {
			// ex.printStackTrace();
			System.err.println("Mensaje de error: "+ex.getMessage());
			System.err.println("Codigo de error: "+ex.getErrorCode());
			System.err.println("Estado SQL: "+ex.getSQLState());

			try {
				if( pt != null) {

					pt.close();
				}
			}
			catch(SQLException e) {
				System.err.println("Mensaje de error: "+e.getMessage());
				System.err.println("Codigo de error: "+e.getErrorCode());
				System.err.println("Estado SQL: "+e.getSQLState());
			}
			finally {
				return null;
			}
		}
		
		return cervezas;
	}


	/*
	* @return : Retorna un ArrayList<Cerveza> con el 10% (truncado) de las cervezas mas populares segun la cantidad de gustos 
	*     		en la tabla "gusta".
	* 			Si no hay cervezas suficientes, devuelve un ArrayList<Cerveza> vacio.
	* 			Si hay alguna excepcion, devuelve 'null'.
	*/
	public ArrayList<Cerveza> getCervezasPopulares() {
		
		// Iniciamos la conexion
		DBconnect();
		
		// Variables que se van a usar durante todo el metodo
		ArrayList<Cerveza> cervezas = new ArrayList<Cerveza>();
		Statement st    		    = null;
		PreparedStatement ps  		= null; 
		ResultSet rs 				= null;
		// ? Hace falta asegurarse de que cada cerveza es unica?
		String SQL 					= "SELECT COUNT(DISTINCT ID_cerveza) FROM cerveza;"; 
		int size = 0; // Indica el tamano de la base de datos, usado para calcular el 10%
		
		try {

			// Obtenemos el size

			st = conn.createStatement();
			rs = st.executeQuery(SQL);
			rs.next();
			size =  rs.getInt(1); // Solo deberia haber un resultado, asi que guardamos la primera col
			rs.close(); // Ya no es necesario, evitamos memleak
			st.close();
			int percent = (int)(size / 10);
			// El resultado de calcular el 10% debe realizarse sobre la totalidad
			// de las cervezas y se debe truncar como método de redondeo (redondeo a la baja)
			if( percent == 0) {
				return cervezas; // Devolvemos vacio
			}

			// Nos hemos asegurado de que hay al menos 10 cervezas
			// o en otras palabras, de que el 10% es al menos 1

			// Preparamos la siguiente query, que debera hacer lo siguiente:
			// 1) Mirar cada cerveza.
			// 2) Para cada una de las cervezas buscar la cantidad de "gustos" que tiene
			// 3) Ordenar en funcion de ese campo
			// 4) Elegir el 10%
			
			// SELECT c.ID_cerveza,nombre,caracteristicas,ID_fabricante FROM cerveza AS c, : Cogemos loscampos que nos interesan de la tabla de cerveza
			// (SELECT DISTINCT ID_cerveza,ID_socio FROM gusta  : Elegimos los campos de la tabla gusta que nos interesan y que sean distintos
			// GROUP BY ID_cerveza ORDER BY COUNT(*) DESC) AS tab : Los agrupamos (juntamos) segun la ID_cerveza y los ordenamos por su valor de gusto
			// WHERE c.ID_cerveza=tab.ID_cerveza LIMIT ?; : Nos aseguramos de que las ID_cerveza sean iguales y Limitamos al numero de entradas ?

			SQL = "SELECT c.ID_cerveza,nombre,caracteristicas,ID_fabricante FROM cerveza AS c,(SELECT DISTINCT ID_cerveza,ID_socio FROM gusta GROUP BY ID_cerveza ORDER BY COUNT(*) DESC) AS tab WHERE c.ID_cerveza=tab.ID_cerveza LIMIT ?;";
			ps = conn.prepareStatement(SQL); // Preparamos el Statement
			ps.setInt(1, percent); //  Especificamos que el limite de entradas sea "percent"
			rs = ps.executeQuery(); // Ejecutamos y almacenamo resultados
			
			while(rs.next()) {

				Cerveza c = new Cerveza(rs.getInt("ID_cerveza"), rs.getString("nombre"), rs.getString("caracteristicas"), rs.getInt("ID_fabricante"));
				cervezas.add(c);
			}

		}
		catch(SQLException ex) {
			// ex.printStackTrace();
			System.err.println("Mensaje de error: "+ex.getMessage());
			System.err.println("Codigo de error: "+ex.getErrorCode());
			System.err.println("Estado SQL: "+ex.getSQLState());
			return null;
		}
		finally {

			// Cerramos todo lo que no este cerrado para evitar posibles memory Leaks
			try {
				if(st != null) {
					st.close(); // Cierre de Statement
				}
				if(ps != null) {
					ps.close(); // Cierre de PreparedStatement
				}
				if(rs != null) {
					rs.close(); // Cierre de ResultSet
				}
			}
			catch( SQLException ex) {
				// ex.printStackTrace();
				System.err.println("Mensaje de error: "+ex.getMessage());
				System.err.println("Codigo de error: "+ex.getErrorCode());
				System.err.println("Estado SQL: "+ex.getSQLState());
			}
		}

		return cervezas;
	}


	/*
	* @return : 'true' si se anade una columna para una imagen sin ningun problema. 'false' si se encontro algun problema.
	*/
	public boolean addFotoColumn() {
		
		DBconnect();
		
		String SQL = "ALTER TABLE empleado ADD COLUMN foto LONGBLOB NULL AFTER ID_bar;";
		
		Statement statement = null;

		try {

			statement = conn.createStatement();
			statement.execute(SQL);
			statement.close();
		}
		catch (SQLException ex) {
			//e.printStackTrace();
			System.err.println("La columna ya existe");
			System.err.println("Mensaje: "    + ex.getMessage());
			System.err.println("C�digo: "     + ex.getErrorCode());
			System.err.println("Estado SQL: " + ex.getSQLState() );

			try {
				if(statement != null) { // Si fallo antes de poder cerrar el statement, lo cerramos
					statement.close();
				}
			}
			catch(SQLException e) {
				System.err.println("Mensaje: "    + e.getMessage());
				System.err.println("C�digo: "     + e.getErrorCode());
				System.err.println("Estado SQL: " + e.getSQLState() );
			}
			finally {
				return false;
			}
		}

		return true;
	}


	/*
	* @return : 'true' si se anade una imagen como archivo binario a la base de datos bajo la columna "foto". 'false' si hay algun error.
	*/
	public boolean addEmpleadoFoto() {
		
		DBconnect();
		
		PreparedStatement pst = null;

		try {

			String SQL = "INSERT INTO empleado (ID_empleado, nombre, direccion, telefono, salario, ID_bar, foto) VALUES (?,?,?,?,?,?,?);";
			pst = conn.prepareStatement(SQL);
		
			pst.setInt(1, 10);
			pst.setString(2, "Homer Simpson");
			pst.setString(3, "742 Evergreen Terrace");
			pst.setString(4, null);
			pst.setFloat(5, 1500.00f);
			pst.setInt(6, 1);
		
			File file = new File("HomerSimpson.jpg");
			FileInputStream fis = new FileInputStream(file);
			pst.setBinaryStream(7, fis, (int)file.length());
			pst.executeUpdate();
			pst.close();
		}
		catch (SQLException e) {
			//e.printStackTrace();
			System.err.println("Mensaje: "    + e.getMessage());
			System.err.println("C�digo: "     + e.getErrorCode());
			System.err.println("Estado SQL: " + e.getSQLState() );
			return false;
		}
		catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.err.println("Fichero no encontrado");
			return false;
		}

		return true;
	}


	// END OF CLASS CODE

	/*
	 * The private section of the code starts here. It is convenient to take a
	 * glance to the code, but it is STRICTLY FORBIDDEN to modify any part of the
	 * code bellow these lines.
	 * 
	 * Aqu� comienza la parte "privada" del c�digo. Es conviniente echar un vistazo
	 * al c�digo, pero est� ESTR�CTICAMENTE PROHIBIDO modificar cualquier parte del
	 * c�digo bajo estas l�neas.
	 */

	private void mainMenu() {
		Scanner sc = new Scanner(System.in);
		char menuOption = 'a';

		// Main menu loop
		do {
			System.out.println("Escoja una opci�n: ");
			System.out.println("  1) Crear las tablas \"empleado\" y \"gusta\".");
			System.out.println("  2) Cargar datos de los empleados y los gustos.");
			System.out.println("  3) Listar los bares almacenados.");
			System.out.println("  4) Listar las cervezas de un fabricante.");
			System.out.println("  5) Listar las cervezas m�s populares.");
			System.out.println("  6) A�adir columna de foto a la tabla \"empleado\".");
			System.out.println("  7) A�adir un nuevo empleado con foto.");
			System.out.println("  0) Salir de la aplicaci�n.");

			// Read user's option and check that it is a valid option
			menuOption = 'a';
			do {
				String line = sc.nextLine();
				if (line.length() == 1) {
					menuOption = line.charAt(0);
				}
				if (menuOption < '0' || menuOption > '7') {
					System.out.println("Opci�n incorrecta.");
				}
			} while (menuOption < '0' || menuOption > '7');

			ArrayList<Cerveza> cervezas;
			Cerveza c = new Cerveza();
			ArrayList<Bar> bars = getBarData();
			Bar b = new Bar();

			// Call a specific method depending on the option
			switch (menuOption) {
			case '1':
				System.out.println("Creando tabla \"empleado\"...");
				createTableEmpleado();
				System.out.println("Creando tabla \"gusta\"...");
				createTableGusta();
				break;
			case '2':
				System.out.println("Cargando datos de la tabla \"empleado\"...");
				loadEmpleados();
				System.out.println("Cargando datos de la tabla \"gusta\"...");
				loadGustos("gustos.csv");
				break;
			case '3':
				bars = getBarData();
				System.out.println(b.barsToString(bars) + '\n');
				break;
			case '4':
				cervezas = getCervezasFabricante();
				System.out.println(c.cervezasToString(cervezas) + '\n');
				break;
			case '5':
				cervezas = getCervezasPopulares();
				System.out.println(c.cervezasToString(cervezas) + '\n');
				break;
			case '6':
				System.out.println("A�adiendo columa \"foto\" en la tabla \"empleado\"...");
				addFotoColumn();
				break;
			case '7':
				System.out.println("A�adiendo un nuevo empleado con foto...");
				addEmpleadoFoto();
				break;
			}

			if (menuOption != '0')
				System.out.println("�Qu� m�s desea hacer?");
			else
				System.out.println("�Hasta pronto!");
		} while (menuOption != '0');

		sc.close();
	}

	private ArrayList<Gusto> readData(String fileName) {
		File f = new File(fileName);
		ArrayList<Gusto> result = new ArrayList<Gusto>();

		try {
			Scanner sc_file = new Scanner(f);

			while (sc_file.hasNextLine()) {
				String[] fields = sc_file.nextLine().split(";");
				Gusto row = new Gusto(Integer.valueOf(fields[0]), Integer.valueOf(fields[1]),
						Integer.valueOf(fields[2]));
				result.add(row);
			}

			sc_file.close();
		} catch (Exception e) {
			System.err.println("Error al leer el fichero.");
		}

		return result;
	}

	static private class Bar {
		private int idBar;
		private String nombre;
		private String direccion;

		public Bar() {
			setIdBar(0);
			setNombre("");
			setDireccion("");
		}

		public Bar(int idBar, String nombre, String direccion) {
			setIdBar(idBar);
			setNombre(nombre);
			setDireccion(direccion);
		}

		public int getIdBar() {
			return idBar;
		}

		public void setIdBar(int idBar) {
			this.idBar = idBar;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String barsToString(ArrayList<Bar> bars) {
			String result = "Listado de bares: \n";
			if (bars != null)
				for (Bar bar : bars) {
					result = result + "  " + bar.idBar + " - " + bar.nombre + " - " + bar.direccion + "\n";
				}
			return result;
		}
	}

	static private class Cerveza {
		private int idCerveza;
		private String nombre;
		private String caracteristicas;
		private int idFabricante;

		public Cerveza() {
			setIdCerveza(0);
			setNombre("");
			setCaracteristicas("");
			setIdFabricante(0);
		}

		public Cerveza(int id, String n, String c, int idFabricante) {
			setIdCerveza(0);
			setNombre(n);
			setCaracteristicas(c);
			setIdFabricante(idFabricante);
		}

		public int getIdCerveza() {
			return idCerveza;
		}

		public void setIdCerveza(int idCerveza) {
			this.idCerveza = idCerveza;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCaracteristicas() {
			return caracteristicas;
		}

		public void setCaracteristicas(String caracteristicas) {
			this.caracteristicas = caracteristicas;
		}

		public int getIdFabricante() {
			return idFabricante;
		}

		public void setIdFabricante(int idFabricante) {
			this.idFabricante = idFabricante;
		}

		public String cervezasToString(ArrayList<Cerveza> cervezas) {
			String result = "Listado de cervezas: \n";
			if (cervezas != null)
				for (Cerveza c : cervezas) {
					result = result + "  " + c.idCerveza + " - " + c.nombre + " - " + c.caracteristicas + " - "
							+ c.idFabricante + "\n";
				}
			return result;
		}
	}

	static private class Gusto {
		private int idSocio;
		private int idCerveza;
		private int idBar;

		public Gusto() {
			setIdSocio(0);
			setIdCerveza(0);
			setIdBar(0);
		}

		public Gusto(int socio, int cerveza, int bar) {
			setIdSocio(socio);
			setIdCerveza(cerveza);
			setIdBar(bar);
		}

		public int getIdSocio() {
			return idSocio;
		}

		public void setIdSocio(int socio) {
			idSocio = socio;
		}

		public int getIdCerveza() {
			return idCerveza;
		}

		public void setIdCerveza(int cerveza) {
			idCerveza = cerveza;
		}

		public int getIdBar() {
			return idBar;
		}

		public void setIdBar(int bar) {
			idBar = bar;
		}
	}

}
