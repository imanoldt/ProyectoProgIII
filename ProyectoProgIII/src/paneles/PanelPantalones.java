package paneles;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class PanelPantalones extends JPanel {
	
	private JLabel lblNewLabel;
	private JPanel pnlDerechaa;
	private JPanel pnlNorte;

	public PanelPantalones() {
		
		
		setLayout(new BorderLayout());
		pnlNorte = new JPanel();
		pnlNorte.setPreferredSize(new Dimension(10, 40));
		pnlNorte.setBackground(Color.BLACK);
		add(pnlNorte, BorderLayout.NORTH);
		pnlNorte.setLayout(new GridLayout(0, 1, 0, 0));
		

		JLabel lblTitulo=new JLabel("Pantalones", SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Monaco", Font.PLAIN, 16));
		lblTitulo.setForeground(Color.WHITE);
		pnlNorte.add(lblTitulo);
		

	
		

	}

}


