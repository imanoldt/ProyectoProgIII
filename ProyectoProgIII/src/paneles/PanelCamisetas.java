package paneles;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import windows.VentanaLoginN;

public class PanelCamisetas extends JPanel {
	
	private JLabel lblNewLabel;
	private JPanel pnlDerechaa;
	private JPanel pnlNorte;

	public PanelCamisetas() {
		
		
		setLayout(new BorderLayout());
		pnlNorte = new JPanel();
		pnlNorte.setPreferredSize(new Dimension(10, 40));
		pnlNorte.setBackground(new Color(227, 48, 73));
		add(pnlNorte, BorderLayout.NORTH);
		pnlNorte.setLayout(new BorderLayout(0, 0));
	

		JLabel lblTitulo=new JLabel("Camisetas", SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Monaco", Font.PLAIN, 16));
		pnlNorte.add(lblTitulo,BorderLayout.CENTER);
		
		JLabel JLabelImagen = new JLabel();
		JLabelImagen.setIcon(new ImageIcon("E:\\Joseba\\Desktop\\alud\\2º\\1º CUATRI\\PROG\\ProyectoProgIII\\ProyectoProgIII\\ProyectoProgIII\\src\\img\\220px-Camiseta-negra.jpg"));
		add(JLabelImagen, BorderLayout.CENTER);
		
		JLabel JLabelImagen2 = new JLabel();
		JLabelImagen2.setIcon(new ImageIcon("E:\\Joseba\\Desktop\\alud\\2º\\1º CUATRI\\PROG\\ProyectoProgIII\\ProyectoProgIII\\ProyectoProgIII\\src\\img\\0594178b-9366-48a5-90c4-71a2283e472d._CR0,0,220,220_PT0_SX220__.jpg"));
		add(JLabelImagen2, BorderLayout.WEST);
		
		
	
		
		


	}

}
