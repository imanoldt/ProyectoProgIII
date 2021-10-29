package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class VentanaMain extends JFrame {

	private JPanel contentPane;
	private JPanel pnlPrincipal;
	private JPanel pnlNorte;
	private JPanel pnlIzquierda;
	private JPanel pnlDerecha;
	private JLabel lblCamisetas;
	private JLabel lblPantalones;
	private JLabel lblZapatillas;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMain frame = new VentanaMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("OutFitShop");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		pnlPrincipal = new JPanel();
		contentPane.add(pnlPrincipal, BorderLayout.CENTER);
		pnlPrincipal.setLayout(new BorderLayout(0, 0));
		
		pnlNorte = new JPanel();
		pnlNorte.setBackground(Color.RED);
		pnlPrincipal.add(pnlNorte, BorderLayout.NORTH);
		pnlNorte.setLayout(new GridLayout(0, 4, 0, 0));
		
		lblNewLabel_1 = new JLabel("Menu");
		pnlNorte.add(lblNewLabel_1);
		
		pnlIzquierda = new JPanel();
		pnlIzquierda.setBackground(Color.DARK_GRAY);
		pnlPrincipal.add(pnlIzquierda, BorderLayout.WEST);
		pnlIzquierda.setLayout(new GridLayout(4, 0, 0, 0));
		
		lblCamisetas = new JLabel("Camisetas");
		lblCamisetas.setBackground(Color.LIGHT_GRAY);
		lblCamisetas.setOpaque(true);


		pnlIzquierda.add(lblCamisetas);
		
		lblPantalones = new JLabel("Pantalones");
		lblPantalones.setOpaque(true);

		pnlIzquierda.add(lblPantalones);
		
		lblNewLabel = new JLabel("Sudaderas");
		pnlIzquierda.add(lblNewLabel);
		
		lblZapatillas = new JLabel("Zapatillas");
		pnlIzquierda.add(lblZapatillas);
		
		pnlDerecha = new JPanel();
		pnlPrincipal.add(pnlDerecha, BorderLayout.CENTER);
	}

}
