package clss;

import java.util.ArrayList;

public class Pantalon extends Articulo{

	private Talla talla;
	private TipoPantalon tipo;
	
	public Pantalon(int codigo, int precio, TipoSexo sexo, String marca, String color, Talla talla, TipoPantalon tipo) {
		super(codigo, precio, sexo, marca, color);
		this.talla = talla;
		this.tipo = tipo;
	}
	public Pantalon() {
		super();

	}
	public Talla getTalla() {
		return talla;
	}
	public void setTalla(Talla talla) {
		this.talla = talla;
	}
	public TipoPantalon getTipo() {
		return tipo;
	}
	public void setTipo(TipoPantalon tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Pantalon [talla=" + talla + ", tipo=" + tipo + "]";
	}
	
	
	
	


	

	
	
}	