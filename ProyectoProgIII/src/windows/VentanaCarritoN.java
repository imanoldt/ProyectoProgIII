//package windows;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
//import clss.Articulo;
//import clss.Pedido;
//import net.miginfocom.swing.MigLayout;
//import paneles.PnlCarrito;
//
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JButton;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//
//public class VentanaCarritoN extends JFrame {
//
//	public static ArrayList<Articulo> articulos_carrito = new ArrayList<Articulo>();
//
//	private JPanel contentPane;
//	private JPanel panelabajo;
//	private JLabel importe;
//	private JButton btnConfirmarCompra;
//	private JPanel pnlArriba;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VentanaCarritoN frame = new VentanaCarritoN();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public VentanaCarritoN() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 836, 461);
//		setTitle("Carrito");
//		contentPane = new JPanel();
//		contentPane.setBackground(new Color(227, 48, 73));
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(new MigLayout("", "[grow]", "[326.00,grow][grow]"));
//		
//		pnlArriba = new JPanel();
//		contentPane.add(pnlArriba, "cell 0 0,grow");
//
//		panelabajo = new JPanel();
//		contentPane.add(panelabajo, "cell 0 1,grow");
//		panelabajo.setLayout(new MigLayout("", "[86px][164px][][][grow]", "[29px]"));
//
//		int total = calcularTotal(articulos_carrito, 0);
//		importe = new JLabel("Importe total: " + total + "€");
//		panelabajo.add(importe, "cell 0 0,alignx left,aligny center");
//
//		btnConfirmarCompra = new JButton("Confimar Compra");
//		btnConfirmarCompra.setFont(new Font("Monaco", Font.PLAIN, 14));
//		panelabajo.add(btnConfirmarCompra, "cell 2 0 3 1,growx,aligny center");
//		btnConfirmarCompra = new JButton("Confirmar Compra");
//
//		btnConfirmarCompra.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Pedido pedidonuevo = new Pedido(articulos_carrito);
//				VentanaAdminN.pedidos.add(pedidonuevo);
//				System.out.println(pedidonuevo);
//				dispose();
////				articulos_carrito.clear();
//				JOptionPane.showMessageDialog(null, "Compra realizada con exito");
//			}
//		});
//
////		JScrollPane scrollPane = new JScrollPane();
////		contentPane.add(scrollPane);
////		scrollPane.setViewportView(panelarriba);
//
//		/*
//		 * for (int i = 0; i < articulos_carrito.size(); i++) { PnlCarrito panel = new
//		 * PnlCarrito(); int precio = articulos_carrito.get(i).getPrecio(); String
//		 * imagen = articulos_carrito.get(i).getImagen(); System.out.println(imagen);
//		 * panel.rellenarPanelesCarrito(precio, imagen, articulos_carrito.get(i));
//		 * panelarriba.add(panel); panelarriba.updateUI(); }
//		 */
//
//		cargarPaneles();
//	}
//
//	public static void cargarPaneles() {
//		if (pnlArriba != null)
//			pnlArriba.removeAll();
//		for (int i = 0; i < articulos_carrito.size(); i++) {
//			PnlCarrito panel = new PnlCarrito();
//			int precio = articulos_carrito.get(i).getPrecio();
//			String imagen = articulos_carrito.get(i).getImagen();
//			System.out.println(imagen);
//			panel.rellenarPanelesCarrito(precio, imagen, articulos_carrito.get(i));
//			pnlArriba.add(panel);
//			pnlArriba.updateUI();
//		}
//	}
////	public static void cargarPanelesN(){
////		if(pnl)
////		
////	}
//
//	public static ArrayList<Articulo> getArticulos_carrito() {
//		return articulos_carrito;
//	}
//
//	public static void setArticulos_carrito(ArrayList<Articulo> articulos_carrito) {
//		VentanaCarrito.articulos_carrito = articulos_carrito;
//	}
//
//	public static int calcularTotal(ArrayList<Articulo> articulos, int i) {
//		int total = 0;
//		for (Articulo articulo : articulos) {
//			total = total + articulo.getPrecio();
//		}
//		return total;
//
//	}
//
//}
