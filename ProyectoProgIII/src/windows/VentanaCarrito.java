package windows;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import clss.Articulo;
import paneles.PnlCarrito;
import paneles.PnlPrueba;


public class VentanaCarrito extends JFrame{
	public static ArrayList<Articulo> articulos_carrito = new ArrayList<Articulo>();
	
	public static ArrayList<Articulo> getArticulos_carrito() {
		return articulos_carrito;
	}
	public static void setArticulos_carrito(ArrayList<Articulo> articulos_carrito) {
		VentanaCarrito.articulos_carrito = articulos_carrito;
	}
	private JTextArea txt_prueba;
	
	public VentanaCarrito() {
		this.setSize(600, 400);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(227, 48, 73));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Carrito");
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
//		txt_prueba = new JTextArea(70, 70);
//		String productos = "";
//		for (Articulo articulo : articulos_carrito) {
//			productos = productos + articulo + "\n";		
//		}
//		txt_prueba.setText(productos);
//		contentPane.add(txt_prueba);
		
//		JScrollPane scrollPane = new JScrollPane();
//		this.add(scrollPane);
//		scrollPane.setViewportView(contentPane);
		
		for (int i = 0; i < articulos_carrito.size(); i++) {
			JPanel panel = new PnlCarrito();
			int precio = articulos_carrito.get(i).getPrecio();
			String imagen = articulos_carrito.get(i).getImagen();
			System.out.println(imagen);
			PnlCarrito.rellenarPanelesCarrito(precio, imagen, articulos_carrito.get(i));
			contentPane.add(panel);
			contentPane.updateUI();
		}
		
		
	}
	public static void main(String[] args) {
		VentanaCarrito carrito = new VentanaCarrito();
		carrito.setVisible(true);
	}

}
