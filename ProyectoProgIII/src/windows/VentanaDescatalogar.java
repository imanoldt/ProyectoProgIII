package windows;

import java.awt.*;
import javax.swing.*;

public class VentanaDescatalogar extends JFrame{
	
	protected JPanel arriba;
	protected JPanel abajo;
	protected JLabel insertar;
	public JTextField tfInsertarCod;
	
	protected JButton aceptar;
	protected JButton cancelar;
	
	public VentanaDescatalogar() {
		this.setSize(450, 100);
		this.setUndecorated (true);
		setLocationRelativeTo(null);
		Container cp = this.getContentPane();
		cp.setLayout(new GridLayout(2, 1));
		
		arriba = new JPanel();
		abajo = new JPanel();
		cp.add(arriba);
		cp.add(abajo);
		
		arriba.setBackground(new Color(249, 194, 4));
		abajo.setBackground(new Color(249, 194, 4));
		
		insertar = new JLabel("Inserte el código de la prenda que desea borrar : ");
		tfInsertarCod = new JTextField(10);
		arriba.add(insertar);
		arriba.add(tfInsertarCod);
		
		aceptar = new JButton("aceptar");
		cancelar = new JButton("cancelar");
		
		abajo.add(cancelar);
		abajo.add(aceptar);
		
		
		
	}

	public static void main(String[] args) {
		VentanaDescatalogar ventana = new VentanaDescatalogar();
		 ventana.setVisible(true);
		
	}

}
