package clss;

import java.io.File;
import java.util.ArrayList;

public class Pantalon extends Articulo{


	public Pantalon(int codigo,TipoArticulo tipo, Talla talla, int precio, TipoSexo sexo, String marca, String color, String ruta) {
		super(codigo, tipo, talla, precio, sexo, marca, color, ruta);

	}
	public Pantalon() {
		super();

	}
	@Override
	public String toString() {
		return "Pantalon [getCodigo()=" + getCodigo() + ", getPrecio()=" + getPrecio() + ", getSexo()=" + getSexo()
				+ ", getMarca()=" + getMarca() + ", getColor()=" + getColor() + ", getTipo()=" + getTipo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}	