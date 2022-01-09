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

import clss.Articulo;
import clss.BaseDeDatos;
import clss.OutFitShopException;
import clss.Pedido;
import clss.TipoArticulo;

import javax.swing.JTable;
import javax.swing.RowFilter;

import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Logger;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class VentanaAdminN extends JFrame {

	private JPanel contentPane;
	private JPanel pnlIzquierda;
	private JPanel pnlDerecha;
	private JButton btnAgregar;
	private JButton btnDescatalogar;
	private JButton btnHome;
	private static JTable tRopa;
	private JLabel lblTAlmacen;
	private static JScrollPane sRopa;
	static DefaultTableModel mRopa;
	private static Logger logger = Logger.getLogger("BaseDeDatos");
	private static JComboBox<TipoArticulo> cbTipo;
	private JButton btnFiltrar;
	private JButton btnQFiltro;
	private JLabel lblPedidos;
	private JTextArea taPedidos;
	private JButton btnExportar;
	private JButton btnBorrar;
	private JButton btnInicio;
	private Icon icono = new ImageIcon(getClass().getResource("/img/IconoAplicacion.png"));
	private static Boolean vr=true;
	public static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws OutFitShopException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
						while(vr) {
							String tx = (String) JOptionPane.showInputDialog(null, "Usuario:", "Ingrese los credenciales de admin", JOptionPane.INFORMATION_MESSAGE, null, null, null);					
							if (tx.isEmpty()) {
						        JOptionPane.showMessageDialog(null, "!! No Ha Ingresado Ningun Valor !!");
						        throw new OutFitShopException("No se ha introducido ningun texto");
						    }else if(tx.equals("admin")){
						    	vr=false;
								VentanaAdminN frame = new VentanaAdminN();
								frame.setVisible(true);
								
							}
							
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
				        throw new OutFitShopException("No se ha introducido ningun texto");

					}

					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public static void FiltrarTabla(DefaultTableModel tabla) {

		String query = cbTipo.getSelectedItem().toString();
		TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tabla);
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
		setIconImage(new ImageIcon(getClass().getResource("/img/IconoAplicacion.png")).getImage());

		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		pnlIzquierda = new JPanel();
		pnlIzquierda.setBackground(new Color(227, 48, 73));
		contentPane.add(pnlIzquierda);
		pnlIzquierda.setLayout(new MigLayout("", "[][183.00,grow][grow][][][grow][189.00][][]",
				"[36.00][grow][][][][][][][][][][][][][][][]"));

		Vector<String> cabeceras = new Vector<String>();
		cabeceras.add("Codigo");
		cabeceras.add("Tipo");
		cabeceras.add("Talla");
		cabeceras.add("Precio");
		cabeceras.add("Sexo");
		cabeceras.add("Marca");
		cabeceras.add("Color");
		cabeceras.add("Ruta");
		mRopa = new DefaultTableModel(new Vector<Vector<Object>>(), cabeceras);

		lblTAlmacen = new JLabel("Tabla de almacen");
		lblTAlmacen.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblTAlmacen.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		lblTAlmacen.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTAlmacen.setHorizontalAlignment(SwingConstants.CENTER);
		pnlIzquierda.add(lblTAlmacen, "cell 1 0 6 1,grow");
		sRopa = new JScrollPane();
		tRopa = new JTable(mRopa);
		sRopa.setViewportView(tRopa);
		pnlIzquierda.add(sRopa, "cell 1 1 6 9,grow");

		btnAgregar = new JButton("Agregar Ropa");
		pnlIzquierda.add(btnAgregar, "cell 1 16,growx,aligny center");

		cbTipo = new JComboBox();
		for (TipoArticulo ta : TipoArticulo.values()) {
			cbTipo.addItem(ta);
		}
		pnlIzquierda.add(cbTipo, "cell 2 16,grow");

		btnFiltrar = new JButton("Filtrar");
		btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FiltrarTabla(mRopa);
			}
		});
		pnlIzquierda.add(btnFiltrar, "cell 3 16,grow");

		btnQFiltro = new JButton("Quitar filtro");
		btnQFiltro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableRowSorter<DefaultTableModel> tr = null;
				tRopa.setRowSorter(tr);
			}
		});

		pnlIzquierda.add(btnQFiltro, "cell 4 16,grow");

		btnDescatalogar = new JButton("Descatalogar");
		pnlIzquierda.add(btnDescatalogar, "cell 5 16 2 1,grow");

		pnlDerecha = new JPanel();
		pnlDerecha.setBackground(new Color(249, 194, 4));
		pnlDerecha.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(0, 0, 0)));
		contentPane.add(pnlDerecha);
		pnlDerecha.setLayout(new MigLayout("", "[552.00,grow]", "[29.00][450.00,grow][]"));

		lblPedidos = new JLabel("Pedidos Realizados");
		lblPedidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedidos.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblPedidos.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		pnlDerecha.add(lblPedidos, "cell 0 0,grow");
		
		String pedidosStr = "";
		for (Pedido pedido : pedidos) {
			
				pedidosStr = pedidosStr + pedido + "\n";
		}
		
		taPedidos = new JTextArea();
		taPedidos.setText(pedidosStr);
		pnlDerecha.add(taPedidos, "cell 0 1,grow");
		taPedidos.setEditable(false);
		
		btnExportar = new JButton("Exportar Pedidos");
		pnlDerecha.add(btnExportar, "flowx,cell 0 2");
		
		btnBorrar = new JButton("Borrar Pedidos");
		pnlDerecha.add(btnBorrar, "cell 0 2");
		
		btnInicio = new JButton("HOME");
		//btnInicio.setIcon(new ImageIcon(VentanaAdminN.class.getResource("/img/Inicio.png")));
		pnlDerecha.add(btnInicio, "cell 0 2,grow");

		

		btnInicio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VentanaLoginN nueva = new VentanaLoginN();
				nueva.setVisible(true);
			}
		});
		try {
			BaseDeDatos.initBaseDatos("Clientes.db");
			BaseDeDatos.actualizaTabla(mRopa);
			BaseDeDatos.closeBD(BaseDeDatos.con);
		} catch (Exception e) {
			System.out.println("No se puede rellenar la tabla");
			e.printStackTrace();
		}

		btnAgregar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaAgregarRopaN agregar;
				try {
					agregar = new VentanaAgregarRopaN();
					agregar.setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			}
		});
		btnDescatalogar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaDescatalogar descatalogar = new VentanaDescatalogar();
				descatalogar.setVisible(true);

			}
		});
		
		
//IMAGENES
		
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/Inicio.png"));
		Image imgEscalada = imgIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnInicio.setIcon(new ImageIcon(imgEscalada));
		
		ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/img/icnExportar.png"));
		Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnExportar.setIcon(new ImageIcon(imgEscalada2));
		
		ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/img/icnBorrar.png"));
		Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnBorrar.setIcon(new ImageIcon(imgEscalada3));
		
		ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/img/icnAnyadir.png"));
		Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnAgregar.setIcon(new ImageIcon(imgEscalada4));
		
//		ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/img/icnDescatalogar.png"));
//		Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
//		btnDescatalogar.setIcon(new ImageIcon(imgEscalada5));
		

	}

}
