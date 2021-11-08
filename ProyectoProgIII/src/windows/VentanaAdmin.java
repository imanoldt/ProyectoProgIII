package windows;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import clss.Ropa;

public class VentanaAdmin extends JFrame{
	
	protected JButton anyadirRopa;
	protected JButton descatalogaRopa;
	protected JButton guardar;
	protected JPanel pnlCentral;
	protected JPanel pnlIzquierda;
	protected JPanel pnlDerecha;
	private static JTable tRopa;
	private static JScrollPane sRopa;
	

	
	public VentanaAdmin(){
		construirTabla();
		
		Container cp = this.getContentPane();
		
		setLocationRelativeTo(null);
//		setUndecorated(true);
		setBounds(100, 100, 1039, 549);
		this.setTitle("Administrador");
//		this.setResizable(false);
		this.setVisible(true);
		this.setSize(600, 500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		sRopa = new JScrollPane();
//		sRopa.setBounds(27, 72, 379, 130);
		
		
		
//		private void EditarRopa() {
//			Vector<String> cabeceras = new Vector<String>();
//			cabeceras.add( "Nombre" ); cabeceras.add( "Talla" ); cabeceras.add( "Precio" ); cabeceras.add( "Sexo" ); cabeceras.add( "Marca" ); cabeceras.add( "Color" );
//			mRopa = new DefaultTableModel(new Vector<Vector<Object>>(), cabeceras);
//			tRopa= new JTable( mRopa);
			
			
//		}
		
		
		
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
		pnlIzquierda.add(sRopa);
		
//		pnlIzquierda.add(tRopa);
	
		
		
		
		
		
		
		
		
		
		
	}
	
	private void construirTabla() {
		String titulos[] = {"Nombre", "Talla", "Precio", "Sexo", "Marca", "Color" };
		String informacion [][]= obtenerMatriz();
		tRopa = new JTable(informacion, titulos);
		sRopa.setViewportView(tRopa);
	}

	private String[][] obtenerMatriz() {
//		Ropa miropa = new Ropa();
		return null;
	}

	public static void main(String[] args) {
			
		new VentanaAdmin();
	}

}
