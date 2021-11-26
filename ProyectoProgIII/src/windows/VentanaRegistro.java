package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clss.BaseDeDatos;
import clss.Talla;
import clss.TipoSexo;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField txtNombre;
	private JLabel lblNewLabel_1;
	private JTextField txtEmail;
	private JLabel lblNewLabel_2;
	private JTextField txtDni;
	private JLabel lblRegistro;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_3;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_5;
	private JTextField txtDireccion;
	private JLabel lblNewLabel_6;
	private JTextField txtCodigoPostal;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
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
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(9, 3, 0, 0));
		
		lblRegistro = new JLabel("Registro:");
		panel.add(lblRegistro);
		
		lblNewLabel_7 = new JLabel("");
		panel.add(lblNewLabel_7);
		
		lblNewLabel_4 = new JLabel("");
		panel.add(lblNewLabel_4);
		
		lblNewLabel = new JLabel("Nombre:");
		panel.add(lblNewLabel);
		
		txtNombre = new JTextField();
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblNewLabel_8 = new JLabel("");
		panel.add(lblNewLabel_8);
		
		lblNewLabel_1 = new JLabel("Email:");
		panel.add(lblNewLabel_1);
		
		txtEmail = new JTextField();
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		lblNewLabel_9 = new JLabel("");
		panel.add(lblNewLabel_9);
		
		lblNewLabel_2 = new JLabel("DNI:");
		panel.add(lblNewLabel_2);
		
		txtDni = new JTextField();
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		lblNewLabel_10 = new JLabel("");
		panel.add(lblNewLabel_10);
		
		lblNewLabel_3 = new JLabel("Sexo");
		panel.add(lblNewLabel_3);
		
		rdbtnNewRadioButton = new JRadioButton("Hombre");
		panel.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Mujer");
		panel.add(rdbtnNewRadioButton_1);
		
		lblNewLabel_5 = new JLabel("Direccion:");
		panel.add(lblNewLabel_5);
		
		txtDireccion = new JTextField();
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		lblNewLabel_11 = new JLabel("");
		panel.add(lblNewLabel_11);
		
		lblNewLabel_6 = new JLabel("Codigo Postal:");
		panel.add(lblNewLabel_6);
		
		txtCodigoPostal = new JTextField();
		panel.add(txtCodigoPostal);
		txtCodigoPostal.setColumns(10);
		
		separator = new JSeparator();
		panel.add(separator);
		
		separator_1 = new JSeparator();
		panel.add(separator_1);
		
		separator_2 = new JSeparator();
		panel.add(separator_2);
		
		separator_3 = new JSeparator();
		panel.add(separator_3);
		
		btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(( (txtNombre != null) && (!txtNombre.equals(" ")))){
					if(( (txtNombre != null) && (!txtNombre.equals(" ")))){
						if(( (txtNombre != null) && (!txtNombre.equals(" ")))){
							if(( (txtNombre != null) && (!txtNombre.equals(" ")))){
								if(( (txtNombre != null) && (!txtNombre.equals(" ")))){
									
								}
							}
						}
					}
					
					
				}
			}
		});
		
		
		
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Volver");
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Cerrar");
		panel.add(btnNewButton_2);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaLoginN registro = new VentanaLoginN();
				registro.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
			}
	});
		
		
		
	
	}

}
