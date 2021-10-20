package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JButton;

public class VentanaLogIn extends JFrame {
	private JTextField tfUsuario;
	private JPasswordField pfContraseya;
	private JButton btnRegistrarse, btnIniciarSesion;
	private JPanel pnlCentral, pnlIzquierda, pnlDerecha;
	private JLabel lblIniciarS, lblUsuario, lblContraseya, lblLogo;

	/**
	 * Create the frame.
	 */

	public VentanaLogIn() {
		setLocationByPlatform(true);
		setUndecorated(true);
		setBounds(100, 100, 1039, 549);
		this.setTitle("Autentificacion");
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnlCentral = new JPanel();
		getContentPane().add(pnlCentral, BorderLayout.CENTER);
		pnlCentral.setLayout(new GridLayout(0, 2, 0, 0));

		pnlIzquierda = new JPanel();
		pnlIzquierda.setBackground(new Color(183, 29, 57));
		pnlCentral.add(pnlIzquierda);
		pnlIzquierda.setLayout(null);

		lblIniciarS = new JLabel("Iniciar Sesion:");
		lblIniciarS.setHorizontalAlignment(SwingConstants.CENTER);
		lblIniciarS.setBackground(Color.BLACK);
		lblIniciarS.setForeground(Color.WHITE);
		lblIniciarS.setBorder(new MatteBorder(3, 0, 3, 0, (Color) new Color(0, 0, 0)));
		lblIniciarS.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblIniciarS.setBounds(22, 34, 344, 52);

		pnlIzquierda.add(lblIniciarS);

		tfUsuario = new JTextField();
		tfUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		tfUsuario.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		tfUsuario.setForeground(Color.LIGHT_GRAY);
		tfUsuario.setText("Ingrese su nombre de usuario");
		tfUsuario.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 15));
		tfUsuario.setBounds(22, 153, 344, 42);
		pnlIzquierda.add(tfUsuario);
		tfUsuario.setColumns(10);

		lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(22, 125, 61, 16);
		pnlIzquierda.add(lblUsuario);

		lblContraseya = new JLabel("CONTRASEÑA");
		lblContraseya.setBounds(22, 207, 106, 16);
		pnlIzquierda.add(lblContraseya);

		pfContraseya = new JPasswordField();
		pfContraseya.setBounds(22, 235, 344, 42);
		pfContraseya.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		pnlIzquierda.add(pfContraseya);

		btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.setBounds(22, 335, 155, 52);
		pnlIzquierda.add(btnIniciarSesion);

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(211, 335, 155, 52);
		pnlIzquierda.add(btnRegistrarse);

		pnlDerecha = new JPanel();
		pnlCentral.add(pnlDerecha);
		pnlDerecha.setLayout(new BorderLayout(0, 0));

		lblLogo = new JLabel("");
		lblLogo.setBackground(Color.BLACK);

		lblLogo.setIcon(new ImageIcon(VentanaLogIn.class.getResource("/img/IconoAplicacion.png")));

		pnlDerecha.add(lblLogo, BorderLayout.CENTER);

	}
}
