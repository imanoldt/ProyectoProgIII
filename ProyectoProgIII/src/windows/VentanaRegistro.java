package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clss.BaseDeDatos;
import clss.TipoSexo;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;

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
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JTextField txtDireccion;
	private JLabel lblNewLabel_6;
	private JTextField txtCodigoPostal;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JComboBox<TipoSexo> comboBox;
	private JLabel lblNewLabel_12;
	private JTextField txtFecha;
	private JSeparator separator;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_7;
	private JTextField txtContraseña;
	private JTextField txtusuario;
	private JLabel lblNewLabel_4;

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
		panel.setBackground(Color.YELLOW);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		lblNewLabel = new JLabel("Nombre:");
		panel.add(lblNewLabel);
		
		txtNombre = new JTextField();
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Email:");
		panel.add(lblNewLabel_1);
		
		txtEmail = new JTextField();
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		lblNewLabel_2 = new JLabel("DNI (sin letra):");
		panel.add(lblNewLabel_2);
		
		txtDni = new JTextField();
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Sexo");
		panel.add(lblNewLabel_3);
		
		panel.add(lblNewLabel_3);
		
		comboBox = new JComboBox<TipoSexo>();
		panel.add(comboBox);
		
		lblNewLabel_5 = new JLabel("Direccion:");
		panel.add(lblNewLabel_5);
		
		txtDireccion = new JTextField();
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Codigo Postal:");
		panel.add(lblNewLabel_6);
		
		txtCodigoPostal = new JTextField();
		panel.add(txtCodigoPostal);
		txtCodigoPostal.setColumns(10);
		
		lblNewLabel_15 = new JLabel("Usuario: ");
		panel.add(lblNewLabel_15);
		
		txtusuario = new JTextField();
		panel.add(txtusuario);
		txtusuario.setColumns(10);
		
		lblNewLabel_12 = new JLabel("Fecha_nac (DD/MM/AAAA):");
		panel.add(lblNewLabel_12);
		
		txtFecha = new JTextField();
		panel.add(txtFecha);
		txtFecha.setColumns(10);
		
		lblNewLabel_16 = new JLabel("Contraseña:");
		panel.add(lblNewLabel_16);
		
		txtContraseña = new JTextField();
		panel.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		lblNewLabel_7 = new JLabel("");
		panel.add(lblNewLabel_7);
		for (TipoSexo ts : TipoSexo.values()) {
			comboBox.addItem(ts);
		}
		
		lblNewLabel_4 = new JLabel("");
		panel.add(lblNewLabel_4);
		
		separator_2 = new JSeparator();
		panel.add(separator_2);
		
		separator = new JSeparator();
		panel.add(separator);
		
		separator_1 = new JSeparator();
		panel.add(separator_1);
		
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
		
			
				
				btnNewButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if (!txtNombre.getText().isEmpty() && !txtDni.getText().isEmpty() && !txtEmail.getText().isEmpty() && !txtDireccion.getText().isEmpty() && !txtCodigoPostal.getText().isEmpty() && !txtFecha.getText().isEmpty() && !txtusuario.getText().isEmpty() && !txtusuario.getText().isEmpty() && !txtContraseña.getText().isEmpty()) {
							String nombre = txtNombre.getText();
							String email = txtEmail.getText();
							int dni = Integer.parseInt(txtDni.getText());
							TipoSexo sexo = (TipoSexo) comboBox.getSelectedItem();
							String direccion = txtDireccion.getText();
							int codigoPostal = Integer.parseInt(txtCodigoPostal.getText());
							String fechanac = txtFecha.getText();
							String usuario = txtusuario.getText();
							String contraseña = txtContraseña.getText();
							
							Connection con = BaseDeDatos.initBaseDatos("Clientes.db");
//							BaseDeDatos.insertarCliente(con, nombre, email, dni, direccion , codigoPostal,fechanac, sexo, usuario, contraseña);
							BaseDeDatos.closeBD(con);
							
						} else {
							JOptionPane.showMessageDialog( contentPane, "Debes rellenar todos campos" );
						}
			
					}
				});
		
		btnNewButton_1 = new JButton("Volver");
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Cerrar");
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Borrar");
		panel.add(btnNewButton_3);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
			}
	});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaLoginN registro = new VentanaLoginN();
				registro.setVisible(true);
				setVisible(false);
			}
		});
	}
}
				



