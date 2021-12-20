package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AttributeSet.ColorAttribute;

import clss.BaseDeDatos;
import clss.TipoArticulo;

import javax.swing.JTable;
import javax.swing.RowFilter;

import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JComboBox;

public class VentanaAdminN extends JFrame {

	private JPanel contentPane;
	private JPanel pnlIzquierda;
	private JPanel pnlDerecha;
	private JButton btnAgregar;
	private JButton btnDescatalogar;
	private static JTable tRopa;
	private JLabel lblTAlmacen;
	private static JScrollPane sRopa;
	static DefaultTableModel mRopa;
	private static Logger logger = Logger.getLogger("BaseDeDatos");
	private static JComboBox cbtipo;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAdminN frame = new VentanaAdminN();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
	/**
	 * Create the frame.
	 */
	public VentanaAdminN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1226, 626);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Admin");
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		pnlIzquierda = new JPanel();
		pnlIzquierda.setBackground(new Color(227, 48, 73));
		contentPane.add(pnlIzquierda);
		pnlIzquierda.setLayout(new MigLayout("", "[][183.00,grow][grow][][][grow][189.00][][]", "[36.00][grow][][][][][][][][][][][][][][][]"));
		
		
		Vector<String> cabeceras = new Vector<String>();
		cabeceras.add( "Codigo" ); cabeceras.add( "Tipo" ); cabeceras.add( "Talla" ); cabeceras.add( "Precio" ); cabeceras.add( "Sexo" ); cabeceras.add( "Marca" ); cabeceras.add( "Color" );
		mRopa = new DefaultTableModel(new Vector<Vector<Object>>(), cabeceras);
		
		lblTAlmacen = new JLabel("Tabla de almacen");
		lblTAlmacen.setFont(new Font("Monaco", Font.PLAIN, 16));
		lblTAlmacen.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		lblTAlmacen.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTAlmacen.setHorizontalAlignment(SwingConstants.CENTER);
		pnlIzquierda.add(lblTAlmacen, "cell 1 0 6 1,grow");
		tRopa = new JTable(mRopa);
		//sRopa.setViewportView(tRopa);
		pnlIzquierda.add(tRopa, "cell 1 1 6 9,grow");
		
		btnAgregar = new JButton("Agregar Ropa");
		pnlIzquierda.add(btnAgregar, "cell 1 16,growx,aligny center");
		
		cbtipo = new JComboBox();
		for (TipoArticulo ta : TipoArticulo.values()) {
			cbtipo.addItem(ta);
		}
		pnlIzquierda.add(cbtipo, "cell 2 16,growx");
		
		btnNewButton = new JButton("Filtrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FiltrarTabla(mRopa);
			}
		});
		pnlIzquierda.add(btnNewButton, "cell 3 16");
		
		btnNewButton_1 = new JButton("Quitar filtro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableRowSorter<DefaultTableModel>tr = null;
				tRopa.setRowSorter(tr);
			}
		});
		pnlIzquierda.add(btnNewButton_1, "cell 4 16");
		
		btnDescatalogar = new JButton("Descatalogar");
		pnlIzquierda.add(btnDescatalogar, "cell 5 16 2 1,grow");
		
		pnlDerecha = new JPanel();
		pnlDerecha.setBackground(new Color(249, 194, 4));
		pnlDerecha.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(0, 0, 0)));
		contentPane.add(pnlDerecha);
		
		try {
			BaseDeDatos.actualizaTabla(mRopa);
		} catch (Exception e) {
			System.out.println("No se puede rellenar la tabla");
			e.printStackTrace();
		}
		
//volver.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				VentanaLoginN login = new VentanaLoginN();
//				login.setVisible(true);
//				setVisible(false);
//			}
//			});
		
		btnAgregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaAgregarRopa agregar = new VentanaAgregarRopa();
				agregar.setVisible(true);
					
			}
			});
		btnDescatalogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaDescatalogar descatalogar = new VentanaDescatalogar();
				descatalogar.setVisible(true);
			
			}
			});

		
	}

}
