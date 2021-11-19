package paneles;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import windows.VentanaAdmin;



public class PanelCamisetas extends JPanel {
	
	private JLabel lblNewLabel;
	private JPanel pnlNorte;
	private JPanel pnlDerecha;
	private JPanel pnlIzquierda;

	public PanelCamisetas() {
		
		
		setLayout(new BorderLayout());
		pnlNorte = new JPanel();
		pnlNorte.setPreferredSize(new Dimension(10, 40));
		pnlNorte.setBackground(new Color(227, 48, 73));
		add(pnlNorte, BorderLayout.NORTH);
		pnlNorte.setLayout(new BorderLayout(0, 0));
		
		pnlDerecha = new JPanel();
		pnlDerecha.setLayout(new GridLayout(3, 3, 0, 0));
		add(pnlDerecha, BorderLayout.EAST);
		
		pnlIzquierda = new JPanel();
		pnlIzquierda.setLayout(new GridLayout(3, 3, 0, 0));
		add(pnlIzquierda, BorderLayout.WEST);
		

		JLabel lblTitulo=new JLabel("Camisetas", SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Monaco", Font.PLAIN, 16));
		pnlNorte.add(lblTitulo,BorderLayout.CENTER);
		
		JButton btnImagenCamisetaNegra = new JButton(new ImageIcon(PanelCamisetas.class.getResource("/img/camisetaNegra.jpg")));
//		JLabelImagen.setIcon(new ImageIcon("/img/camisetaNegra.png")); 
		pnlDerecha.add(btnImagenCamisetaNegra, BorderLayout.WEST);
		
		JLabel lblprecio=new JLabel("Precio", SwingConstants.CENTER);
		lblprecio.setFont(new Font("Monaco", Font.PLAIN, 14));
		pnlDerecha.add(lblprecio,BorderLayout.CENTER);
		
		JLabel JLabelImagen2 = new JLabel();
		JLabelImagen2.setIcon(new ImageIcon("E:\\Joseba\\Desktop\\alud\\2º\\1º CUATRI\\PROG\\ProyectoProgIII\\ProyectoProgIII\\ProyectoProgIII\\src\\img\\0594178b-9366-48a5-90c4-71a2283e472d._CR0,0,220,220_PT0_SX220__.jpg"));
		pnlDerecha.add(JLabelImagen2, BorderLayout.SOUTH);
		
		
	
		
		


	}

}
