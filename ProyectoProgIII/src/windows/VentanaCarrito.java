package windows;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import clss.Articulo;


public class VentanaCarrito extends JFrame{
	public VentanaCarrito() {
		this.setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(227, 48, 73));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Carrito");
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
	}
	public static void main(String[] args) {
		VentanaCarrito carrito = new VentanaCarrito();
		carrito.setVisible(true);
	}

}
