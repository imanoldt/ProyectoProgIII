package windows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.*;

import clss.BaseDeDatos;
import clss.Talla;
import clss.TipoSexo;

public class VentanaAgregarRopa extends JFrame{
	private JLabel labelcod;
	private JLabel labeltalla;
	private JLabel labelprecio;
	private JLabel labelsexo;
	private JLabel labelmarca;
	private JLabel labelcolor;
	
	private JTextField tfcod;
	private JTextField tfprecio;
	
	private JTextField tfmarca;
	private JTextField tfcolor;
	
	private JComboBox<Talla> cbtalla;
	private JComboBox<TipoSexo> cbsexo;
	private JButton btnAgregar;
	
	
	
	
	public VentanaAgregarRopa(){
		Container cp = this.getContentPane();
//		cp.setLayout(new FlowLayout());
		cp.setLayout(new GridLayout(7,1));
		
		this.setSize(400, 200);
//		this.setUndecorated (true);
		setLocationRelativeTo(null);
		this.setTitle("Agregar Ropa");
		cp.setBackground(new Color(249, 194, 4));
		
		labelcod = new JLabel("Codigo: ");
		tfcod = new JTextField(20);
		cp.add(labelcod);
		cp.add(tfcod);
		
		labeltalla = new JLabel("Talla: ");
		cbtalla = new JComboBox<Talla>();
		for (Talla t : Talla.values()) {
			cbtalla.addItem(t);
		}
		
		cp.add(labeltalla);
		cp.add(cbtalla);
		
		labelprecio = new JLabel("Precio: ");
		tfprecio = new JTextField(20);
		
		cp.add(labelprecio);
		cp.add(tfprecio);
		
		labelsexo = new JLabel("Sexo: ");
		cbsexo = new JComboBox<TipoSexo>();
		for (TipoSexo ts : TipoSexo.values()) {
			cbsexo.addItem(ts);
		}
		
		cp.add(labelsexo);
		cp.add(cbsexo);
		
		labelmarca = new JLabel("Marca: ");
		tfmarca = new JTextField(20);
		cp.add(labelmarca);
		cp.add(tfmarca);
		
		labelcolor = new JLabel("Color: ");
		tfcolor = new JTextField(20);
		cp.add(labelcolor);
		cp.add(tfcolor);
		
		btnAgregar = new JButton("Agregar");
		cp.add(btnAgregar);
		
		btnAgregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int codigo = Integer.parseInt(tfcod.getText());
				Talla talla = (Talla) cbtalla.getSelectedItem();
				int precio = Integer.parseInt(tfprecio.getText());
				TipoSexo sexo = (TipoSexo) cbsexo.getSelectedItem();
				String marca = tfmarca.getText();
				String color = tfcolor.getText();
	
				Connection con = BaseDeDatos.initBaseDatos("Clientes.db");
				BaseDeDatos.insertarRopa(con, codigo, talla, precio, sexo, marca, color);
				BaseDeDatos.closeBD(con);
				BaseDeDatos.actualizaTabla(VentanaAdmin.mRopa);
				
			}
			});
		
	}
	
	
	
	public static void main(String[] args) {
		VentanaAgregarRopa ventana = new VentanaAgregarRopa();
		ventana.setVisible(true);
	}

}
