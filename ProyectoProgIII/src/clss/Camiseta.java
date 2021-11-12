package clss;

import java.util.ArrayList;
import java.util.LinkedList;

public class Camiseta extends Ropa{

	private boolean simple;
	private Talla talla;
	private LinkedList<String> tejidos = new LinkedList<String>();
	


	public Camiseta(int codigo, int precio, TipoSexo sexo, String marca, String color, boolean simple, Talla talla,
			LinkedList<String> tejidos) {
		super(codigo, precio, sexo, marca, color);
		this.simple = simple;
		this.talla = talla;
		this.tejidos = tejidos;
	}

	public Camiseta() {
		super();
		this.simple = true;
		this.talla = Talla.M;
		this.tejidos = null;
	}

	public boolean isSimple() {
		return simple;
	}

	public void setSimple(boolean simple) {
		this.simple = simple;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}

	public LinkedList<String> getTejidos() {
		return tejidos;
	}

	public void setTejidos(LinkedList<String> tejidos) {
		this.tejidos = tejidos;
	}

	@Override
	public String toString() {
		return "Camiseta [simple=" + simple + ", talla=" + talla + ", tejidos=" + tejidos + ", getNombre()="
				+ getCodigo() + ", getPrecio()=" + getPrecio() + ", getSexo()=" + getSexo() + ", getMarca()="
				+ getMarca() + ", getColor()=" + getColor() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}