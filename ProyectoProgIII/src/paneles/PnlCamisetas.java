package paneles;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;


import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class PnlCamisetas extends JPanel {

	private static JComboBox<String> opciones = new JComboBox<String>(); 

	public PnlCamisetas() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		anyardirArticulos(10);
	
		

	}
	
	private void anyardirArticulos(int number) {
		for (int i = 0; i < number; i++) {
			add(getCuadroArticulo("#Camisetas " + i));
			añadirComboBox();
		}
	}

	private Button getCuadroArticulo(String text) {
		Button button = new Button(text);
		button.setBackground(new Color(249, 194, 4));
		button.setPreferredSize(new Dimension(200, 200));
		
		return button;
	}

	private static void añadirComboBox() {
		opciones.addItem("uno");
		opciones.addItem("dos");
		opciones.addItem("tres");
		opciones.setVisible(true);
	}

}
