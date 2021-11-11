package clss;

import java.util.ArrayList;

public class Zapatos extends Ropa{
	
	private int tallaZapato;
	private boolean cordones;
	private boolean plataforma;
	
	public Zapatos(String nombre, int precio, TipoSexo sexo, String marca, String color, int tallaZapato,
			boolean cordones, boolean plataforma) {
		super(nombre, precio, sexo, marca, color);
		this.tallaZapato = tallaZapato;
		this.cordones = cordones;
		this.plataforma = plataforma;
	}

	public Zapatos() {
		super();
		this.tallaZapato = 40;
		this.cordones = true;
		this.plataforma = false;
	}

	public int getTallaZapato() {
		return tallaZapato;
	}

	public void setTallaZapato(int tallaZapato) {
		this.tallaZapato = tallaZapato;
	}

	public boolean isCordones() {
		return cordones;
	}

	public void setCordones(boolean cordones) {
		this.cordones = cordones;
	}

	public boolean isPlataforma() {
		return plataforma;
	}

	public void setPlataforma(boolean plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		return "Zapatos [tallaZapato=" + tallaZapato + ", cordones=" + cordones + ", plataforma=" + plataforma
				+ ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + ", getSexo()=" + getSexo()
				+ ", getMarca()=" + getMarca() + ", getColor()=" + getColor() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}