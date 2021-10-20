package clss;

import java.util.ArrayList;

public class Pantalon extends Tienda{
	
	private int precio;
	private String color;
	private Talla talla;
	private TipoSexo sexo;
	private boolean rotos;
	private ArrayList<String> tejidos = new ArrayList<String>();
	
	
	public Pantalon(String marca, int precio, String color, Talla talla, TipoSexo sexo, boolean rotos,
			ArrayList<String> tejidos) {
		super(marca);
		this.precio = precio;
		this.color = color;
		this.talla = talla;
		this.sexo = sexo;
		this.rotos = rotos;
		this.tejidos = tejidos;
	}

	public Pantalon() {
		super();
		this.precio = 0;
		this.color = null;
		this.talla = null;
		this.sexo = null;
		this.rotos = true;
		this.tejidos = new ArrayList<String>();
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
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
		this.tejidos = new ArrayList<String>();
	}

	@Override
	public String toString() {
		return "Pantalon [precio=" + precio + ", color=" + color + ", talla=" + talla + ", sexo=" + sexo + ", rotos="
				+ rotos + ", tejidos=" + tejidos + ", getMarca()=" + getMarca() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
