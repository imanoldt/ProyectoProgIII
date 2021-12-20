package windows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import clss.BaseDeDatos;
import clss.TipoArticulo;

public class VentanaAdmin extends JFrame{
	
	protected JButton anyadirRopa;
	protected JButton descatalogaRopa;
	protected JButton guardar;
	protected JButton volver;
	protected JPanel pnlCentral;
	protected JPanel pnlIzquierda;
	protected JPanel pnlDerecha;
	private static JTable tRopa;
	private JTextArea txtArea;
	private static JScrollPane sRopa;
	static DefaultTableModel mRopa;
	private static Logger logger = Logger.getLogger("BaseDeDatos");
	private static JComboBox cbtipo;
	private JButton btnNewButton;
	

	
	public VentanaAdmin(){

		
		Container cp = this.getContentPane();

		
//		setLocationRelativeTo(null);

		setBounds(100, 100, 1039, 549);
		this.setTitle("Administrador");
//		this.setResizable(false);
		
		this.setSize(1240, 625);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		sRopa = new JScrollPane();
//		sRopa.setBounds(27, 72, 379, 130);
		
		
		

		Vector<String> cabeceras = new Vector<String>();
		cabeceras.add( "Codigo" ); cabeceras.add( "Tipo" ); cabeceras.add( "Talla" ); cabeceras.add( "Precio" ); cabeceras.add( "Sexo" ); cabeceras.add( "Marca" ); cabeceras.add( "Color" );
		mRopa = new DefaultTableModel(new Vector<Vector<Object>>(), cabeceras);
		tRopa= new JTable( mRopa);
		sRopa.setViewportView(tRopa);	
			
		
		
		txtArea = new JTextArea(20,45);
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
		
		anyadirRopa = new JButton("Agregar Ropa");
		descatalogaRopa = new JButton("Descatalogar");
		guardar = new JButton("Guardar");
		
		volver = new JButton(new ImageIcon(VentanaAdmin.class.getResource("/img/Inicio.png")));
		volver.setOpaque(false);
		volver.setBorderPainted(false);
		volver.setBackground(new Color(0, 0, 0));
		
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaLoginN login = new VentanaLoginN();
				login.setVisible(true);
				setVisible(false);
			}
			});
		
		anyadirRopa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaAgregarRopa agregar = new VentanaAgregarRopa();
				agregar.setVisible(true);
					
			}
			});
		descatalogaRopa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaDescatalogar descatalogar = new VentanaDescatalogar();
				descatalogar.setVisible(true);
			
			}
			});
		cbtipo = new JComboBox();
		for (TipoArticulo ta : TipoArticulo.values()) {
			cbtipo.addItem(ta);
		}
		pnlIzquierda.add(cbtipo);
		
		btnNewButton = new JButton("Filtrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FiltrarTabla(mRopa);
			}
		});
		pnlIzquierda.add(btnNewButton);
		
		
		
		
		pnlIzquierda.add(anyadirRopa);
		pnlIzquierda.add(descatalogaRopa);
		pnlDerecha.add(guardar);
		pnlIzquierda.add(sRopa);
		pnlDerecha.add(txtArea);
		pnlDerecha.add(volver);
		
		
		try {
			BaseDeDatos.actualizaTabla(mRopa);
		} catch (Exception e) {
			System.out.println("No se puede rellenar la tabla");
			e.printStackTrace();
		}
	
		
	}
	
	public static void FiltrarTabla(DefaultTableModel tabla) {	
		
		String query = cbtipo.getSelectedItem().toString();
		TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (tabla);
		tRopa.setRowSorter(tr);
		
		if (query != " ") {
			tr.setRowFilter(RowFilter.regexFilter(query));
			
		} else {
			tRopa.setRowSorter(tr);
		}
	}

	public static void main(String[] args) {
			
		VentanaAdmin ventana = new VentanaAdmin();
		ventana.setVisible(true);
	}

}
