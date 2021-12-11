package paneles;

import javax.swing.JPanel;


import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class PnlCamisetas extends JPanel {


	public PnlCamisetas() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		


		anyardirArticulos(10);
		

	}
	
	private void anyardirArticulos(int number) {
		for (int i = 0; i < number; i++) {
			add(getCuadroArticulo("#Camisetas " + i));
		}
	}

	private Button getCuadroArticulo(String text) {
		Button button = new Button(text);
		button.setBackground(new Color(249, 194, 4));
		button.setPreferredSize(new Dimension(200, 200));
		return button;
	}

}
