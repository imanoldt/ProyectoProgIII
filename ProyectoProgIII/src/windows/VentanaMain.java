package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.TreeMap;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.border.MatteBorder;
import javax.swing.event.MouseInputListener;

import clss.Cliente;
import paneles.PanelCamisetas;
import paneles.PanelPantalones;
import paneles.PanelSudaderas;
import paneles.PanelZapatillas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VentanaMain extends JFrame {

	private JPanel contentPane;
	private JPanel pnlPrincipal;
	private JPanel pnlNorte;
	private JPanel pnlIzquierda;
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
	protected JButton volver;
	

	/**
	 * Lanza JFrame
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					VentanaMain frame = new VentanaMain();

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
	public VentanaMain() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		PanelPrincipal panel1 = new PanelPrincipal();
		add(panel1, BorderLayout.WEST);
		PanelInicio panelInicio = new PanelInicio();
		add(panelInicio, BorderLayout.SOUTH);
		

//		pnlDerecha = new JPanel();
//		pnlPrincipal.add(pnlDerecha, BorderLayout.CENTER);
//
//		pnlDerecha.setLayout(new BorderLayout(0, 0));
//		
//		pnlDerechaAbajo = new JPanel();
//		pnlDerecha.add(pnlDerechaAbajo, BorderLayout.SOUTH);
//		
//		btnCesta = new JButton("Cesta");
//		pnlDerechaAbajo.add(btnCesta);
//		
//		btnNewButton_1 = new JButton("");
//		pnlDerechaAbajo.add(btnNewButton_1);
		
		
		lblCamisetas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelInicio.removeAll();
				panelInicio.revalidate();
				add(new PanelCamisetas(), BorderLayout.CENTER);
				
			}
	});

		lblSudaderas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelInicio.removeAll();
				panelInicio.revalidate();
				add(new PanelSudaderas(), BorderLayout.CENTER);
				
			}
	});

		lblPantalones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelInicio.removeAll();
				panelInicio.revalidate();
				add(new PanelPantalones(), BorderLayout.CENTER);
				
			}
	});

		lblZapatillas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelInicio.removeAll();
				panelInicio.revalidate();
				add(new PanelZapatillas(), BorderLayout.CENTER);
				
			}
	});
		volver.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});

	}

	
		class PanelPrincipal extends JPanel{
		
			public PanelPrincipal() {
				setLayout(new BorderLayout());
			
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
				
				PanelBotones panelBotones = new PanelBotones();
				add(panelBotones, BorderLayout.CENTER);
				
				
			}
		
		class PanelBotones extends JPanel{
	
			public PanelBotones() {
				setLayout(new GridLayout(5,1));
				
				
				
				volver = new JButton(new ImageIcon(VentanaAdmin.class.getResource("/img/Inicio.png")));
				volver.setOpaque(false);
				volver.setBorderPainted(false);
				volver.setBackground(new Color(0, 0, 0));
				add(volver, BorderLayout.CENTER);

				lblCamisetas = new JLabel("Camisetas");
				lblCamisetas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblCamisetas.setFont(new Font("Verdana", Font.PLAIN, 14));
				lblCamisetas.setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.WHITE));
				lblCamisetas.setBackground(Color.LIGHT_GRAY);
				lblCamisetas.setOpaque(true);
				add(lblCamisetas, BorderLayout.CENTER);
				
				lblPantalones = new JLabel("Pantalones");
				lblPantalones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblPantalones.setFont(new Font("Verdana", Font.PLAIN, 14));
				lblPantalones.setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.WHITE));
				lblPantalones.setBackground(Color.LIGHT_GRAY);
				lblPantalones.setOpaque(true);
				add(lblPantalones, BorderLayout.CENTER);
				
				
				
				lblSudaderas = new JLabel("Sudaderas");
				lblSudaderas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblSudaderas.setFont(new Font("Verdana", Font.PLAIN, 14));
				lblSudaderas.setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.WHITE));
				lblSudaderas.setBackground(Color.LIGHT_GRAY);
				lblSudaderas.setOpaque(true);
				add(lblSudaderas, BorderLayout.CENTER);
				
				lblZapatillas = new JLabel("Zapatillas");
				lblZapatillas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblZapatillas.setFont(new Font("Verdana", Font.PLAIN, 14));
				lblZapatillas.setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.WHITE));
				lblZapatillas.setBackground(Color.LIGHT_GRAY);
				lblZapatillas.setOpaque(true);
				add(lblZapatillas, BorderLayout.CENTER);
				
			
				
			}
			
			
		}
		
		
	}
	
	class PanelInicio extends JPanel{ //Panel con el que se inicia
		public PanelInicio(){
		
			
			
		

			
		}
	}
}
