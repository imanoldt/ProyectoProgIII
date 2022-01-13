package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import clss.BaseDeDatos;
import clss.OutFitShopException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.sql.SQLException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class VentanaLoginN extends JFrame {

	private JPanel contentPane, pnlPrincipal, pnlIzquierda, pnlDerechaa;
	private JLabel lblIniciarSesion, lblIconoAplicacion, lblOutfitshop, lblCopyright, lblUsuario, lblIconoUsu,
			lblContraseya, lblRegistrate;
	private JTextField txtUsuario;
	private JPasswordField passContraseya;
	private JButton btnIniciarSession, btnRegistrarse, btnSalir, btnVisualizar, btnOcultar;
	private JProgressBar progressBar;
	@SuppressWarnings("unused")
	private int num;

	/**
	 * Lanza Aplicacion
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
	 * Creacion del frame
	 */

	public VentanaLoginN() {
		setTitle("LogIn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1470, 830);
		setIconImage(new ImageIcon(getClass().getResource("/img/IconoAplicacion.png")).getImage());
		this.setLocationRelativeTo(null);
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
		passContraseya.setEchoChar('*');
		pnlIzquierda.add(passContraseya, "flowx,cell 0 6,growx");

		btnIniciarSession = new JButton("Iniciar Sesion");

		btnIniciarSession.setFont(new Font("Monaco", Font.PLAIN, 16));
		btnIniciarSession.setPreferredSize(new Dimension(5000, 50));
		pnlIzquierda.add(btnIniciarSession, "flowx,cell 0 8,alignx center,aligny center");

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setIcon(new ImageIcon(VentanaLoginN.class.getResource("/img/icnRegistro.png")));
		btnRegistrarse.setFont(new Font("Monaco", Font.PLAIN, 16));
		btnRegistrarse.setPreferredSize(new Dimension(120, 50));
		pnlIzquierda.add(btnRegistrarse, "cell 0 8,alignx center,aligny center");

		btnSalir = new JButton();
		btnSalir.setOpaque(false);
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
		pnlDerechaa.setLayout(new MigLayout("", "[][][][][][][][12.00][554.00][][][][][][][][]",
				"[][][][][][][][][35.00][472.00][][][][][][][][]"));

		lblOutfitshop = new JLabel("OutFitShop");
		lblOutfitshop.setHorizontalAlignment(SwingConstants.CENTER);
		pnlDerechaa.add(lblOutfitshop, "cell 8 1,grow");
		lblOutfitshop.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		lblOutfitshop.setFont(new Font("Monaco", Font.PLAIN, 29));

		lblIconoAplicacion = new JLabel("");
		lblIconoAplicacion.setIcon(new ImageIcon(VentanaLoginN.class.getResource("/img/IconoAplicacion.png")));
		pnlDerechaa.add(lblIconoAplicacion, "cell 8 9,alignx center,aligny center");

		lblCopyright = new JLabel("OutFitShop 2021 Copyright © Todos los derechos reservados - Política de privacidad");
		lblCopyright.setHorizontalAlignment(SwingConstants.CENTER);

		pnlDerechaa.add(lblCopyright, "cell 8 14,alignx center,aligny center");
		lblRegistrate = new JLabel("¡¡ Registrate que es gratis !!");
		lblRegistrate.setFont(new Font("Montserrat", Font.PLAIN, 20));
		pnlIzquierda.add(lblRegistrate, "cell 0 12,alignx center,aligny center");

		btnVisualizar = new JButton("");
		btnOcultar = new JButton("");

		pnlIzquierda.add(btnOcultar, "cell 0 6");
		pnlIzquierda.add(btnVisualizar, "cell 0 6");

		progressBar = new JProgressBar(0, 100);
		progressBar.setValue(0);
		pnlIzquierda.add(progressBar, "cell 0 14,growx,aligny center");
		progressBar.setVisible(true);

// IMAGENES

		// Imagen Salir boton login

		ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/xApagada.png"));
		Image imgEscalada = imgIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		btnSalir.setIcon(new ImageIcon(imgEscalada));

		ImageIcon imgIconEnc = new ImageIcon(getClass().getResource("/img/xEncendida.png"));
		Image imgEscaladaEnc = imgIconEnc.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		btnSalir.setRolloverIcon(new ImageIcon(imgEscaladaEnc));

		ImageIcon imgIconVis = new ImageIcon(getClass().getResource("/img/icnVisualizar.png"));
		Image imgEscaladaVis = imgIconVis.getImage().getScaledInstance(23, 19, Image.SCALE_SMOOTH);
		btnVisualizar.setIcon(new ImageIcon(imgEscaladaVis));

		ImageIcon imgIconOcu = new ImageIcon(getClass().getResource("/img/icnOcultar.png"));
		Image imgEscaladaOcu = imgIconOcu.getImage().getScaledInstance(23, 19, Image.SCALE_SMOOTH);
		btnOcultar.setIcon(new ImageIcon(imgEscaladaOcu));

// EVENTOS

		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				VentanaRegistroN registro;
				try {
					registro = new VentanaRegistroN();
					registro.setVisible(true);
					setVisible(false);
				} catch (ParseException | OutFitShopException e1) {
					e1.printStackTrace();

				}

			}
		});

		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnVisualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == btnVisualizar)
					passContraseya.setEchoChar((char) 0);

			}

		});
		btnOcultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passContraseya.setEchoChar('*');
			}
		});

		btnIniciarSession.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e1) {
				String usuario = txtUsuario.getText();

				String contrasenya = passContraseya.getText();

				try {
					BaseDeDatos.comprobarInicioSesion(usuario, contrasenya);
					if (BaseDeDatos.rs.next()) {
						Runnable r = new Runnable() {

							@Override
							public void run() {
								// TODO Auto-generated method stub
								lblRegistrate.setText("Cargando datos... ");
								for (int i = 1; i < 100; i++) {
									try {
										Thread.sleep(5);
									} catch (InterruptedException ex) {
										ex.printStackTrace();
									}
									progressBar.setValue(i);
									// progressBar.updateUI();
									System.out.println("El valor de la pb: " + progressBar.getValue());
								}
								if (usuario.equals("admin") && contrasenya.equals("admin")) {
									setVisible(false);
									VentanaAdminN admin = new VentanaAdminN();
									admin.setVisible(true);
								} else {
									setVisible(false);
									VentanaMainN main;
									try {
										main = new VentanaMainN();
										main.setVisible(true);
									} catch (SQLException e) {
										e.printStackTrace();
									}

								}
								lblRegistrate.setText("¡¡ Registrate que es gratis !!");
							}
						};
						Thread t = new Thread(r);
						t.start();
					} else {
						JOptionPane.showMessageDialog(contentPane, "Usuario o contraseña incorrectos");
					}
					BaseDeDatos.closeBD(BaseDeDatos.con);
				} catch (SQLException e2) {
					e2.printStackTrace();
				}

			}

		});

		btnSalir.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("Prueba");
				btnSalir.setBackground(new Color(0, 0, 0));
			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try {
					BaseDeDatos.initBaseDatos("Clientes.db");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			};

			@Override
			public void windowClosed(WindowEvent e) {
				BaseDeDatos.closeBD(BaseDeDatos.con);
			}
		});

		txtUsuario.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnIniciarSession.doClick();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
		});

		passContraseya.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnIniciarSession.doClick();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
		});

//HILOS

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				while (true) {
					lblRegistrate.setForeground(new Color(249, 194, 4));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					lblRegistrate.setForeground(Color.BLACK);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		/*
		 * Runnable r2 =new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * 
		 * while (num < 2000) { progressBar.setValue(num); progressBar.repaint();
		 * 
		 * try { Thread.sleep(50); } catch (InterruptedException e) { } num += 95; } }
		 * 
		 * }; Thread t2 = new Thread(r2); t2.start();
		 */

	}

//METODOS

	public void CentrarJFrame(JFrame v) {

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;
		v.setSize(width / 2, height / 2);

		v.setLocationRelativeTo(null);

	}

}
