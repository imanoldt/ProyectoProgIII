package clss;

import java.util.ArrayList;

public class Sudadera extends Articulo{

	
	public Sudadera(int codigo,TipoArticulo tipo,Talla talla, int precio, TipoSexo sexo, String marca, String color) {
		super(codigo,tipo, talla, precio, sexo, marca, color);

		this.talla = talla;
	}
	public Sudadera() {
		super();
		
	}
	@Override
	public String toString() {
		return "Sudadera [getCodigo()=" + getCodigo() + ", getPrecio()=" + getPrecio() + ", getSexo()=" + getSexo()
				+ ", getMarca()=" + getMarca() + ", getColor()=" + getColor() + ", getTipo()=" + getTipo()
				+ ", getTalla()=" + getTalla() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}