package clss;

import java.util.ArrayList;

public class Zapatos extends Articulo{
	
	private int tallaZapato;

	public Zapatos(int codigo,TipoArticulo tipo, int precio, TipoSexo sexo, String marca, String color, int tallaZapato) {
		super(codigo,tipo, precio, sexo, marca, color);
		this.tallaZapato = tallaZapato;
	}
	public Zapatos() {
		super();

	}
	
	public int getTallaZapato() {
		return tallaZapato;
	}
	public void setTallaZapato(int tallaZapato) {
		this.tallaZapato = tallaZapato;
	}
	@Override
	public String toString() {
		return "Zapatos [tallaZapato=" + tallaZapato + "]";
	}
	
	
	
	
	

	


	
	
}