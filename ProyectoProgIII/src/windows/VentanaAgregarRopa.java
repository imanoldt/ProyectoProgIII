package windows;

import java.awt.*;

import javax.swing.*;

import clss.Talla;

public class VentanaAgregarRopa extends JFrame{
	private JLabel labelcod;
	private JLabel labeltalla;
	private JLabel labelprecio;
	private JLabel labelsexo;
	private JLabel labelmarca;
	private JLabel labelcolor;
	
	private JTextField tfcod;
	private JTextField tfprecio;
	private JTextField tfsexo;
	private JTextField tfmarca;
	private JTextField tfcolor;
	
	private JComboBox<Talla> cbtalla;
	
	
	public VentanaAgregarRopa(){
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		
		this.setSize(400, 300);
		this.setVisible(true);
		this.setTitle("Agregar Ropa");
		this.setBackground(new Color(183, 29, 57));
		
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
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		VentanaAgregarRopa ventana = new VentanaAgregarRopa();
	}

}
