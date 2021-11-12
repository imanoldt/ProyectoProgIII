package windows;

import java.awt.*;

import javax.swing.*;

public class VentanaAgregarRopa extends JFrame{
	
	
	public VentanaAgregarRopa(){
		Container cp = this.getContentPane();
		
		this.setSize(400, 300);
		this.setVisible(true);
		this.setTitle("Agregar Ropa");
//		this.setBackground(new Color());
	}
	
	
	public static void main(String[] args) {
		VentanaAgregarRopa ventana = new VentanaAgregarRopa();
	}

}
