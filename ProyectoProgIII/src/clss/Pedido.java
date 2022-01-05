package clss;

import java.util.ArrayList;

public class Pedido {
	public static int contador = 1;
	private int numero_pedido;
	private ArrayList<Articulo> articulos;
	
	public Pedido(ArrayList<Articulo> articulos) {
		super();
		this.articulos = articulos;
		this.numero_pedido = Pedido.contador;
		Pedido.contador++;
	}

	public int getNumero_pedido() {
		return numero_pedido;
	}

	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return "Pedido [numero_pedido=" + numero_pedido + ", articulos=" + articulos + "]";
	}
	
	
	
	
	

}
