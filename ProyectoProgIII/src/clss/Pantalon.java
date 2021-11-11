package clss;

import java.util.ArrayList;

public class Pantalon extends Ropa{

	private Talla talla;
	private boolean rotos;
	private ArrayList<String> tejidos = new ArrayList<String>();
	
	public Pantalon(String nombre, int precio, TipoSexo sexo, String marca, String color, Talla talla, boolean rotos,
			ArrayList<String> tejidos) {
		super(nombre, precio, sexo, marca, color);
		this.talla = talla;
		this.rotos = rotos;
		this.tejidos = tejidos;
	}

	public Pantalon() {
		super();
		this.talla = Talla.M;
		this.rotos = false;
		this.tejidos = null;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}

	public boolean isRotos() {
		return rotos;
	}

	public void setRotos(boolean rotos) {
		this.rotos = rotos;
	}

	public ArrayList<String> getTejidos() {
		return tejidos;
	}

	public void setTejidos(ArrayList<String> tejidos) {
		this.tejidos = tejidos;
	}

	@Override
	public String toString() {
		return "Pantalon [talla=" + talla + ", rotos=" + rotos + ", tejidos=" + tejidos + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getSexo()=" + getSexo() + ", getMarca()=" + getMarca()
				+ ", getColor()=" + getColor() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
}	