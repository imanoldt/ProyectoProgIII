package clss;

import java.util.ArrayList;

public class Pantalon extends Articulo{


	public Pantalon(int codigo,TipoArticulo tipo, Talla talla, int precio, TipoSexo sexo, String marca, String color) {
		super(codigo, tipo, talla, precio, sexo, marca, color);
//		this.talla = talla;
//		this.tipoP = tipoP;
	}
	public Pantalon() {
		super();

	}
	
	
	
	@Override
	public String toString() {
		return "Pantalon [getCodigo()=" + getCodigo() + ", getPrecio()=" + getPrecio() + ", getSexo()=" + getSexo()
				+ ", getMarca()=" + getMarca() + ", getColor()=" + getColor() + ", getTipo()=" + getTipo()
				+ ", getTalla()=" + getTalla() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}	