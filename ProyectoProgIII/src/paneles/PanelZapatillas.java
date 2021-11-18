package paneles;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class PanelZapatillas extends JPanel {
	
	private JLabel lblNewLabel;
	private JPanel pnlDerechaa;
	private JPanel pnlNorte;

	public PanelZapatillas() {
		
		
		setLayout(new BorderLayout());
		pnlNorte = new JPanel();
		pnlNorte.setPreferredSize(new Dimension(10, 40));
		pnlNorte.setBackground(new Color(227, 48, 73));
		add(pnlNorte, BorderLayout.NORTH);
		pnlNorte.setLayout(new BorderLayout(0, 0));
		
		
		
		
		JLabel lblTitulo=new JLabel("Zapatillas", SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Monaco", Font.PLAIN, 16));
		pnlNorte.add(lblTitulo,BorderLayout.CENTER);
		
	
		
		


	}

}


