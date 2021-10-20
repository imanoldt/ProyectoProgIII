package clss;

import java.io.Serializable;

public class Tienda implements Serializable{
	
	private String marca;

	public Tienda(String marca) {
		super();
		this.marca = marca;
	}
	
	public Tienda() {
		super();
		this.marca = null;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Tienda [marca=" + marca + "]";
	}
	
	
	
	

}
