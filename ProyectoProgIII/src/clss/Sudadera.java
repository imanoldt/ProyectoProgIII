package clss;

import java.util.ArrayList;

public class Sudadera extends Articulo{

	private boolean gorro;
	private Talla talla;
	
	public Sudadera(int codigo,TipoArticulo tipo, int precio, TipoSexo sexo, String marca, String color, boolean gorro, Talla talla) {
		super(codigo,tipo, precio, sexo, marca, color);
		this.gorro = gorro;
		this.talla = talla;
	}
	public Sudadera() {
		super();
		
	}
	public boolean isGorro() {
		return gorro;
	}
	public void setGorro(boolean gorro) {
		this.gorro = gorro;
	}
	public Talla getTalla() {
		return talla;
	}
	public void setTalla(Talla talla) {
		this.talla = talla;
	}
	@Override
	public String toString() {
		return "Sudadera [gorro=" + gorro + ", talla=" + talla + "]";
	}
	

	
	

	
}