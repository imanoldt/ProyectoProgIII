package windows;

import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import clss.BaseDeDatos;

public class VentanaAdmin extends JFrame{
	
	protected JButton anyadirRopa;
	protected JButton descatalogaRopa;
	protected JButton guardar;
	protected JPanel pnlCentral;
	protected JPanel pnlIzquierda;
	protected JPanel pnlDerecha;
	private static JTable tRopa;
	private JTextArea txtArea;
	private static JScrollPane sRopa;
	private static DefaultTableModel mRopa;
	private static Logger logger = Logger.getLogger("BaseDeDatos");
	

	
	public VentanaAdmin(){

		
		Container cp = this.getContentPane();
		
//		setLocationRelativeTo(null);

		setBounds(100, 100, 1039, 549);
		this.setTitle("Administrador");
//		this.setResizable(false);
		
		this.setSize(1000, 500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		sRopa = new JScrollPane();
//		sRopa.setBounds(27, 72, 379, 130);
		
		
		

		Vector<String> cabeceras = new Vector<String>();
		cabeceras.add( "Nombre" ); cabeceras.add( "Talla" ); cabeceras.add( "Precio" ); cabeceras.add( "Sexo" ); cabeceras.add( "Marca" ); cabeceras.add( "Color" );
		mRopa = new DefaultTableModel(new Vector<Vector<Object>>(), cabeceras);
		tRopa= new JTable( mRopa);
		sRopa.setViewportView(tRopa);	
			
		try {
			this.actualizaTabla();
		} catch (Exception e) {
			System.out.println("No se puede rellenar la tabla");
		}
		
		txtArea = new JTextArea(20,50);
		txtArea.setEditable(false);
		txtArea.setText("RESUMEN PEDIDOS");
		
		pnlCentral = new JPanel();
		pnlCentral.setLayout(new GridLayout(0, 2, 0, 0));
		cp.add(pnlCentral, BorderLayout.CENTER);
		
		pnlDerecha = new JPanel();
		pnlDerecha.setBackground(new Color(183, 29, 57)); 
		
		pnlIzquierda = new JPanel();
		pnlIzquierda.setBackground(new Color(183, 29, 57));
		
		pnlCentral.add(pnlIzquierda);
		pnlCentral.add(pnlDerecha);
		
		anyadirRopa = new JButton("Añadir Ropa");
		descatalogaRopa = new JButton("Descatalogar");
		guardar = new JButton("Guardar");
		
		pnlIzquierda.add(anyadirRopa);
		pnlIzquierda.add(descatalogaRopa);
		pnlDerecha.add(guardar);
		pnlIzquierda.add(sRopa);
		pnlDerecha.add(txtArea);
		

		
			
		
	}
	
private void actualizaTabla() {
		String com ="";
		try {
			while (mRopa.getRowCount()>0) {
				mRopa.removeRow(0);
				com = "select * from ropa";
				logger.log( Level.INFO, "BD: " + com );
				BaseDeDatos.rs = BaseDeDatos.stmt.executeQuery( com );
				System.out.println("rs: " + BaseDeDatos.rs);
				while (BaseDeDatos.rs.next()) {
					String nombre = BaseDeDatos.rs.getString( "nombre" );
					String talla = BaseDeDatos.rs.getString( "talla" );
					String precio = BaseDeDatos.rs.getString( "precio" );
					String sexo = BaseDeDatos.rs.getString("sexo");
					String marca = BaseDeDatos.rs.getString("marca");
					String color = BaseDeDatos.rs.getString("color");
					
					Vector<String> fila = new Vector<>();
					fila.add(nombre); fila.add(talla);fila.add(precio); fila.add(sexo);fila.add(marca); fila.add(color);
					mRopa.addRow(fila);
					
				
				}
				tRopa.repaint();
			}
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
	}



	public static void main(String[] args) {
			
		new VentanaAdmin();
	}

}
