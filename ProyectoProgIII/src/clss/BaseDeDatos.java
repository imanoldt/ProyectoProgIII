package clss;

import java.sql.*;
import java.util.Date;
import java.util.TreeMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class BaseDeDatos {
	
public static Statement stmt;
public static ResultSet rs;
public static char[] com;
public static Connection con;
public static Logger logger = Logger.getLogger( "BaseDatos" );

/**
 * 
 * @param nombreBD Nombre de la base de datos
 * @return Devuelve la connection 
 * @throws SQLException 
 */
	public static Connection initBaseDatos(String nombreBD) throws SQLException {
		 con = null;

		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:" + nombreBD);
			logger.log( Level.INFO, "Abriendo conexión con " + nombreBD );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.log( Level.SEVERE, "Excepción", e );
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
				logger.log( Level.INFO, "Cerrando conexión" );
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.log( Level.SEVERE, "Excepción", e );
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
	
	
	public static boolean insertarCliente(Cliente cliente) {
		String sent = "insert into clientes (nombre, email, dni, direccion,codigoPostal,fecha_nac,sexo,usuario, contraseña ) values ('" + cliente.getNombre() + "','" + cliente.getEmail() 
		+ "','" + cliente.getDni() + "','" + cliente.getDireccion() + "','"+ cliente.getCodigoPostal() + "','" + cliente.getFechanac() + "','" + cliente.getSexo() +"','"+ cliente.getUsuario() + "','"+ cliente.getContrsenya() + "');";
		try {
			con = initBaseDatos("Clientes.db");
			Statement stmt = con.createStatement();
			logger.log( Level.INFO, "Statement: " + sent );
			stmt.executeUpdate(sent);
			closeBD(con);
			return true;
		} catch (SQLException e) {
			logger.log( Level.SEVERE, "Excepción", e );
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean insertarRopa( Articulo articulo) {
		String sent = "insert into ropa (codigo, tipo, talla, precio,sexo,marca,color) values ('" + articulo.getCodigo() + "','" + articulo.getTipo() 
		+ "','" + articulo.getTalla() + "','" + articulo.getPrecio() + "','"+ articulo.getSexo() + "','" + articulo.getMarca() + "','" + articulo.getColor() + "');";
		try {
			con = initBaseDatos("Clientes.db");
			Statement stmt = con.createStatement();
			logger.log( Level.INFO, "Statement: " + sent );
			stmt.executeUpdate(sent);
			closeBD(con);
			return true;
		} catch (Exception e) {
			logger.log( Level.SEVERE, "Excepción", e );
			e.printStackTrace();
			return true;
		}
		
	}
	
	
	public static void borrarRopa( int codigo) {
		String sentSQL = "delete from ropa where codigo = ('" + codigo + "')";
		try {
			
			con = BaseDeDatos.initBaseDatos("Clientes.db");
			Statement stmt = con.createStatement();
			logger.log( Level.INFO, "Statement: " + sentSQL);
			stmt.executeUpdate(sentSQL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeBD(con);
	}
	
	
	public static void comprobarInicioSesion(String usuario, String contraseña) {
		String sentSQL = "SELECT usuario, contraseña FROM clientes where usuario = '" + usuario+ "' AND contraseña = '" + contraseña + "' ";
		try  {
			
			con = BaseDeDatos.initBaseDatos("Clientes.db");
			stmt = con.createStatement();
			logger.log( Level.INFO, "Statement: " + sentSQL);
			rs = stmt.executeQuery(sentSQL);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeBD(con);
	}
	
	public static void comprobarCodigo(int codigo) {
		String sentSQL = "SELECT codigo FROM ropa where codigo = '" + codigo+ "' ";
		try  {
			
			con = BaseDeDatos.initBaseDatos("Clientes.db");
			stmt = con.createStatement();
			logger.log( Level.INFO, "Statement: " + sentSQL);
			rs = stmt.executeQuery(sentSQL);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeBD(con);
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
			stmt = con.createStatement();
			rs = stmt.executeQuery(sentSQL);
			while (rs.next()) { // Mientras no hayamos llegado al final del conjunto de resultados
				String nom = rs.getString("nombre");
				String eml = rs.getString("email");
				String dni = rs.getString("dni");
				String dir = rs.getString("direccion");
				int cod = rs.getInt("codigoPostal");
				String sex = rs.getString("sexo");
				String usu = rs.getString("usuario");
				String cont = rs.getString("contraseña");
				
//				Cliente cl = new Cliente(nom, eml, dni, dir, cod,Enum.valueOf(TipoSexo.class, sex), usu, cont);
//				tmCliente.put(dni, cl);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return tmCliente;
	}
	
	public static void crearTablas(Connection con) {
		String sent1 = "create table clientes (nombre string, email string, dni string, direccion string, codigoPostal integer, fecha nacimiento date, sexo string, usuario string, contraseña string)";
		
		
		Statement st = null;
		
		try {
			st = con.createStatement();
			st.executeUpdate(sent1);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

		
		public static void actualizaTabla(DefaultTableModel tabla) {
			
			try {
				con = BaseDeDatos.initBaseDatos("Clientes.db");
				String sentSQL = "SELECT * FROM ropa";
				logger.log( Level.INFO, "Statement: " + sentSQL );
				stmt = con.createStatement();
				rs = stmt.executeQuery(sentSQL);
			while (tabla.getRowCount()>0) tabla.removeRow(0);	
				
				while (rs.next()) {
					String codigo = rs.getString( "codigo" );
					String tipo = rs.getString( "tipo" );
					String talla = rs.getString( "talla" );
					String precio = String.valueOf(rs.getInt("precio"));
					String sexo = rs.getString("sexo");
					String marca = rs.getString("marca");
					String color = rs.getString("color");
					
					String tbData[] = {codigo,tipo, talla, precio, sexo, marca, color};
					System.out.println(tbData);
					tabla.addRow(tbData);			
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			closeBD(con);
	}
	
	
	public static void main(String[] args) {
		try {
			
			con = DriverManager.getConnection("jdbc:sqlite:Clientes.db");
			stmt = con.createStatement();
			rs = stmt.executeQuery("insert into ropa values (4, 'Zapatos','S',80,'HOMBRE','Adidas','Negro')");

			


			stmt.executeUpdate("create table clientes (nombre string, email string, dni string, direccion string, codigoPostal integer, fecha_nac date, sexo string, usuario string, contraseña string)");

		
			
	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	

}
