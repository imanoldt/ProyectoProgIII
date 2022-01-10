package clss;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestPedido {

	@Test
	public void testPedido() {
		ArrayList<Articulo> a1 = new ArrayList<>();
		ArrayList<Articulo> a2 = new ArrayList<>();
		a1.add(new Camiseta(1,TipoArticulo.Camiseta,Talla.M, 10, TipoSexo.HOMBRE, "Nike", "Gris", "rutaprueba" ));
		a1.add(new Sudadera(2,TipoArticulo.Sudadera,Talla.S, 35, TipoSexo.MUJER, "Jordan", "Negro", "ruta" ));
		Pedido p1 = new Pedido(a1);
		System.out.println(p1);
		assertEquals(p1.getArticulos(), a1);
		assertTrue(p1.getNumero_pedido() == 1);

		p1.setArticulos(a2);
		assertEquals(p1.getArticulos(), a2);
	}

}
