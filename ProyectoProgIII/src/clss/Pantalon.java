package clss;

import java.util.ArrayList;

public class Pantalon extends Articulo{

	private Talla talla;
	private TipoPantalon tipoP;
	
	public Pantalon(int codigo,TipoArticulo tipo, int precio, TipoSexo sexo, String marca, String color, Talla talla, TipoPantalon tipoP) {
		super(codigo, tipo, precio, sexo, marca, color);
		this.talla = talla;
		this.tipoP = tipoP;
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
	public TipoPantalon getTipoP() {
		return tipoP;
	}
	public void setTipoP(TipoPantalon tipo) {
		this.tipoP = tipoP;
	}
	@Override
	public String toString() {
		return "Pantalon [talla=" + talla + ", tipo=" + tipoP + "]";
	}
	
	
	
	


	

	
	
}	