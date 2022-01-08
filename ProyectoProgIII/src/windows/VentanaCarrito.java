package windows;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import clss.Articulo;
import clss.Pedido;
import paneles.PnlCarrito;
import paneles.PnlPrueba;


public class VentanaCarrito extends JFrame{
	public static ArrayList<Articulo> articulos_carrito = new ArrayList<Articulo>();
	public static JPanel panelarriba;
	
	public static ArrayList<Articulo> getArticulos_carrito() {
		return articulos_carrito;
	}
	public static void setArticulos_carrito(ArrayList<Articulo> articulos_carrito) {
		VentanaCarrito.articulos_carrito = articulos_carrito;
	}
	private JTextArea txt_prueba;
	private JButton btnActualizar;
	private JButton btnConfirmarCompra;
	private JLabel importe;
	
	public VentanaCarrito() {
		this.setSize(600, 600);
		setIconImage(new ImageIcon(getClass().getResource("/img/icnCesta2.jpg")).getImage());

//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(227, 48, 73));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Carrito");
		contentPane.setLayout(new GridLayout(2, 1));
		JPanel panelarriba = new JPanel();
//		panelarriba.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelarriba.setBackground(new Color(227, 48, 73));
		
		JPanel panelabajo = new JPanel();
		panelabajo.setBackground(new Color(227, 48, 73));
		contentPane.add(panelarriba);
		contentPane.add(panelabajo);
		btnConfirmarCompra = new JButton("Confirmar Compra");
		btnActualizar = new JButton("Actualizar");
		
		int total = calcularTotal(articulos_carrito, 0);
		
		importe = new JLabel("Importe total: " + total +"€");
		panelabajo.add(importe);
		panelabajo.add(btnActualizar);
		panelabajo.add(btnConfirmarCompra);
		
		btnActualizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				VentanaCarrito nueva = new VentanaCarrito();
				nueva.setVisible(true);
			}
		});
		
		btnConfirmarCompra.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Pedido pedidonuevo = new Pedido(articulos_carrito);
				VentanaAdminN.pedidos.add(pedidonuevo);
				dispose();
				articulos_carrito.clear();
				JOptionPane.showMessageDialog(null, "Compra realizada con exito");
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		scrollPane.setViewportView(panelarriba);
		
		for (int i = 0; i < articulos_carrito.size(); i++) {
			JPanel panel = new PnlCarrito();
			int precio = articulos_carrito.get(i).getPrecio();
			String imagen = articulos_carrito.get(i).getImagen();
			System.out.println(imagen);
			PnlCarrito.rellenarPanelesCarrito(precio, imagen, articulos_carrito.get(i));
			panelarriba.add(panel);
			panelarriba.updateUI();
		}
		
		
	}
	public static void main(String[] args) {
		VentanaCarrito carrito = new VentanaCarrito();
		carrito.setVisible(true);
	}

	public static int calcularTotal(ArrayList<Articulo> articulos, int i) {
		int total = 0;
		for (Articulo articulo : articulos) {
			total = total + articulo.getPrecio();
		}
		return total;	
		
	}

}
