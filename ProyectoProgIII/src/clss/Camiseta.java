package clss;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

public class Camiseta extends Articulo{

	

	public Camiseta(int codigo,TipoArticulo tipo,Talla talla, int precio, TipoSexo sexo, String marca, String color, String ruta) {
		super(codigo, tipo, talla, precio, sexo, marca, color, ruta);

	}
	public Camiseta() {
		super();
	}
	@Override
	public String toString() {
		return "Camiseta [getCodigo()=" + getCodigo() + ", getPrecio()=" + getPrecio() + ", getSexo()=" + getSexo()
				+ ", getMarca()=" + getMarca() + ", getColor()=" + getColor() + ", getTipo()=" + getTipo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}