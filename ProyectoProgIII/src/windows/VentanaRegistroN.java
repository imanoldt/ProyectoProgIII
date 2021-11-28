package windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
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

@SuppressWarnings("serial")
public class VentanaRegistroN extends JFrame {

	private JPanel contentPane, pnlSuperior, pnlCentral, pnlCentralIzq, pnlCentralDerecha;

	private JLabel lblNombre, lblDni, lblEmail, lblDireccion, lblFNacimiento, lblCodigoPostal, lblSexo, lblAvatar,
			lblRegistro, lblAvatarIcono;
	private JTextField txtNombre, txtDni, txtEmail, txtDir, txtCodigoPostal;

	private JDateChooser dChooser;

	private JComboBox<String> cbSexo;
	private JButton btnRegistrarse, btnCerrar, btnSeleccionar;

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

		dChooser = new JDateChooser();

		long millisSystem = System.currentTimeMillis();
		Date currentDate = new Date(millisSystem);
		Date fMax = currentDate;
		dChooser.setMaxSelectableDate(fMax);

		pnlCentralIzq.add(dChooser);

		lblCodigoPostal = new JLabel("Codigo Postal:");
		lblCodigoPostal.setForeground(Color.WHITE);
		lblCodigoPostal.setFont(new Font("Monaco", Font.PLAIN, 14));
		pnlCentralIzq.add(lblCodigoPostal);

		txtCodigoPostal = new JTextField();
		txtCodigoPostal.setColumns(10);
		pnlCentralIzq.add(txtCodigoPostal);

		lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(Color.WHITE);
		pnlCentralIzq.add(lblSexo);

		cbSexo = new JComboBox();
		cbSexo.addItem("Mujer");
		cbSexo.addItem("Hombre");
		cbSexo.setSelectedIndex(-1);
		pnlCentralIzq.add(cbSexo);

		lblAvatar = new JLabel("Avatar:");
		lblAvatar.setForeground(Color.WHITE);
		pnlCentralIzq.add(lblAvatar);

		btnSeleccionar = new JButton("Buscar");

		pnlCentralIzq.add(btnSeleccionar);

		pnlCentralDerecha = new JPanel();
		pnlCentralDerecha.setBackground(new Color(227, 48, 73));
		pnlCentral.add(pnlCentralDerecha, BorderLayout.EAST);
		pnlCentralDerecha.setLayout(new MigLayout("", "[232.00]", "[1px][127.00,grow][][17.00][][-42.00]"));

		lblAvatarIcono = new JLabel("");

		lblAvatarIcono.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblAvatarIcono.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCentralDerecha.add(lblAvatarIcono, "cell 0 1,grow");

		btnRegistrarse = new JButton("Registrarme");

		pnlCentralDerecha.add(btnRegistrarse, "cell 0 3,grow");

		btnCerrar = new JButton("Cerrar");
		pnlCentralDerecha.add(btnCerrar, "cell 0 4,growx");

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

		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtNombre.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Campo nombre no validado", "Error", JOptionPane.ERROR_MESSAGE);
				} else if (!txtDni.getText().equals("")) {
					Pattern pat = Pattern.compile("[0-9]{7,8}[A-Z]");
					String dni = txtDni.getText();
					Matcher mat = pat.matcher(dni);
					boolean cumplePatron = mat.matches();

					if (cumplePatron == true) {

					} else {
						JOptionPane.showMessageDialog(null, "Campo DNI no validado", "Error",
								JOptionPane.ERROR_MESSAGE);

					}
				} else if (txtCodigoPostal.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Campo codigo postal no validado", "Error",
							JOptionPane.ERROR_MESSAGE);

				} else if (txtEmail.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Campo nombre no validado", "Error", JOptionPane.ERROR_MESSAGE);
				} else if (txtDir.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Campo direccion no validado", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {

					Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
							+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
					String email = txtEmail.getText();
					Matcher mather = pat.matcher(email);
					if (mather.find() == true) {
						ImageIcon im = (ImageIcon) lblAvatarIcono.getIcon();
						String ruta = im.getDescription();
						int pos = ruta.lastIndexOf("/");
						ruta = "img/" + ruta.substring(pos + 1);

						// Meter todos los datos en la BBDD

					} else {
						System.out.println("El email ingresado es inválido.");
						JOptionPane.showMessageDialog(null, "El email ingresado no es válido", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

				}

			}
		});

	}

}