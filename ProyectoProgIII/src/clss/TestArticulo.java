package clss;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArticulo {

	@Test
	public void testCamiseta() {
		Articulo p1 = new Camiseta(1,TipoArticulo.Camiseta,Talla.M, 10, TipoSexo.HOMBRE, "Nike", "Gris", "rutaprueba" );
		Articulo p2 = new Camiseta();
		assertTrue(p1.getCodigo()==1);
		assertTrue(p1.getTipo()== TipoArticulo.Camiseta);
		assertTrue(p1.getTalla()== Talla.M);
		assertTrue(p1.getPrecio()==10);
		assertTrue(p1.getSexo()==TipoSexo.HOMBRE);
		assertTrue(p1.getMarca()=="Nike");
		assertTrue(p1.getColor()=="Gris");
		assertTrue(p1.getImagen()=="rutaprueba");
		
		p2.setCodigo(2);
		assertTrue(p2.getCodigo() == 2);
		
		p2.setTipo(TipoArticulo.Camiseta);
		assertTrue(p2.getTipo() == TipoArticulo.Camiseta);
		assertTrue(p2.getCodigo() == 2);
		
		p2.setTalla(Talla.L);
		assertTrue(p2.getTalla()== Talla.L);
		
		p2.setPrecio(50);
		assertTrue(p2.getPrecio()==50);
		
		p2.setSexo(TipoSexo.MUJER);
		assertTrue(p2.getSexo()==TipoSexo.MUJER);
		
		p2.setMarca("Adidas");
		assertTrue(p2.getMarca()=="Adidas");
		
		p2.setColor("Blanco");
		assertTrue(p2.getColor()=="Blanco");
		
		p2.setImagen("PRUEBA2");
		assertTrue(p2.getImagen()=="PRUEBA2");
	}
	
	@Test
	public void testPantalon() {
		Articulo p1 = new Pantalon(1,TipoArticulo.Pantalon,Talla.L, 10, TipoSexo.HOMBRE, "Nike", "Gris", "rutaprueba" );
		Articulo p2 = new Pantalon();
		assertTrue(p1.getCodigo()==1);
		assertTrue(p1.getTipo()== TipoArticulo.Pantalon);
		assertTrue(p1.getTalla()== Talla.L);
		assertTrue(p1.getPrecio()==10);
		assertTrue(p1.getSexo()==TipoSexo.HOMBRE);
		assertTrue(p1.getMarca()=="Nike");
		assertTrue(p1.getColor()=="Gris");
		assertTrue(p1.getImagen()=="rutaprueba");
		
		p2.setCodigo(2);
		assertTrue(p2.getCodigo() == 2);
		
		p2.setTipo(TipoArticulo.Pantalon);
		assertTrue(p2.getTipo() == TipoArticulo.Pantalon);
		assertTrue(p2.getCodigo() == 2);
		
		p2.setTalla(Talla.L);
		assertTrue(p2.getTalla()== Talla.L);
		
		p2.setPrecio(50);
		assertTrue(p2.getPrecio()==50);
		
		p2.setSexo(TipoSexo.MUJER);
		assertTrue(p2.getSexo()==TipoSexo.MUJER);
		
		p2.setMarca("Adidas");
		assertTrue(p2.getMarca()=="Adidas");
		
		p2.setColor("Blanco");
		assertTrue(p2.getColor()=="Blanco");
		
		p2.setImagen("PRUEBA2");
		assertTrue(p2.getImagen()=="PRUEBA2");
	}
	
	@Test
	public void testSudadera() {
		Articulo p1 = new Sudadera(1,TipoArticulo.Sudadera,Talla.L, 10, TipoSexo.HOMBRE, "Nike", "Gris", "rutaprueba" );
		Articulo p2 = new Sudadera();
		assertTrue(p1.getCodigo()==1);
		assertTrue(p1.getTipo()== TipoArticulo.Sudadera);
		assertTrue(p1.getTalla()== Talla.L);
		assertTrue(p1.getPrecio()==10);
		assertTrue(p1.getSexo()==TipoSexo.HOMBRE);
		assertTrue(p1.getMarca()=="Nike");
		assertTrue(p1.getColor()=="Gris");
		assertTrue(p1.getImagen()=="rutaprueba");
		
		p2.setCodigo(2);
		assertTrue(p2.getCodigo() == 2);
		
		p2.setTipo(TipoArticulo.Sudadera);
		assertTrue(p2.getTipo() == TipoArticulo.Sudadera);
		assertTrue(p2.getCodigo() == 2);
		
		p2.setTalla(Talla.L);
		assertTrue(p2.getTalla()== Talla.L);
		
		p2.setPrecio(50);
		assertTrue(p2.getPrecio()==50);
		
		p2.setSexo(TipoSexo.MUJER);
		assertTrue(p2.getSexo()==TipoSexo.MUJER);
		
		p2.setMarca("Adidas");
		assertTrue(p2.getMarca()=="Adidas");
		
		p2.setColor("Blanco");
		assertTrue(p2.getColor()=="Blanco");
		
		p2.setImagen("PRUEBA2");
		assertTrue(p2.getImagen()=="PRUEBA2");
	}
	
	@Test
	public void testZapatos() {
		Articulo p1 = new Zapatos(1,TipoArticulo.Zapatos,Talla.L, 10, TipoSexo.HOMBRE, "Nike", "Gris", "rutaprueba" );
		Articulo p2 = new Zapatos();
		assertTrue(p1.getCodigo()==1);
		assertTrue(p1.getTipo()== TipoArticulo.Zapatos);
		assertTrue(p1.getTalla()== Talla.L);
		assertTrue(p1.getPrecio()==10);
		assertTrue(p1.getSexo()==TipoSexo.HOMBRE);
		assertTrue(p1.getMarca()=="Nike");
		assertTrue(p1.getColor()=="Gris");
		assertTrue(p1.getImagen()=="rutaprueba");
		
		p2.setCodigo(2);
		assertTrue(p2.getCodigo() == 2);
		
		p2.setTipo(TipoArticulo.Zapatos);
		assertTrue(p2.getTipo() == TipoArticulo.Zapatos);
		assertTrue(p2.getCodigo() == 2);
		
		p2.setTalla(Talla.L);
		assertTrue(p2.getTalla()== Talla.L);
		
		p2.setPrecio(50);
		assertTrue(p2.getPrecio()==50);
		
		p2.setSexo(TipoSexo.MUJER);
		assertTrue(p2.getSexo()==TipoSexo.MUJER);
		
		p2.setMarca("Adidas");
		assertTrue(p2.getMarca()=="Adidas");
		
		p2.setColor("Blanco");
		assertTrue(p2.getColor()=="Blanco");
		
		p2.setImagen("PRUEBA2");
		assertTrue(p2.getImagen()=="PRUEBA2");
	}
 
}
