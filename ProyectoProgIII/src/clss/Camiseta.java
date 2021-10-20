package clss;

import java.util.ArrayList;
import java.util.LinkedList;

public class Camiseta extends Tienda{
	
	private String color;
	private int precio;
	private Talla talla;
	private TipoSexo sexo;
	private LinkedList<String> tejidos = new LinkedList<String>();
	
	public Camiseta(String marca, String color, int precio, Talla talla, TipoSexo sexo, LinkedList<String> tejidos) {
		super(marca);
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.sexo = sexo;
		this.tejidos = tejidos;
	}
	
	public Camiseta() {
		super();
		this.color = null;
		this.precio = 0;
		this.talla = null;
		this.sexo = null;
		this.tejidos = new LinkedList<String>();
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

	public LinkedList<String> getTejidos() {
		return tejidos;
	}

	public void setTejidos(LinkedList<String> tejidos) {
		this.tejidos = new LinkedList<String>();
	}

	@Override
	public String toString() {
		return "Camiseta [color=" + color + ", precio=" + precio + ", talla=" + talla + ", sexo=" + sexo + ", tejidos="
				+ tejidos + ", getMarca()=" + getMarca() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
