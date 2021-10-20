package windows;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class VentanaMain extends JFrame {

	private JPanel contentPane, pnlMenu, pnlSuperior, pnlPrincipal;
	private JLabel lblMenu;
	private Image imgMenu, imgCesta;
	private ImageIcon img, img2;
	private JPanel pnlSudaderas;
	private JPanel pnlCamisetas;
	private JPanel pnlGorras;
	private JLabel lblCesta;

	/**
	 * Lanza la aplicacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogIn login=new VentanaLogIn();
					login.setVisible(true);
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
		pnlSuperior.setBackground(new Color(183, 29, 57));
		pnlSuperior.setBounds(0, 0, 907, 50);
		pnlPrincipal.add(pnlSuperior);
		SpringLayout sl_pnlSuperior = new SpringLayout();
		pnlSuperior.setLayout(sl_pnlSuperior);

		lblMenu = new JLabel("");

		// Escalado de la imagen MENU

		imgMenu = new ImageIcon("src/img/icnMenu.png").getImage();
		img = new ImageIcon(imgMenu.getScaledInstance(50, 30, Image.SCALE_SMOOTH));
		lblMenu.setIcon(img);

		sl_pnlSuperior.putConstraint(SpringLayout.SOUTH, lblMenu, 40, SpringLayout.NORTH, pnlSuperior);
		sl_pnlSuperior.putConstraint(SpringLayout.EAST, lblMenu, 59, SpringLayout.WEST, pnlSuperior);
		sl_pnlSuperior.putConstraint(SpringLayout.NORTH, lblMenu, 10, SpringLayout.NORTH, pnlSuperior);
		sl_pnlSuperior.putConstraint(SpringLayout.WEST, lblMenu, 10, SpringLayout.WEST, pnlSuperior);

		pnlSuperior.add(lblMenu);

		lblCesta = new JLabel("");


		// Escalado de la imagen CESTA

		imgCesta = new ImageIcon("src/img/iconoCesta.png").getImage();
		img2 = new ImageIcon(imgCesta.getScaledInstance(40, 30, Image.SCALE_SMOOTH));
		lblCesta.setIcon(img2);

		sl_pnlSuperior.putConstraint(SpringLayout.NORTH, lblCesta, 10, SpringLayout.NORTH, pnlSuperior);
		sl_pnlSuperior.putConstraint(SpringLayout.WEST, lblCesta, -59, SpringLayout.EAST, pnlSuperior);
		sl_pnlSuperior.putConstraint(SpringLayout.SOUTH, lblCesta, 0, SpringLayout.SOUTH, lblMenu);
		sl_pnlSuperior.putConstraint(SpringLayout.EAST, lblCesta, -10, SpringLayout.EAST, pnlSuperior);
		pnlSuperior.add(lblCesta);

		pnlMenu = new JPanel();
		pnlMenu.setBackground(Color.DARK_GRAY);
		pnlMenu.setBounds(0, 50, 200, 510);
		pnlPrincipal.add(pnlMenu);

		pnlMenu.setLayout(null);

		pnlSudaderas = new JPanel();
		pnlSudaderas.setBackground(Color.GRAY);
		pnlSudaderas.setBounds(0, 58, 200, 43);
		pnlMenu.add(pnlSudaderas);

		pnlCamisetas = new JPanel();
		pnlCamisetas.setBackground(Color.GRAY);
		pnlCamisetas.setBounds(0, 113, 200, 43);
		pnlMenu.add(pnlCamisetas);

		pnlGorras = new JPanel();
		pnlGorras.setBackground(Color.GRAY);
		pnlGorras.setBounds(0, 168, 200, 43);
		pnlMenu.add(pnlGorras);
		setLocationRelativeTo(null); // Centralizacion de la ventana en la pantalla
		setTitle("Menu"); // Titulo de la ventana
		setResizable(false);  //No permite reescalar la ventana
		setVisible(true);

		/**
		 * EVENTOS
		 */
		
		

		lblMenu.addMouseListener(new MouseAdapter() {//Accion con el click del mouse
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Informacion", "Informacion", JOptionPane.INFORMATION_MESSAGE);		
			}
		});
		
		lblCesta.addMouseListener(new MouseAdapter() { //Accion con el click del mouse
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Prueba");
			}
		});
		
		/**
		 * HILOS
		 */

	}
}
