package windows;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.TreeMap;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.border.MatteBorder;

import clss.Cliente;
import paneles.PanelCamisetas;
import paneles.PanelPantalones;

import paneles.PanelSudaderas;
import paneles.PanelZapatillas;
import paneles.PnlCamisetas;
import paneles.PnlPantalones;
import paneles.PnlSudaderas;
import paneles.PnlZapatillas;
import windows.VentanaMain.PanelInicio;

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
	private JPanel pnlDerecha;
	private JLabel lblCamisetas;
	private JLabel lblPantalones;
	private JLabel lblZapatillas;
	private JLabel lblSudaderas;
	private JLabel lblNewLabel_1;
	public static TreeMap<String, Cliente> tmCliente = new TreeMap<>();
	private JPanel pnlDerechaAbajo;
	private JButton btnCesta;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JPanel panel;

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
	 */
	public VentanaMainN() {
		
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

//		PanelPrincipalN panelDerechaN=new PanelPrincipalN();
//		pnlPrincipal.add(panelDerechaN, BorderLayout.CENTER);
		panel=new PnlCamisetas();
		pnlPrincipal.add(panel, BorderLayout.CENTER);
		
		


//
//		btnCesta = new JButton("Cesta");
//		pnlDerechaAbajo.add(btnCesta);
//
//		btnNewButton_1 = new JButton("");
//		pnlDerechaAbajo.add(btnNewButton_1);
		
		
//EVENTOS________
		
		lblCamisetas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel=new PnlCamisetas();
				pnlDerecha.add(panel);
			
				
			}
	});

		lblSudaderas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel=new PnlSudaderas();
				pnlDerecha.add(panel);
				
			}
	});

		lblPantalones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel=new PnlPantalones();
				pnlDerecha.add(panel);
				
			}
	});

		lblZapatillas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel=new PnlZapatillas();
				pnlDerecha.add(panel);
				
			}
	});

		
		

		
	


		
		
		
		
		
	}
	
	//METODOS_______
	


}