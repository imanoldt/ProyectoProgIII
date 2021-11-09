package windows;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaLogIn extends JFrame {
	private JTextField tfUsuario;
	private JPasswordField pfContraseya;
	private JButton btnRegistrarse, btnIniciarSesion, btnSalir;
	private JPanel pnlCentral, pnlIzquierda, pnlDerecha, pnlSuperior;
	private JLabel lblIniciarS, lblUsuario, lblContraseya, lblLogo;

	/**
	 * Create the frame.
	 */

	public VentanaLogIn() {
		setLocationRelativeTo(null);
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

		pnlSuperior = new JPanel();
		pnlSuperior.setBounds(0, 0, 519, 30);
		pnlSuperior.setBackground(new Color(183, 29, 57));
		pnlIzquierda.add(pnlSuperior);

		pnlDerecha = new JPanel();
		pnlCentral.add(pnlDerecha);
		pnlDerecha.setLayout(new BorderLayout(0, 0));

		lblIniciarS = new JLabel("Iniciar Sesion:");
		lblIniciarS.setHorizontalAlignment(SwingConstants.CENTER);
		lblIniciarS.setBackground(Color.BLACK);
		lblIniciarS.setForeground(Color.WHITE);
		lblIniciarS.setBorder(new MatteBorder(3, 0, 3, 0, (Color) new Color(0, 0, 0)));
		lblIniciarS.setFont(new Font("Montserrat", Font.BOLD, 17));
		lblIniciarS.setBounds(22, 34, 344, 52);
		pnlIzquierda.add(lblIniciarS);

		setTfUsuario(new JTextField());

		getTfUsuario().setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		getTfUsuario().setForeground(Color.LIGHT_GRAY);
		getTfUsuario().setText("Ingrese su nombre de usuario");
		getTfUsuario().setFont(new Font("Kohinoor Bangla", Font.PLAIN, 15));
		getTfUsuario().setBounds(22, 153, 344, 42);
		pnlIzquierda.add(getTfUsuario());
		

		lblUsuario = new JLabel("USUARIO:");
		lblUsuario.setFont(new Font("Montserrat", Font.PLAIN, 13));
		lblUsuario.setBounds(22, 125, 73, 16);
		pnlIzquierda.add(lblUsuario);

		lblContraseya = new JLabel("CONTRASEÃ‘A:");
		lblContraseya.setFont(new Font("Montserrat", Font.PLAIN, 13));
		lblContraseya.setBounds(22, 207, 106, 16);
		pnlIzquierda.add(lblContraseya);

		pfContraseya = new JPasswordField();
		pfContraseya.setBounds(22, 235, 344, 42);
		pfContraseya.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		pnlIzquierda.add(pfContraseya);

		btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.setFont(new Font("Montserrat", Font.PLAIN, 14));
		btnIniciarSesion.setBounds(22, 335, 155, 52);
		pnlIzquierda.add(btnIniciarSesion);

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Montserrat", Font.PLAIN, 14));
		btnRegistrarse.setBounds(211, 335, 155, 52);
		pnlIzquierda.add(btnRegistrarse);

		btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Montserrat", Font.PLAIN, 14));
		btnSalir.setBounds(22, 399, 344, 42);
		pnlIzquierda.add(btnSalir);

		lblLogo = new JLabel("");
		lblLogo.setBackground(Color.BLACK);

		lblLogo.setIcon(new ImageIcon(VentanaLogIn.class.getResource("/img/IconoAplicacion.png")));

		pnlDerecha.add(lblLogo, BorderLayout.CENTER);

//	Eventos

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String usuario = tfUsuario.getText();
			String contraseña = (String) pfContraseya.getText();
			System.out.println("Usuario: " + usuario);
			System.out.println("contraseña: " + contraseña);
			
			if (usuario.equals("admin")  && contraseña.equals("admin")) {
				System.out.println("entra");
				VentanaAdmin admin = new VentanaAdmin();
				admin.setVisible(true);
			}else {
				System.out.println("No entra");
			}
			
		}
	});
		/**
		 * Pone el JTextField en blanco cuando lo pulsamos y cambia el color de la letra
		 * a negro para una mejor visualizacion
		 * 
		 * @author imanoldt
		 * 
		 */
		tfUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfUsuario.setText(null);
				tfUsuario.setForeground(Color.BLACK);
			}
		});

		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (tfUsuario.getText().equals("")) {
					if(pfContraseya.getText().equals("")) {
						btnIniciarSesion.setEnabled(false);
					}
				} else {
					btnIniciarSesion.setEnabled(true);

				}
			}
		});

	}

	public JTextField getTfUsuario() {
		return tfUsuario;
	}

	public void setTfUsuario(JTextField tfUsuario) {
		this.tfUsuario = tfUsuario;

	}
}
