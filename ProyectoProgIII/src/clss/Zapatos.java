package clss;

import java.util.ArrayList;

public class Zapatos extends Tienda{
	
	private int precio;
	private String color;
	private TipoSexo sexo;
	private String talla;
	
	public Zapatos(String marca, int precio, String color, TipoSexo sexo, String talla) {
		super(marca);
		this.precio = precio;
		this.color = color;
		this.sexo = sexo;
		this.talla = talla;
	}
	
	public Zapatos() {
		super();
		this.precio = 0;
		this.color = null;
		this.sexo = null;
		this.talla = null;
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

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Zapatos [precio=" + precio + ", color=" + color + ", sexo=" + sexo + ", talla=" + talla
				+ ", getMarca()=" + getMarca() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
