package windows;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;

import clss.Articulo;
import clss.BaseDeDatos;
import clss.Camiseta;
import clss.Cliente;
import clss.Pantalon;
import clss.Sudadera;
import clss.Talla;
import clss.TipoArticulo;
import clss.TipoSexo;
import clss.Zapatos;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BaseDatosTest {

	@Before
	public void setUp() throws Exception {
		BaseDeDatos.initBaseDatos( "test.db");
	}

	@After
	public void tearDown() throws Exception {
		BaseDeDatos.closeBD(BaseDeDatos.con);
	}
	
	@Test
	public void CrearTablas() throws SQLException {
		BaseDeDatos.crearTablas("test.db");
	}	
	
	
	
@Test
public void testInsertarClienteIncorrecto() throws SQLException {
	Cliente c1 = new Cliente("J'oseba", "joseba@opendeusto.es", "79002", "Calle a",4444, new Date(21/12/2021), TipoSexo.HOMBRE, "Josebaaa", "joseba", "avt1.png");
	assertFalse( BaseDeDatos.insertarCliente(c1));

	
}


@Test
public void testInsertarArticuloCorrecto() throws SQLException {
			Articulo a1 = new Camiseta(0,TipoArticulo.Camiseta, Talla.S, 0, TipoSexo.HOMBRE, "Test1", "Test1", "Test1");
			Articulo a2 = new Sudadera(1,TipoArticulo.Sudadera, Talla.M, 0, TipoSexo.HOMBRE, "Test2", "Test2", "Test2");
			Articulo a3 = new Pantalon(2,TipoArticulo.Pantalon, Talla.XL, 0, TipoSexo.HOMBRE, "Test3", "Test3", "Test3");
			Articulo a4 = new Zapatos(3,TipoArticulo.Zapatos, Talla.XXL, 0, TipoSexo.HOMBRE, "Test3", "Test4", "Test4");
			
			assertTrue( BaseDeDatos.insertarRopa( a1 ) );
			assertTrue( BaseDeDatos.insertarRopa( a2 ) );
			assertTrue( BaseDeDatos.insertarRopa( a3 ) );
			assertTrue( BaseDeDatos.insertarRopa( a4 ) );
			
			assertNotEquals(a1.getCodigo(), a2.getCodigo()); 
			assertNotEquals(a1.getCodigo(), a3.getCodigo()); 
			assertNotEquals(a2.getCodigo(), a3.getCodigo()); 
			assertEquals(a3.getMarca(), a4.getMarca());

	}
@Test
public void testInsertarClienteCorrecto() throws SQLException {
	Cliente c1 = new Cliente("Joseba", "joseba@opendeusto.es", "12345", "Calle a",4444, new Date(11/1205/2000), TipoSexo.HOMBRE, "Josebaaa", "joseba", "avt1.png");
	Cliente c2 = new Cliente("Iker", "iker@opendeusto.es", "13245", "Calle b",1234, new Date(15/12/2002), TipoSexo.HOMBRE, "Ikeer", "iker", "avt2.png");
	Cliente c3 = new Cliente("Imanol", "imanol@opendeusto.es", "14325", "Calle c",4432, new Date(21/06/2002), TipoSexo.HOMBRE, "Imanol1", "imanol", "avt4.png");
			
			assertTrue( BaseDeDatos.insertarCliente( c1 ) );
			assertTrue( BaseDeDatos.insertarCliente( c2 ) );
			assertTrue( BaseDeDatos.insertarCliente( c3 ) );
			
			assertNotEquals(c1.getUsuario(), c2.getUsuario()); 
			assertNotEquals(c1.getUsuario(), c3.getUsuario()); 
			assertNotEquals(c2.getUsuario(), c3.getUsuario()); 

	}
@Test
public void testtGetArticulos() throws SQLException {
	ArrayList<Articulo> articulos = BaseDeDatos.getArticulos();
	int cod = -1;
	int pre = -1;
	for (Articulo articulo : articulos) {
		assertTrue( articulo.getCodigo() > cod );
		assertTrue(articulo.getPrecio() > pre);
	}
}
@Test
public void testBorrarArticulo() throws SQLException {
	Articulo articuloBorrable = new Camiseta(0,TipoArticulo.Camiseta, Talla.S, 0, TipoSexo.HOMBRE, "Test", "Test", "Test");
	BaseDeDatos.borrarRopa( articuloBorrable.getCodigo() );

}


}