package windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import clss.BaseDeDatos;
import clss.TipoSexo;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;


public class VentanaRegistroN extends JFrame {

	private JPanel contentPane, pnlSuperior, pnlCentral, pnlCentralIzq, pnlCentralDerecha;

	private JLabel lblNombre, lblDni, lblEmail, lblDireccion, lblFNacimiento, lblCodigoPostal, lblSexo, lblAvatar,
			lblRegistro, lblAvatarIcono;
	private JTextField txtNombre, txtDni, txtEmail, txtDir, txtCodigoPostal;

	private JDateChooser dChooser;

	private JComboBox<TipoSexo> cbSexo;
	private JButton btnRegistrarse, btnCerrar, btnSeleccionar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_7;

	private JTextField txtusuario;

	private JLabel lblUsuario;

	private JLabel lblContraseña;

	private JPasswordField txtContraseña;
	private JLabel lblNewLabel_8;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	private JPasswordField txtContraseña2;

	private JLabel lblContraseña2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistroN frame = new VentanaRegistroN();
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
	public VentanaRegistroN() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1087, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setTitle("Registro Usuarios");
		setContentPane(contentPane);

		pnlSuperior = new JPanel();
		pnlSuperior.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		pnlSuperior.setBackground(new Color(249, 194, 4));
		pnlSuperior.setPreferredSize(new Dimension(0, 50));
		contentPane.add(pnlSuperior, BorderLayout.NORTH);
		pnlSuperior.setLayout(new BorderLayout(0, 0));

		lblRegistro = new JLabel("Registro de Usuarios");
		lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistro.setFont(new Font("Monaco", Font.PLAIN, 19));
		pnlSuperior.add(lblRegistro, BorderLayout.CENTER);

		pnlCentral = new JPanel();
		pnlCentral.setBackground(new Color(227, 48, 73));
		contentPane.add(pnlCentral, BorderLayout.CENTER);
		pnlCentral.setLayout(new BorderLayout(0, 0));

		pnlCentralIzq = new JPanel();
		pnlCentralIzq.setBackground(new Color(227, 48, 73));
		pnlCentral.add(pnlCentralIzq, BorderLayout.WEST);
		pnlCentralIzq.setLayout(new GridLayout(8, 2, 0, 0));
		pnlCentralIzq.setPreferredSize(new Dimension(700, 0));

		lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Monaco", Font.PLAIN, 14));

		pnlCentralIzq.add(lblNombre);

		txtNombre = new JTextField();

		txtNombre.setColumns(10);
		pnlCentralIzq.add(txtNombre);
		
				lblDni = new JLabel("DNI:");
				lblDni.setForeground(Color.WHITE);
				lblDni.setFont(new Font("Monaco", Font.PLAIN, 14));
				pnlCentralIzq.add(lblDni);
		
				txtDni = new JTextField();
				txtDni.setColumns(10);
				pnlCentralIzq.add(txtDni);
		
				lblEmail = new JLabel("Email:");
				lblEmail.setForeground(Color.WHITE);
				lblEmail.setFont(new Font("Monaco", Font.PLAIN, 14));
				pnlCentralIzq.add(lblEmail);
		
				txtEmail = new JTextField();
				txtEmail.setColumns(10);
				pnlCentralIzq.add(txtEmail);
		
				lblCodigoPostal = new JLabel("Codigo Postal:");
				lblCodigoPostal.setForeground(Color.WHITE);
				lblCodigoPostal.setFont(new Font("Monaco", Font.PLAIN, 14));
				pnlCentralIzq.add(lblCodigoPostal);
		
				txtCodigoPostal = new JTextField();
				txtCodigoPostal.setColumns(10);
				pnlCentralIzq.add(txtCodigoPostal);
		
				lblDireccion = new JLabel("Direccion: ");
				lblDireccion.setForeground(Color.WHITE);
				lblDireccion.setFont(new Font("Monaco", Font.PLAIN, 14));
				pnlCentralIzq.add(lblDireccion);
		
				txtDir = new JTextField();
				txtDir.setColumns(10);
				pnlCentralIzq.add(txtDir);
		
				lblFNacimiento = new JLabel("Fecha de Nacimiento:");
				lblFNacimiento.setForeground(Color.WHITE);
				lblFNacimiento.setFont(new Font("Monaco", Font.PLAIN, 14));
				pnlCentralIzq.add(lblFNacimiento);
		
				long millisSystem = System.currentTimeMillis();
				Date currentDate = new Date(millisSystem);
				Date fMax = currentDate;
				dChooser = new JDateChooser();
				dChooser.setMaxSelectableDate(fMax);
				
			
				pnlCentralIzq.add(dChooser);
						
		
				lblSexo = new JLabel("Sexo:");
				lblSexo.setForeground(Color.WHITE);
				lblSexo.setFont(new Font("Monaco", Font.PLAIN, 14));
				pnlCentralIzq.add(lblSexo);
		
				cbSexo = new JComboBox<TipoSexo>();			
				pnlCentralIzq.add(cbSexo);
				for (TipoSexo ts : TipoSexo.values()) {
					cbSexo.addItem(ts);
				}
		
		lblNewLabel_1 = new JLabel("");
		
		pnlCentralIzq.add(lblNewLabel_1);
		
		lblNewLabel_5 = new JLabel("");
		pnlCentralIzq.add(lblNewLabel_5);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Monaco", Font.PLAIN, 14));
		pnlCentralIzq.add(lblUsuario);
		
		txtusuario = new JTextField();
		pnlCentralIzq.add(txtusuario);
		txtusuario.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		pnlCentralIzq.add(lblNewLabel_2);
		
		lblNewLabel_8 = new JLabel("");
		pnlCentralIzq.add(lblNewLabel_8);
				
				lblContraseña = new JLabel("Contraseña:");
				lblContraseña.setFont(new Font("Monaco", Font.PLAIN, 14));
				lblContraseña.setForeground(Color.WHITE);
				pnlCentralIzq.add(lblContraseña);
				
				txtContraseña = new JPasswordField();
				pnlCentralIzq.add(txtContraseña);
				txtContraseña.setColumns(10);
				
				lblContraseña2 = new JLabel("Repetir Contraseña:");
				lblContraseña2.setFont(new Font("Monaco", Font.PLAIN, 14));
				lblContraseña2.setForeground(Color.WHITE);
				pnlCentralIzq.add(lblContraseña2);
				
				txtContraseña2 = new JPasswordField();
				pnlCentralIzq.add(txtContraseña2);
				txtContraseña2.setColumns(10);
				
				separator = new JSeparator();
				pnlCentralIzq.add(separator);
				
				separator_1 = new JSeparator();
				pnlCentralIzq.add(separator_1);
				
				separator_2 = new JSeparator();
				pnlCentralIzq.add(separator_2);
				
				separator_3 = new JSeparator();
				pnlCentralIzq.add(separator_3);
				
						lblAvatar = new JLabel("Avatar:");
						lblAvatar.setForeground(Color.WHITE);
						lblAvatar.setFont(new Font("Monaco", Font.PLAIN, 14));
						pnlCentralIzq.add(lblAvatar);
		
				btnSeleccionar = new JButton("Buscar");
				
						pnlCentralIzq.add(btnSeleccionar);
						
								// EVENTOS
						
								btnSeleccionar.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
						
										JFileChooser fc = new JFileChooser("src/img");
										FileFilter filter = new FileNameExtensionFilter("PNG file", new String[] { "png" });
										fc.setFileFilter(filter);
										int seleccion = fc.showOpenDialog(null);
										if (seleccion == JFileChooser.APPROVE_OPTION) {
											File fSeleccionado = fc.getSelectedFile();
											int input = JOptionPane.showConfirmDialog(null, "¿Seguro que este es el archivo correcto?",
													"Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
											if (input == JOptionPane.YES_OPTION) {
												String rutaFoto = fSeleccionado.getAbsolutePath();
												System.out.println(rutaFoto);
												ImageIcon imgIcon = new ImageIcon(rutaFoto);
												Image imgEscalada = imgIcon.getImage().getScaledInstance(199, 199, Image.SCALE_SMOOTH);
												ImageIcon im = new ImageIcon(imgEscalada);
												im.setDescription(rutaFoto);
												lblAvatarIcono.setIcon(im);
												// ImageIcon imgIcon = new ImageIcon(rutaFoto);
												// lblAvatarIcono.setIcon(imgIcon);
						
											} else {
						
											}
						
										} else {
											JOptionPane.showMessageDialog(fc, "No se ha encontrado el archivo");
										}
						
									}
						
								});
		
		lblNewLabel_7 = new JLabel("");
		pnlCentralIzq.add(lblNewLabel_7);

		pnlCentralDerecha = new JPanel();
		pnlCentralDerecha.setBackground(new Color(227, 48, 73));
		pnlCentral.add(pnlCentralDerecha, BorderLayout.EAST);
		pnlCentralDerecha.setLayout(new MigLayout("", "[232.00]", "[1px][127.00,grow][][17.00][][-42.00]"));

		lblAvatarIcono = new JLabel("");

		lblAvatarIcono.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblAvatarIcono.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCentralDerecha.add(lblAvatarIcono, "cell 0 1,grow");
		
		btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLoginN registro = new VentanaLoginN();
				registro.setVisible(true);
				setVisible(false);
			}
		});
	
		pnlCentralDerecha.add(btnNewButton, "cell 0 2, grow");

		btnRegistrarse = new JButton("Registrarme");

		pnlCentralDerecha.add(btnRegistrarse, "cell 0 3,grow");

		btnCerrar = new JButton("Cerrar");
		pnlCentralDerecha.add(btnCerrar, "cell 0 4,growx");
		btnCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
			}
	});

		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (!txtNombre.getText().isEmpty() && !txtDni.getText().isEmpty() && !txtEmail.getText().isEmpty() && !txtDir.getText().isEmpty() && !txtCodigoPostal.getText().isEmpty() && !txtusuario.getText().isEmpty() && !txtContraseña.getText().isEmpty()) {
					
					Pattern pat = Pattern.compile("[0-9]{7,8}[A-Z]");
					String dni = txtDni.getText();
					Matcher mat = pat.matcher(dni);
					boolean cumplePatron = mat.matches();

					if (cumplePatron == true) {
						
						if ( txtContraseña.getText().equals( txtContraseña2.getText())) {
									try {
										BaseDeDatos.con = DriverManager.getConnection("jdbc:sqlite:Clientes.db");
										String com = "";
										com = "select * from clientes where usuario = '" + txtusuario.getText() + "'";
										BaseDeDatos.stmt = BaseDeDatos.con.createStatement();
										BaseDeDatos.rs = BaseDeDatos.stmt.executeQuery(com);
										
									} catch (SQLException e2) {
										e2.printStackTrace();
									}
									try {
										if (!BaseDeDatos.rs.next()) {
											String nombre = txtNombre.getText();
											String eml = txtEmail.getText();
											String dni2 = txtDni.getText();
											TipoSexo sexo =  (TipoSexo) cbSexo.getSelectedItem();
											String direccion = txtDir.getText();
											int codigoPostal = Integer.parseInt(txtCodigoPostal.getText());
											Date fechanac = dChooser.getDate() ;
											String usuario = txtusuario.getText();
											String contraseña = txtContraseña.getText();
										
											Connection con = BaseDeDatos.initBaseDatos("Clientes.db");
											BaseDeDatos.insertarCliente(con, nombre, eml, dni2, direccion , codigoPostal,fechanac, sexo, usuario, contraseña);
											BaseDeDatos.closeBD(con);
										
											JOptionPane.showMessageDialog( contentPane, "Registro  realizado" ); 
										} else {
											JOptionPane.showMessageDialog( contentPane, "Usuario o email ocupados" );
										}
									} catch (SQLException e1) {
										e1.printStackTrace();
									} 
										
								} else {
									JOptionPane.showMessageDialog( contentPane, "Contraseñas diferentes" ); 
								}
							 	
								
							} else {
								JOptionPane.showMessageDialog(null, "Campo DNI no validado", "Error",JOptionPane.ERROR_MESSAGE);
							}
					
				}else {
					JOptionPane.showMessageDialog( contentPane, "Debes rellenar todos campos" );
				}
			}
				});
		}
	}
		

		
//
//				} else if (txtEmail.getText().equals("")) {
//					JOptionPane.showMessageDialog(null, "Campo nombre no validado", "Error", JOptionPane.ERROR_MESSAGE);
//				} else {
//
//					Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
//							+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
//					String email = txtEmail.getText();
//					Matcher mather = pat.matcher(email);
//					if (mather.find() == true) {
//						ImageIcon im = (ImageIcon) lblAvatarIcono.getIcon();
//						String ruta = im.getDescription();
//						int pos = ruta.lastIndexOf("/");
//						ruta = "img/" + ruta.substring(pos + 1);

						// Meter todos los datos en la BBDD


