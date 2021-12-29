package clss;

import java.util.ArrayList;
import java.util.LinkedList;

public class Camiseta extends Articulo{

	private Talla talla;

	public Camiseta(int codigo,TipoArticulo tipo,Talla talla, int precio, TipoSexo sexo, String marca, String color) {
		super(codigo, tipo, talla, precio, sexo, marca, color);
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
	@Override
	public String toString() {
		return "Camiseta [talla=" + talla + ", getCodigo()=" + getCodigo() + ", getPrecio()=" + getPrecio()
				+ ", getSexo()=" + getSexo() + ", getMarca()=" + getMarca() + ", getColor()=" + getColor()
				+ ", getTipo()=" + getTipo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	

	


	

	
}