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

import clss.Articulo;
import clss.BaseDeDatos;
import clss.Camiseta;
import clss.Cliente;
import clss.Pantalon;
import clss.Sudadera;
import clss.Talla;
import clss.TipoArticulo;
import clss.TipoSexo;
import clss.Zapatos;

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
import java.util.Arrays;
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
import java.awt.Cursor;

public class VentanaAgregarRopaN extends JFrame {

	private JPanel contentPane, pnlCentral, pnlCentralIzq, pnlCentralDerecha;
	private JLabel labelcod, labeltalla, labelprecio, labelmarca, labelsexo, tipo, labelcolor, lblImagen;
	private JTextField tfcod, tfprecio, tfmarca, tfcolor;
	private JComboBox<TipoSexo> cbsexo;
	private JComboBox<Talla> cbtalla;
	private JComboBox<TipoArticulo> cbtipo;
	private JButton btnAgregar, btnBuscar;
	private JLabel lblV1, lblV4, lbl3, lblV2;
	private JSeparator separator, separator_1, separator_2, separator_3;
	private JButton btnCerrar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtruta;
	private JLabel lblNewLabel_2;

	/**
	 * Create the frame.
	 */
	public VentanaAgregarRopaN() throws ParseException {
		setBounds(100, 100, 1072, 371);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setTitle("Agregar Articulos");
		setContentPane(contentPane);

		pnlCentral = new JPanel();
		pnlCentral.setBackground(new Color(227, 48, 73));
		contentPane.add(pnlCentral, BorderLayout.CENTER);
		pnlCentral.setLayout(new BorderLayout(0, 0));

		pnlCentralIzq = new JPanel();
		pnlCentralIzq.setBackground(new Color(227, 48, 73));
		pnlCentral.add(pnlCentralIzq, BorderLayout.WEST);
		pnlCentralIzq.setLayout(new GridLayout(8, 2, 0, 0));
		pnlCentralIzq.setPreferredSize(new Dimension(700, 0));

		
		labelcod = new JLabel("Codigo: ");
		labelcod.setForeground(Color.WHITE);
		labelcod.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		pnlCentralIzq.add(labelcod);
		tfcod = new JTextField();
		tfcod.setColumns(10);
		pnlCentralIzq.add(tfcod);

		labeltalla = new JLabel("Talla: ");
		labeltalla.setForeground(Color.WHITE);
		labeltalla.setFont(new Font("Montserrat", Font.PLAIN, 14));
		pnlCentralIzq.add(labeltalla);

		cbtalla = new JComboBox<Talla>();
		for (Talla t : Talla.values()) {
			cbtalla.addItem(t);
		}
		pnlCentralIzq.add(cbtalla);

		labelprecio = new JLabel("Precio:");
		labelprecio.setForeground(Color.WHITE);
		labelprecio.setFont(new Font("Montserrat", Font.PLAIN, 14));
		pnlCentralIzq.add(labelprecio);

		tfprecio = new JTextField();
		tfprecio.setColumns(10);
		pnlCentralIzq.add(tfprecio);

		
		cbtipo = new JComboBox();
		cbtipo = new JComboBox<TipoArticulo>();
		for (TipoArticulo ta : TipoArticulo.values()) {
			cbtipo.addItem(ta);
		}
	
		tipo = new JLabel("Tipo de articulo:");
		tipo.setForeground(Color.WHITE);
		tipo.setFont(new Font("Montserrat", Font.PLAIN, 14));
		pnlCentralIzq.add(tipo);

		cbtipo = new JComboBox();
		cbtipo = new JComboBox<TipoArticulo>();
		for (TipoArticulo ta : TipoArticulo.values()) {
			cbtipo.addItem(ta);
		}
		pnlCentralIzq.add(cbtipo);

		labelmarca = new JLabel("Marca: ");
		labelmarca.setForeground(Color.WHITE);
		labelmarca.setFont(new Font("Montserrat", Font.PLAIN, 14));
		pnlCentralIzq.add(labelmarca);

		tfmarca = new JTextField();
		tfmarca.setColumns(10);
		pnlCentralIzq.add(tfmarca);

		

		labelsexo = new JLabel("Sexo: ");
		cbsexo = new JComboBox<TipoSexo>();
		for (TipoSexo ts : TipoSexo.values()) {
			cbsexo.addItem(ts);
		}
		
		labelsexo = new JLabel("Sexo:");
		labelsexo.setForeground(Color.WHITE);
		labelsexo.setFont(new Font("Montserrat", Font.PLAIN, 14));
		pnlCentralIzq.add(labelsexo);

		
		cbsexo = new JComboBox<TipoSexo>();
		for (TipoSexo ts : TipoSexo.values()) {
			cbsexo.addItem(ts);
		}
		
		pnlCentralIzq.add(cbsexo);
		
		labelcolor = new JLabel("Color:");
		labelcolor.setForeground(Color.WHITE);
		labelcolor.setFont(new Font("Montserrat", Font.PLAIN, 14));
		pnlCentralIzq.add(labelcolor);
		
		tfcolor = new JTextField();
		tfcolor.setColumns(10);
		pnlCentralIzq.add(tfcolor);
				
						lblV2 = new JLabel("");
						lblV2.setEnabled(false);
						pnlCentralIzq.add(lblV2);
				
				lblNewLabel_1 = new JLabel("");
				pnlCentralIzq.add(lblNewLabel_1);
		
				lblImagen = new JLabel("Buscar Imagen:");
				lblImagen.setForeground(Color.WHITE);
				lblImagen.setFont(new Font("Montserrat", Font.PLAIN, 14));
				pnlCentralIzq.add(lblImagen);
		
				btnBuscar = new JButton("Buscar");
				btnBuscar.setFont(new Font("Montserrat", Font.PLAIN, 13));
				btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
						pnlCentralIzq.add(btnBuscar);
						
						btnBuscar.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
						
										JFileChooser fc = new JFileChooser("src/img");
										FileFilter filter = new FileNameExtensionFilter("JPG file", new String[] { "jpg" });
										fc.setFileFilter(filter);
										int seleccion = fc.showOpenDialog(null);
										if (seleccion == JFileChooser.APPROVE_OPTION) {
											File fSeleccionado = fc.getSelectedFile();
											int input = JOptionPane.showConfirmDialog(null, "¿Seguro que este es el archivo correcto?",
													"Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
											if (input == JOptionPane.YES_OPTION) {
												String nombreFoto = fSeleccionado.getName();
												System.out.println(nombreFoto);
												String rutaFoto = "src/img/";
												if (cbtipo.getSelectedItem() == TipoArticulo.Camiseta) {
													rutaFoto = rutaFoto + "camisetas/" +nombreFoto;
												}else if (cbtipo.getSelectedItem() == TipoArticulo.Pantalon) {
													rutaFoto = rutaFoto + "pantalones/" +nombreFoto;
												}else if (cbtipo.getSelectedItem() == TipoArticulo.Sudadera) {
													rutaFoto = rutaFoto + "sudaderas/" +nombreFoto;
												}else if (cbtipo.getSelectedItem() == TipoArticulo.Zapatos) {
													rutaFoto = rutaFoto + "zapatos/" +nombreFoto;
												}
												System.out.println(rutaFoto);
												
												ImageIcon imgIcon = new ImageIcon(rutaFoto);
												Image imgEscalada = imgIcon.getImage().getScaledInstance(199, 199, Image.SCALE_SMOOTH);
												ImageIcon im = new ImageIcon(imgEscalada);
												im.setDescription(rutaFoto);
												lblImagen.setIcon(im);
									            txtruta.setText(rutaFoto);
											} else {
						
											}
						
										} else {
											JOptionPane.showMessageDialog(fc, "No se ha encontrado el archivo");
										}
						
									}
						
								});
		
		txtruta = new JTextField();
		pnlCentralIzq.add(txtruta);
		txtruta.setColumns(10);
		txtruta.setEditable(false);
        txtruta.setBackground(new java.awt.Color(204, 204, 255));
		
		lblNewLabel_2 = new JLabel("");
		pnlCentralIzq.add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("");
		pnlCentralIzq.add(lblNewLabel);
		
		
				lbl3 = new JLabel("");
				lbl3.setEnabled(false);
				pnlCentralIzq.add(lbl3);
				
				lblV1 = new JLabel("");
				lblV1.setEnabled(false);
				
						pnlCentralIzq.add(lblV1);
		
				lblV4 = new JLabel("");
				lblV4.setEnabled(false);
				pnlCentralIzq.add(lblV4);
				
						separator = new JSeparator();
						pnlCentralIzq.add(separator);
				
						separator_3 = new JSeparator();
						pnlCentralIzq.add(separator_3);

		separator_1 = new JSeparator();
		pnlCentralIzq.add(separator_1);

		separator_2 = new JSeparator();
		pnlCentralIzq.add(separator_2);

		pnlCentralDerecha = new JPanel();
		pnlCentralDerecha.setBackground(new Color(227, 48, 73));
		pnlCentral.add(pnlCentralDerecha, BorderLayout.EAST);
		pnlCentralDerecha.setLayout(new MigLayout("", "[232.00]", "[1px][127.00,grow][][17.00][][-42.00]"));

		lblImagen = new JLabel("");

		lblImagen.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCentralDerecha.add(lblImagen, "cell 0 1,grow");

		

		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Montserrat", Font.PLAIN, 13));
		btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		pnlCentralDerecha.add(btnAgregar, "cell 0 3,grow");

		btnCerrar = new JButton("Cancelar");
		btnCerrar.setFont(new Font("Montserrat", Font.PLAIN, 13));
	
		pnlCentralDerecha.add(btnCerrar, "cell 0 4,growx,aligny center");

// EVENTOS
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		btnAgregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!tfprecio.getText().isEmpty() && !tfmarca.getText().isEmpty() && !tfcolor.getText().isEmpty()
						&& !txtruta.getText().isEmpty()) {
					try  {
						int codigo = Integer.parseInt(tfcod.getText());
						BaseDeDatos.initBaseDatos("Clientes.db");
						BaseDeDatos.comprobarCodigo(codigo);
						if (BaseDeDatos.rs.next()) {
							JOptionPane.showMessageDialog(null, "Código ya existente, introduce otro código", "Error", JOptionPane.ERROR_MESSAGE);
						
						} else {
							TipoArticulo tipo = (TipoArticulo) cbtipo.getSelectedItem();
							Talla talla = (Talla) cbtalla.getSelectedItem();
							int precio = Integer.parseInt(tfprecio.getText());
							TipoSexo sexo = (TipoSexo) cbsexo.getSelectedItem();
							String marca = tfmarca.getText();
							String color = tfcolor.getText();
							String ruta = txtruta.getText();					        
						        if(ruta!=null){
									if (tipo == TipoArticulo.Camiseta) {
										Articulo a1 = new Camiseta(codigo,tipo, talla, precio, sexo, marca, color, ruta);
										BaseDeDatos.insertarRopa(a1);
										BaseDeDatos.actualizaTabla(VentanaAdminN.mRopa);
										BaseDeDatos.closeBD(BaseDeDatos.con);
										JOptionPane.showMessageDialog( contentPane, "Se ha agregado el articulo correctamente" );
										limpiar();
										
									}else if (tipo == TipoArticulo.Sudadera){
										Articulo a1 = new Sudadera(codigo,tipo, talla, precio, sexo, marca, color, ruta);
										BaseDeDatos.insertarRopa(a1);
										BaseDeDatos.actualizaTabla(VentanaAdminN.mRopa);
										BaseDeDatos.closeBD(BaseDeDatos.con);
										JOptionPane.showMessageDialog( contentPane, "Se ha agregado el articulo correctamente" );
										limpiar();
									}else if (tipo == TipoArticulo.Pantalon){
										Articulo a1 = new Pantalon(codigo,tipo, talla, precio, sexo, marca, color, ruta);
										BaseDeDatos.insertarRopa(a1);
										BaseDeDatos.actualizaTabla(VentanaAdminN.mRopa);
										BaseDeDatos.closeBD(BaseDeDatos.con);
										JOptionPane.showMessageDialog( contentPane, "Se ha agregado el articulo correctamente" );
										limpiar();
									}else if (tipo == TipoArticulo.Zapatos){
										Articulo a1 = new Zapatos(codigo,tipo, talla, precio, sexo, marca, color, ruta);
										BaseDeDatos.insertarRopa(a1);
										BaseDeDatos.actualizaTabla(VentanaAdminN.mRopa);
										BaseDeDatos.closeBD(BaseDeDatos.con);
										JOptionPane.showMessageDialog( contentPane, "Se ha agregado el articulo correctamente" );
										limpiar();
								}
						        }else{
						        	JOptionPane.showMessageDialog(null, "Introduce una imagen", "Error", JOptionPane.ERROR_MESSAGE);
						        }
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Debes rellenar todos campos", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
	}
	
	public void limpiar(){
		tfcod.setText("");
		tfprecio.setText("");
		tfmarca.setText("");
		tfcolor.setText("");
        txtruta.setText("");
    }
	
	
//	public static void main(String[] args) throws ParseException {
//		VentanaAgregarRopaN ventana = new VentanaAgregarRopaN();
//		ventana.setVisible(true);
//	}
	
	
	
}