package windows;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class VentanaMain extends JFrame {

	private JPanel contentPane, pnlMenu, pnlSuperior, pnlPrincipal;
	private JLabel lblMenu;
	private Image imgMenu;

	/**
	 * Lanza la aplicacion
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
	 * Creacion de la ventana principal
	 */

	public VentanaMain() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMain.class.getResource("/img/IconoAplicacion.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 588); // Medidas de la ventana
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.LIGHT_GRAY);
		pnlPrincipal.setBounds(0, 0, 907, 560);
		contentPane.add(pnlPrincipal);
		pnlPrincipal.setLayout(null);

		pnlSuperior = new JPanel();
		pnlSuperior.setBackground(SystemColor.controlHighlight);
		pnlSuperior.setBounds(0, 0, 907, 50);
		pnlPrincipal.add(pnlSuperior);
		SpringLayout sl_pnlSuperior = new SpringLayout();
		pnlSuperior.setLayout(sl_pnlSuperior);

		lblMenu = new JLabel("");
		sl_pnlSuperior.putConstraint(SpringLayout.SOUTH, lblMenu, 40, SpringLayout.NORTH, pnlSuperior);
		sl_pnlSuperior.putConstraint(SpringLayout.EAST, lblMenu, 59, SpringLayout.WEST, pnlSuperior);
		
//Escalado de la imagen 
		
		Image imgMenu = new ImageIcon("src/img/icnMenu.png").getImage();
		ImageIcon img = new ImageIcon(imgMenu.getScaledInstance(50, 30, Image.SCALE_SMOOTH));
		lblMenu.setIcon(img);

		sl_pnlSuperior.putConstraint(SpringLayout.NORTH, lblMenu, 10, SpringLayout.NORTH, pnlSuperior);
		sl_pnlSuperior.putConstraint(SpringLayout.WEST, lblMenu, 10, SpringLayout.WEST, pnlSuperior);
		pnlSuperior.add(lblMenu);

		pnlMenu = new JPanel();
		pnlMenu.setBackground(Color.DARK_GRAY);
		pnlMenu.setBounds(0, 50, 200, 510);
		pnlPrincipal.add(pnlMenu);
		setLocationRelativeTo(null); // Centralizacion de la ventana en la pantalla
		setTitle("Menu"); // Titulo de la ventana
		setResizable(false);
		setVisible(true);

		/**
		 * EVENTOS
		 */

	}
}
