package windows;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeMap;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.border.MatteBorder;

import clss.Articulo;
import clss.BaseDeDatos;
import clss.Camiseta;
import clss.Cliente;
import clss.TipoArticulo;
import paneles.PnlCamisetas;
import paneles.PnlPantalones;
import paneles.PnlPrueba;
import paneles.PnlSudaderas;
import paneles.PnlZapatillas;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMainN extends JFrame {

	private JPanel contentPane;
	private JPanel pnlPrincipal;
	private JPanel pnlNorte;
	public static JPanel pnlIzquierda;

	private JLabel lblCamisetas;
	private JLabel lblPantalones;
	private JLabel lblZapatillas;
	private JLabel lblSudaderas;
	private JLabel lblNewLabel_1;
	public static TreeMap<String, Cliente> tmCliente = new TreeMap<>();

	private JPanel panel;
	private JPanel pnlPrincipalDerecha;
	private JScrollPane scrollPane;

	/**
	 * Lanza JFrame
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					VentanaMainN frame = new VentanaMainN();
					frame.setVisible(true);
//					if(login.getTfUsuario().getText()=="admin"){
//						VentanaMain frame = new VentanaMain();
//						frame.setVisible(true);
//						login.setVisible(false);
//					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crea el JFrame
	 * @throws SQLException 
	 */
	public VentanaMainN() throws SQLException {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 600);
		setLocationRelativeTo(null);
		setTitle("OutFitShop");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		pnlPrincipal = new JPanel();
		contentPane.add(pnlPrincipal, BorderLayout.CENTER);
		pnlPrincipal.setLayout(new BorderLayout(0, 0));

		pnlNorte = new JPanel();
		pnlNorte.setPreferredSize(new Dimension(10, 40));
		pnlNorte.setBackground(new Color(227, 48, 73));
		pnlPrincipal.add(pnlNorte, BorderLayout.NORTH);
		pnlNorte.setLayout(new BorderLayout(0, 0));

		lblNewLabel_1 = new JLabel("Bienvenido a OutFitShop");
		lblNewLabel_1.setFont(new Font("Monaco", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		pnlNorte.add(lblNewLabel_1);

		pnlIzquierda = new JPanel();
		pnlIzquierda.setBackground(Color.DARK_GRAY);
		pnlPrincipal.add(pnlIzquierda, BorderLayout.WEST);
		pnlIzquierda.setLayout(new GridLayout(4, 0, 0, 0));

		lblCamisetas = new JLabel("Camisetas");
		lblCamisetas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCamisetas.setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.BLACK));
		lblCamisetas.setFont(new Font("Montserrat", Font.PLAIN, 14));
		lblCamisetas.setBackground(Color.LIGHT_GRAY);
		lblCamisetas.setOpaque(true);

		pnlIzquierda.add(lblCamisetas);

		lblPantalones = new JLabel("Pantalones");
		lblPantalones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPantalones.setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.BLACK));
		lblPantalones.setFont(new Font("Montserrat", Font.PLAIN, 14));
		lblPantalones.setBackground(Color.LIGHT_GRAY);
		lblPantalones.setOpaque(true);

		pnlIzquierda.add(lblPantalones);

		lblSudaderas = new JLabel("Sudaderas");
		lblSudaderas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSudaderas.setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.BLACK));
		lblSudaderas.setFont(new Font("Montserrat", Font.PLAIN, 14));
		lblSudaderas.setBackground(Color.LIGHT_GRAY);
		lblSudaderas.setOpaque(true);

		pnlIzquierda.add(lblSudaderas);

		lblZapatillas = new JLabel("Zapatillas");
		lblZapatillas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblZapatillas.setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.BLACK));
		lblZapatillas.setFont(new Font("Montserrat", Font.PLAIN, 14));
		lblZapatillas.setBackground(Color.LIGHT_GRAY);
		lblZapatillas.setOpaque(true);
		pnlIzquierda.add(lblZapatillas);

		pnlPrincipalDerecha = new JPanel();
		pnlPrincipalDerecha.setBackground(Color.YELLOW);

		pnlPrincipal.add(pnlPrincipalDerecha, BorderLayout.CENTER);
		pnlPrincipalDerecha.setLayout(new GridLayout(0, 1, 0, 0));

		scrollPane = new JScrollPane();
		pnlPrincipal.add(scrollPane);
		scrollPane.setViewportView(pnlPrincipalDerecha);

//EVENTOS________
		BaseDeDatos.initBaseDatos("Clientes.db");
		ArrayList<Articulo> articulos = BaseDeDatos.getArticulos();
		BaseDeDatos.closeBD(BaseDeDatos.con);
		ArrayList<Articulo> camisetas = new ArrayList<Articulo>();
		ArrayList<Articulo> pantalones = new ArrayList<Articulo>();
		ArrayList<Articulo> sudaderas = new ArrayList<Articulo>();
		ArrayList<Articulo> zapatos = new ArrayList<Articulo>();
		for (Articulo articulo : articulos) {
			if (articulo.getTipo() == TipoArticulo.Camiseta) {
				camisetas.add(articulo);
			}else if (articulo.getTipo() == TipoArticulo.Pantalon) {
				pantalones.add(articulo);
			}else if (articulo.getTipo() == TipoArticulo.Sudadera) {
				sudaderas.add(articulo);
			}else if (articulo.getTipo() == TipoArticulo.Zapatos) {
				zapatos.add(articulo);
			}
		}
		
		
		lblCamisetas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlPrincipalDerecha.removeAll();
				pnlPrincipalDerecha.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				System.out.println("Numero de camisetas: "+ camisetas.size());
				
				for (int i = 0; i < camisetas.size(); i++) {
					panel = new PnlPrueba();
					int precio = camisetas.get(i).getPrecio();
					String imagen = camisetas.get(i).getImagen();
					PnlPrueba.rellenarPaneles(precio, imagen);
					pnlPrincipalDerecha.add(panel);
					pnlPrincipalDerecha.updateUI();
				}
				
//				JScrollPane sp = new JScrollPane(panel);
//				sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//				sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//				pnlPrincipalDerecha.add(sp);
//				
//				pnlPrincipalDerecha.updateUI();
				

			}
		});


		lblSudaderas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlPrincipalDerecha.removeAll();
				pnlPrincipalDerecha.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				System.out.println("Numero de sudaderas: "+ sudaderas.size());
				
				for (int i = 0; i < sudaderas.size(); i++) {
					panel = new PnlPrueba();
					int precio = sudaderas.get(i).getPrecio();
					String imagen = sudaderas.get(i).getImagen();
					PnlPrueba.rellenarPaneles(precio, imagen);
					pnlPrincipalDerecha.add(panel);
					pnlPrincipalDerecha.updateUI();
				}

			}
		});

		lblPantalones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				pnlPrincipalDerecha.removeAll();
				pnlPrincipalDerecha.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				System.out.println("Numero de pantalones: "+ pantalones.size());
				
				for (int i = 0; i < pantalones.size(); i++) {
					panel = new PnlPrueba();
					int precio = pantalones.get(i).getPrecio();
					String imagen = pantalones.get(i).getImagen();
					PnlPrueba.rellenarPaneles(precio, imagen);
					pnlPrincipalDerecha.add(panel);
					pnlPrincipalDerecha.updateUI();
				}


			}
		});

		lblZapatillas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlPrincipalDerecha.removeAll();
				pnlPrincipalDerecha.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				System.out.println("Numero de zapatos: "+ zapatos.size());
				
				for (int i = 0; i < zapatos.size(); i++) {
					panel = new PnlPrueba();
					int precio = zapatos.get(i).getPrecio();
					String imagen = zapatos.get(i).getImagen();
					PnlPrueba.rellenarPaneles(precio, imagen);
					pnlPrincipalDerecha.add(panel);
					pnlPrincipalDerecha.updateUI();
				}


			}
		});

	}

	// METODOS_______

}