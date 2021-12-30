//package windows;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.logging.Level;
//
//import javax.swing.*;
//import javax.swing.filechooser.FileFilter;
//import javax.swing.filechooser.FileNameExtensionFilter;
//
//import clss.Articulo;
//import clss.BaseDeDatos;
//import clss.Camiseta;
//import clss.Pantalon;
//import clss.Sudadera;
//import clss.Talla;
//import clss.TipoArticulo;
//import clss.TipoSexo;
//import clss.Zapatos;
//
//public class VentanaAgregarRopa extends JFrame{
//	private JLabel labelcod;
//	private JLabel labeltalla;
//	private JLabel labelprecio;
//	private JLabel labelsexo;
//	private JLabel labelmarca;
//	private JLabel labelcolor;
//	
//	private JTextField tfcod;
//	private JTextField tfprecio;
//	
//	private JTextField tfmarca;
//	private JTextField tfcolor;
//	
//	private JComboBox<Talla> cbtalla;
//	private JComboBox<TipoSexo> cbsexo;
//	private JButton btnAgregar;
//	private JLabel tipo;
//	private JSeparator separator;
//	private JSeparator separator_1;
//	private JSeparator separator_2;
//	private JSeparator separator_3;
//	private JLabel lblNewLabel_2;
//	private JLabel lblNewLabel_3;
//	private JButton btnCancelar;
//	private JComboBox cbtipo;
//	private JButton btnSeleccionar;
//	
//	
//	
//	
//	public VentanaAgregarRopa(){
//		Container cp = this.getContentPane();
////		cp.setLayout(new FlowLayout());
//		cp.setLayout(new GridLayout(7,1));
//		
//		this.setSize(492, 242);
////		this.setUndecorated (true);
//		setLocationRelativeTo(null);
//		this.setTitle("Agregar Ropa");
//		cp.setBackground(new Color(249, 194, 4));
//		
//		labelcod = new JLabel("Codigo: ");
//		tfcod = new JTextField(20);
//		cp.add(labelcod);
//		cp.add(tfcod);
//		
//		labeltalla = new JLabel("Talla: ");
//		cbtalla = new JComboBox<Talla>();
//		for (Talla t : Talla.values()) {
//			cbtalla.addItem(t);
//		}
//		
//		
//		cbtipo = new JComboBox();
//		cbtipo = new JComboBox<TipoArticulo>();
//		for (TipoArticulo ta : TipoArticulo.values()) {
//			cbtipo.addItem(ta);
//		}
//		
//		tipo = new JLabel("Tipo de articulo: ");
//		cp.add(tipo);
//		
//		cp.add(cbtipo);
//		
//		
//		
//		cp.add(labeltalla);
//		cp.add(cbtalla);
//		
//		labelprecio = new JLabel("Precio: ");
//		tfprecio = new JTextField(20);
//		
//		cp.add(labelprecio);
//		cp.add(tfprecio);
//		
//		labelsexo = new JLabel("Sexo: ");
//		cbsexo = new JComboBox<TipoSexo>();
//		for (TipoSexo ts : TipoSexo.values()) {
//			cbsexo.addItem(ts);
//		}
//		
//		cp.add(labelsexo);
//		cp.add(cbsexo);
//		
//		labelmarca = new JLabel("Marca: ");
//		tfmarca = new JTextField(20);
//		cp.add(labelmarca);
//		cp.add(tfmarca);
//		
//		labelcolor = new JLabel("Color: ");
//		tfcolor = new JTextField(20);
//		cp.add(labelcolor);
//		cp.add(tfcolor);
//		
//		lblNewLabel_3 = new JLabel("Buscar Imagen:");
//		getContentPane().add(lblNewLabel_3);
//		
//		
//	
//		
//		
//		btnSeleccionar = new JButton("Buscar");
//		btnSeleccionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnSeleccionar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JFileChooser fc = new JFileChooser("src/img");
//				FileFilter filter = new FileNameExtensionFilter("PNG file", new String[] { "png" });
//				fc.setFileFilter(filter);
//				int seleccion = fc.showOpenDialog(null);
//				if (seleccion == JFileChooser.APPROVE_OPTION) {
//					File fSeleccionado = fc.getSelectedFile();
//					int input = JOptionPane.showConfirmDialog(null, "¿Seguro que este es el archivo correcto?",
//							"Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
//					if (input == JOptionPane.YES_OPTION) {
//						String rutaFoto = fSeleccionado.getAbsolutePath();
//						System.out.println(rutaFoto);
//						ImageIcon imgIcon = new ImageIcon(rutaFoto);
//						Image imgEscalada = imgIcon.getImage().getScaledInstance(199, 199, Image.SCALE_SMOOTH);
//						ImageIcon im = new ImageIcon(imgEscalada);
//						im.setDescription(rutaFoto);
//						lblNewLabel_2.setIcon(im);
//						// ImageIcon imgIcon = new ImageIcon(rutaFoto);
//						// lblAvatarIcono.setIcon(imgIcon);
//
//					} else {
//
//					}
//
//				} else {
//					JOptionPane.showMessageDialog(fc, "No se ha encontrado el archivo");
//				}
//			}
//		});
//		getContentPane().add(btnSeleccionar);
//		
//		separator = new JSeparator();
//		getContentPane().add(separator);
//		
//		separator_1 = new JSeparator();
//		getContentPane().add(separator_1);
//		
//		separator_2 = new JSeparator();
//		getContentPane().add(separator_2);
//		
//		separator_3 = new JSeparator();
//		getContentPane().add(separator_3);
//		
//		lblNewLabel_2 = new JLabel("");
//		getContentPane().add(lblNewLabel_2);
//		
//		btnCancelar = new JButton("Cancelar");
//		cp.add(btnCancelar);
//		
//		btnAgregar = new JButton("Agregar");
//		getContentPane().add(btnAgregar);
//		
//		btnCancelar.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//			});
//		
//		btnAgregar.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				try  {
//					int codigo = Integer.parseInt(tfcod.getText());
//					
//					BaseDeDatos.comprobarCodigo(codigo);
//					if (BaseDeDatos.rs.next()) {
//						JOptionPane.showMessageDialog(null, "Código ya existente, introduce otro código", "Error", JOptionPane.ERROR_MESSAGE);
//					
//					} else {
//						TipoArticulo tipo = (TipoArticulo) cbtipo.getSelectedItem();
//						Talla talla = (Talla) cbtalla.getSelectedItem();
//						int precio = Integer.parseInt(tfprecio.getText());
//						TipoSexo sexo = (TipoSexo) cbsexo.getSelectedItem();
//						String marca = tfmarca.getText();
//						String color = tfcolor.getText();
//						String imagen = 
//						if (tipo == TipoArticulo.Camiseta) {
//							Articulo a1 = new Camiseta(codigo,tipo, talla, precio, sexo, marca, color);
//							BaseDeDatos.insertarRopa(a1);
//							BaseDeDatos.actualizaTabla(VentanaAdminN.mRopa);
//							JOptionPane.showMessageDialog( cp, "Se ha agregado el articulo correctamente" );
//							
//						}else if (tipo == TipoArticulo.Sudadera){
//							Articulo a1 = new Sudadera(codigo,tipo, talla, precio, sexo, marca, color);
//							BaseDeDatos.insertarRopa(a1);
//							BaseDeDatos.actualizaTabla(VentanaAdminN.mRopa);
//							JOptionPane.showMessageDialog( cp, "Se ha agregado el articulo correctamente" );
//							
//						}else if (tipo == TipoArticulo.Pantalon){
//							Articulo a1 = new Pantalon(codigo,tipo, talla, precio, sexo, marca, color);
//							BaseDeDatos.insertarRopa(a1);
//							BaseDeDatos.actualizaTabla(VentanaAdminN.mRopa);
//							JOptionPane.showMessageDialog( cp, "Se ha agregado el articulo correctamente" );
//							
//						}else if (tipo == TipoArticulo.Zapatos){
//							Articulo a1 = new Zapatos(codigo,tipo, talla, precio, sexo, marca, color);
//							BaseDeDatos.insertarRopa(a1);
//							BaseDeDatos.actualizaTabla(VentanaAdminN.mRopa);
//							JOptionPane.showMessageDialog( cp, "Se ha agregado el articulo correctamente" );
//						
//					}
//					}
//					
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//				
//			}
//			});
//		
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		VentanaAgregarRopa ventana = new VentanaAgregarRopa();
//		ventana.setVisible(true);
//	}
//
//}
