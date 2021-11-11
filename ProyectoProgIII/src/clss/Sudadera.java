package clss;

import java.util.ArrayList;

public class Sudadera extends Ropa{

	private boolean gorro;
	private Talla talla;
	private ArrayList<String> tejidos = new ArrayList<String>();
	
	public Sudadera(String nombre, int precio, TipoSexo sexo, String marca, String color, boolean gorro, Talla talla,
			ArrayList<String> tejidos) {
		super(nombre, precio, sexo, marca, color);
		this.gorro = gorro;
		this.talla = talla;
		this.tejidos = tejidos;
	}

	public Sudadera() {
		super();
		this.talla = Talla.M;		
		this.gorro = false;
		this.tejidos = null;
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

	public ArrayList<String> getTejidos() {
		return tejidos;
	}

	public void setTejidos(ArrayList<String> tejidos) {
		this.tejidos = tejidos;
	}

	@Override
	public String toString() {
		return "Sudadera [gorro=" + gorro + ", talla=" + talla + ", tejidos=" + tejidos + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getSexo()=" + getSexo() + ", getMarca()=" + getMarca()
				+ ", getColor()=" + getColor() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
}