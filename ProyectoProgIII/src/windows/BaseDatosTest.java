package windows;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.TreeMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import clss.BaseDeDatos;
import clss.Cliente;
import clss.TipoSexo;

public class BaseDatosTest {

	@Before
	public void setUp() throws Exception {
		BaseDeDatos.initBaseDatos( "test.bd");
	}

	@After
	public void tearDown() throws Exception {
		BaseDeDatos.closeBD(BaseDeDatos.con);
	}

	@Test
	public void testInsertarClienteIncorrecto() {
		// Cliente incorrecto por sintaxis inadecuada de nombre de cliente
		Cliente c1 = new Cliente("O'Neil", "joseba@opendeusto.es", "79002", "Calle a",4444, new Date(21/12/2021), TipoSexo.HOMBRE, "Josebaaa", "joseba", "avt1.png");
		assertFalse( BaseDeDatos.insertarCliente(c1));
	}

//	@Test
//	public void testInsertarClienteCorrecto() {
//		ArrayList<Producto> lP = BaseDatos.getProductos();
//		ArrayList<Compra> lC = BaseDatos.getCompras(lP);
//		int codMayor = 0;
//		for (Compra c : lC) {
//			if (c.getId() > codMayor) {
//				codMayor = c.getId();
//			}
//		}
//		assertTrue( codMayor >= lC.size() );
//		Cliente c1 = new Cliente();
//		Compra compraCorr = new Compra( 0, System.currentTimeMillis(), "Test", 1, new Producto( 1, "Test", 100, new ArrayList<>() ) );
//		assertTrue( BaseDatos.insertarCompra( compraCorr ) );
//		assertTrue( compraCorr.getId() > codMayor );
//	}
	
	
//	@Test
//	public void testBorrarCompra() {
//		Compra compraBorrable = new Compra( 1, 0, "", 1, new Producto( 1, "", 0, new ArrayList<>() ) );
//		try {
//			BaseDatos.borrarCompra( compraBorrable );
//		} catch (SQLException e) {
//			fail( "Error en borrado de compra correcta" );
//		}
//		Compra compraNoBorrable = new Compra( 99, System.currentTimeMillis(), "Test", 1, new Producto( 1, "Test", 100, new ArrayList<>() ) );
//		try {
//			BaseDatos.borrarCompra( compraNoBorrable );
//			fail( "No hay error en borrado de compra incorrecta" );
//		} catch (SQLException e) {
//		}
//	}
}