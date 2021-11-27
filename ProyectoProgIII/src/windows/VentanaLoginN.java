package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import paneles.PanelCamisetas;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class VentanaLoginN extends JFrame {

	private JPanel contentPane, pnlPrincipal, pnlIzquierda, pnlDerechaa;

	private JLabel lblIniciarSesion, lblNewLabel_1, lblOutfitshop, lblCopy, lblUsuario, lblIconoUsu, lblContraseya;

	private JTextField txtUsuario;
	private JPasswordField passContraseya;
	private JButton btnIniciarSession, btnRegistrarse, btnSalir;
	private JLabel lblRegistrate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLoginN frame = new VentanaLoginN();
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

	public VentanaLoginN() {
		setTitle("LogIn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1470, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		pnlPrincipal = new JPanel();
		contentPane.add(pnlPrincipal, BorderLayout.CENTER);
		pnlPrincipal.setLayout(new GridLayout(0, 2, 0, 0));

		pnlIzquierda = new JPanel();
		pnlIzquierda.setBackground(new Color(249, 194, 4));
		pnlPrincipal.add(pnlIzquierda);
		pnlIzquierda.setLayout(new MigLayout("", "[grow]",
				"[59.00][46.00][36.00,top][][3.00][41.00][][fill][46.00][47.00][][][][][][][]"));

		lblIniciarSesion = new JLabel("Iniciar Sesion");
		lblIniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblIniciarSesion.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lblIniciarSesion.setFont(new Font("Monaco", Font.PLAIN, 29));
		pnlIzquierda.add(lblIniciarSesion, "cell 0 0,growx,aligny center");

		lblIconoUsu = new JLabel("");
		lblIconoUsu.setIcon(new ImageIcon(VentanaLoginN.class.getResource("/img/userIcon.png")));
		pnlIzquierda.add(lblIconoUsu, "cell 0 1,alignx center,aligny center");

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Monaco", Font.PLAIN, 16));
		pnlIzquierda.add(lblUsuario, "cell 0 2,alignx left,aligny center");

		txtUsuario = new JTextField();
		pnlIzquierda.add(txtUsuario, "cell 0 3,growx,aligny center");
		txtUsuario.setColumns(10);

		lblContraseya = new JLabel("Contraseña:");
		lblContraseya.setFont(new Font("Monaco", Font.PLAIN, 16));
		pnlIzquierda.add(lblContraseya, "cell 0 5,alignx left,aligny center");

		passContraseya = new JPasswordField();
		pnlIzquierda.add(passContraseya, "cell 0 6,growx");

		btnIniciarSession = new JButton("Iniciar Sesion");

		btnIniciarSession.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String usuario = txtUsuario.getText();

				String contrasenya = passContraseya.getText();

				
				if (usuario.equals("admin") && contrasenya.equals("admin")) {
					VentanaAdmin admin = new VentanaAdmin();
					admin.setVisible(true);
					setVisible(false);

				}

			}

		});

//		btnIniciarSession.addMouseMotionListener(new MouseMotionAdapter() {
//			@Override
//			public void mouseMoved(MouseEvent e) {
//				for (int i = 0; i < 5; i++) {
//					
//					try {
//						btnIniciarSession.setFont(new Font("Monaco", Font.PLAIN, i));
//						Thread.sleep(4000);
//					} catch (InterruptedException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//				
//			}
//		});
		btnIniciarSession.setFont(new Font("Monaco", Font.PLAIN, 16));
		btnIniciarSession.setPreferredSize(new Dimension(5000, 50));
		pnlIzquierda.add(btnIniciarSession, "flowx,cell 0 8,alignx center,aligny center");

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Monaco", Font.PLAIN, 16));
		btnRegistrarse.setPreferredSize(new Dimension(120, 50));
		pnlIzquierda.add(btnRegistrarse, "cell 0 8,alignx center,aligny center");

		btnSalir = new JButton();
		btnSalir.setOpaque(false);
		btnSalir.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("Prueba");
				btnSalir.setBackground(new Color(0, 0, 0));
			}
		});
		btnSalir.setText(" Salir");
		btnSalir.setRolloverIcon(new ImageIcon(VentanaLoginN.class.getResource("/img/xEncendida.png")));
		// btnSalir.setIcon(new
		// ImageIcon(VentanaLoginN.class.getResource("/img/xApagada.png")));
		btnSalir.setFont(new Font("Monaco", Font.PLAIN, 16));
		btnSalir.setPreferredSize(new Dimension(5000, 20));
		pnlIzquierda.add(btnSalir, "cell 0 9,alignx center,aligny center");

		pnlDerechaa = new JPanel();
		pnlDerechaa.setBorder(new MatteBorder(0, 3, 0, 0, (Color) new Color(0, 0, 0)));
		pnlDerechaa.setBackground(new Color(227, 48, 73));
		pnlPrincipal.add(pnlDerechaa);
		pnlDerechaa.setLayout(
				new MigLayout("", "[][][][][][][][12.00][554.00][][][][][][][][]", "[][][][][][][][][35.00][472.00][][][][][][][][]"));
		
				lblOutfitshop = new JLabel("OutFitShop");
				lblOutfitshop.setHorizontalAlignment(SwingConstants.CENTER);
				pnlDerechaa.add(lblOutfitshop, "cell 8 1,grow");
				lblOutfitshop.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
				lblOutfitshop.setFont(new Font("Monaco", Font.PLAIN, 29));
		
				lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon(VentanaLoginN.class.getResource("/img/IconoAplicacion.png")));
				pnlDerechaa.add(lblNewLabel_1, "cell 8 9,alignx center,aligny center");

		lblCopy = new JLabel("OutFitShop 2021 Copyright © Todos los derechos reservados - Política de privacidad");
		lblCopy.setHorizontalAlignment(SwingConstants.CENTER);
		pnlDerechaa.add(lblCopy, "cell 8 14,alignx center,aligny center");

// Imagenes

		// Imagen Salir boton login

		ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/xApagada.png"));
		Image imgEscalada = imgIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		btnSalir.setIcon(new ImageIcon(imgEscalada));

		ImageIcon imgIconEnc = new ImageIcon(getClass().getResource("/img/xEncendida.png"));
		Image imgEscaladaEnc = imgIconEnc.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		btnSalir.setRolloverIcon(new ImageIcon(imgEscaladaEnc));
		
		lblRegistrate = new JLabel("¡¡ Registrate que es gratis !!");
		lblRegistrate.setFont(new Font("Montserrat", Font.PLAIN, 20));
		pnlIzquierda.add(lblRegistrate, "cell 0 12,alignx center,aligny center");
		
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				VentanaRegistro registro = new VentanaRegistro();
				registro.setVisible(true);
				setVisible(false);
			}
	});
		
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
			}
	});
		
		
		//Hilos
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					lblRegistrate.setForeground(new Color (249, 194, 4));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					lblRegistrate.setForeground(Color.BLACK);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

	}
}
