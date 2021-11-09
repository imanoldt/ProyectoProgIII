package clss;

import java.sql.*;
import java.util.TreeMap;


public class BaseDeDatos{
public static ResultSet rs;
public static Statement statment;

/**
 * 
 * @param nombreBD Nombre de la base de datos
 * @return Devuelve la connection 
 */
	public static Connection initBaseDatos(String nombreBD) {
		Connection con = null;

		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:" + nombreBD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}
/**
 * 
 * @param con Una conexión con una base de datos específica. Las sentencias SQL se ejecutan y los resultados se devuelven dentro del contexto de una conexión. 
 */
	public static void closeBD(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * El metodo insertarCliente crea un nuevo cliente y lo guarda en la base de datos.
	 * @param con Una conexión con una base de datos específica. Las sentencias SQL se ejecutan y los resultados se devuelven dentro del contexto de una conexión. Implementa la interfaz Connection para hacer el enlace con la Base de Datos
	 * @param nombre Atributo de la clase cliente (guarda el nombre)
	 * @param email Atributo de la clase cliente (guarda el email)
	 * @param dni Atributo de la clase cliente(guarda el dni)
	 * @param direccion Atributo de la clase cliente (guarda la direccion)
	 * @param codigoPostal Atributo de la clase cliente (guarda el codigo postal)
	 * @param edad Atributo de la clase cliente (guarda la edad de la persona)
	 * @param sexo Atributo de la clase cliente (guarda el sexo de la persona)
	 * @author imanoldt
	 */
	
	public static void insertarCliente(Connection con, String nombre, String email, String dni, String direccion,
			int codigoPostal, int edad, String sexo) {
		String sentSQL = "INSERT INTO cliente VALUES('" + nombre + "','" + email + "'," + dni + ",'" + direccion
				+ "', '" + codigoPostal + "', '" + edad + "', '" + sexo + "')";
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sentSQL);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * 
 * @param con Una conexión con una base de datos específica. Las sentencias SQL se ejecutan y los resultados se devuelven dentro del contexto de una conexión. 
 * @return Devuelve el treeMap de clientes 
 */
	

	public static TreeMap<String, Cliente> obtenerMapaClientes(Connection con) {
		TreeMap<String, Cliente> tmCliente = new TreeMap<>();

		String sentSQL = "SELECT * FROM cliente";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sentSQL);
			while (rs.next()) { // Mientras no hayamos llegado al final del conjunto de resultados
				String nom = rs.getString("dni");
				String eml = rs.getString("nombre");
				String dni = rs.getString("dni");
				String dir = rs.getString("nombre");
				String cod = rs.getString("dni");
				String sex = rs.getString("nombre");

				Cliente cl = new Cliente(nom, eml, dni, Enum.valueOf(TipoSexo.class, sex), dir, cod);
				tmCliente.put(dni, cl);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return tmCliente;
	}
	
	public static void main(String[] args) {
		try {
			Connection connection = null;
			connection = DriverManager.getConnection("jdbc:sqlite:Clientes.db");
			Statement statement = connection.createStatement();
			
//			statement.executeUpdate("drop table if exists cliente");
//			statement.executeUpdate("create table cliente (dni integer, name string, email string, sexo string, codPos string)");
//			statement.executeUpdate("insert into cliente values(311112, 'prueba', 'prueba@gmail.com', 'Hombre', '26849')");
			
			
//			statement.executeUpdate("drop table if exists clave");
//			statement.executeUpdate("create table clave (nombre string, contrasenya string)");
//			statement.executeUpdate("insert into clave values('admin', 'admin')");
			
			statement.executeUpdate("drop table if exists ropa");
			statement.executeUpdate("create table ropa (nombre string, talla integer, precio integer, sexo string, marca string, color string)");
			statement.executeUpdate("insert into ropa values('Sudadera gris nike', 'M', 35, 'Hombre', 'Nike', 'Gris')");
	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}
