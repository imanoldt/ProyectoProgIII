package clss;

import java.util.ArrayList;
import java.util.LinkedList;

public class Camiseta extends Articulo{

	private Talla talla;

	public Camiseta(int codigo,TipoArticulo tipo, int precio, TipoSexo sexo, String marca, String color, Talla talla) {
		super(codigo, tipo, precio, sexo, marca, color);
		this.talla = talla;
	}
	public Camiseta() {
		super();
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}
	
	
	

	


	

	
}