package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaMain extends JFrame {

	private JPanel contentPane;

	//Holi 2
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
		setBounds(100, 100, 650, 400); //Medidas de la ventana
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null); //Centralizacion de la ventana en la pantalla
		setTitle("Menu"); //Titulo de la ventana
		setResizable(false);
		setVisible(true);
		
	}

}
