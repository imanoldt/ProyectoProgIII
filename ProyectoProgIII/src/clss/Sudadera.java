package clss;

import java.util.ArrayList;

public class Sudadera extends Tienda{
	
	private String color;
	private int precio;
	private Talla talla;
	private TipoSexo sexo;
	private boolean gorro;
	private ArrayList<String> tejidos = new ArrayList<String>();
	
	public Sudadera(String marca, String color, int precio, Talla talla, TipoSexo sexo, boolean gorro,
			ArrayList<String> tejidos) {
		super(marca);
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.sexo = sexo;
		this.gorro = gorro;
		this.tejidos = tejidos;
	}
	
	public Sudadera() {
		super();
		this.color = null;
		this.precio = 0;
		this.talla = null;
		this.sexo = null;
		this.gorro = true;
		this.tejidos = new ArrayList<String>();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
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

	public boolean isGorro() {
		return gorro;
	}

	public void setGorro(boolean gorro) {
		this.gorro = gorro;
	}

	public ArrayList<String> getTejidos() {
		return tejidos;
	}

	public void setTejidos(ArrayList<String> tejidos) {
		this.tejidos = new ArrayList<String>();
	}

	@Override
	public String toString() {
		return "Sudadera [color=" + color + ", precio=" + precio + ", talla=" + talla + ", sexo=" + sexo + ", gorro="
				+ gorro + ", tejidos=" + tejidos + ", getMarca()=" + getMarca() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
