package windows;

import java.awt.*;

import javax.swing.*;

public class VentanaAdmin extends JFrame{
	
	protected JButton anyadirRopa;
	protected JButton descatalogaRopa;
	protected JButton guardar;
	protected JPanel pnlCentral;
	protected JPanel pnlIzquierda;
	protected JPanel pnlDerecha;
	
	public VentanaAdmin(){
		Container cp = this.getContentPane();
		
		setLocationRelativeTo(null);
//		setUndecorated(true);
		setBounds(100, 100, 1039, 549);
		this.setTitle("Administrador");
//		this.setResizable(false);
		this.setVisible(true);
		this.setSize(600, 500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
		
		
		
		pnlCentral = new JPanel();
		pnlCentral.setLayout(new GridLayout(0, 2, 0, 0));
		cp.add(pnlCentral, BorderLayout.CENTER);
		
		pnlDerecha = new JPanel();
//		pnlDerecha.setBackground(new Color(183, 29, 57)); 
		
		pnlIzquierda = new JPanel();
//		pnlIzquierda.setBackground(new Color(110, 89, 70)); pongo el fondo de colores diferentes para ver si se habían añadido bien los panales
		
		pnlCentral.add(pnlIzquierda);
		pnlCentral.add(pnlDerecha);
		
		anyadirRopa = new JButton("Añadir Ropa");
		descatalogaRopa = new JButton("Descatalogar");
		guardar = new JButton("Guardar");
		
		pnlIzquierda.add(anyadirRopa);
		pnlIzquierda.add(descatalogaRopa);
		pnlDerecha.add(guardar);
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new VentanaAdmin();
	}

}
