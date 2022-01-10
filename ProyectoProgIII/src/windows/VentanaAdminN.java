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
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
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
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
	private static JComboBox<String> cbTipo;
	private JButton btnFiltrar;
	private JLabel lblPedidos;
	private JTextArea taPedidos;
	private JButton btnExportar;
	private JButton btnBorrar;
	private JButton btnInicio;
	private Icon icono = new ImageIcon(getClass().getResource("/img/IconoAplicacion.png"));
	private static Boolean vr = true;
	public static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws OutFitShopException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
						while (vr) {
							String tx = (String) JOptionPane.showInputDialog(null, "Usuario:",
									"Ingrese los credenciales de admin", JOptionPane.INFORMATION_MESSAGE, null, null,
									null);
							if (tx.isEmpty()) {
								JOptionPane.showMessageDialog(null, "!! No Ha Ingresado Ningun Valor !!");
								throw new OutFitShopException("No se ha introducido ningun texto");
							} else if (tx.equals("admin")) {
								vr = false;
								VentanaAdminN frame = new VentanaAdminN();
								frame.setVisible(true);

							}

						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						// e.printStackTrace();
						throw new OutFitShopException("No se ha introducido ningun texto");

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		pnlIzquierda.setLayout(new MigLayout("", "[][183.00,grow][grow][grow][][grow][189.00][][]", "[36.00][grow][][][][][][][][][][][][][][][]"));

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
		cbTipo.addItem("Sin Filtro");
		cbTipo.addItem("Camiseta");
		cbTipo.addItem("Sudadera");
		cbTipo.addItem("Pantalon");
		cbTipo.addItem("Zapatos");
		
		
		cbTipo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					BaseDeDatos.initBaseDatos("Clientes.db");
					if (cbTipo.getSelectedItem() == "Camiseta") {
						ArrayList<Articulo> camisetas = (ArrayList<Articulo>) BaseDeDatos.getCamiseta();
						tRopa.removeAll();
						updateUI(camisetas);
					}
					else if (cbTipo.getSelectedItem() == "Sudadera") {
						ArrayList<Articulo> sudaderas = (ArrayList<Articulo>) BaseDeDatos.getSudadera();
						tRopa.removeAll();
						updateUI(sudaderas);
					}
					else if (cbTipo.getSelectedItem() == "Pantalon") {
						ArrayList<Articulo> pantalones = (ArrayList<Articulo>) BaseDeDatos.getPantalon();
						tRopa.removeAll();
						updateUI(pantalones);
					}
					else if (cbTipo.getSelectedItem() == "Zapatos") {
						ArrayList<Articulo> zapatos = (ArrayList<Articulo>) BaseDeDatos.getZapatos();
						tRopa.removeAll();
						updateUI(zapatos);
					}
					else {
						ArrayList<Articulo> articulos = BaseDeDatos.getArticulos();
						tRopa.removeAll();
						updateUI(articulos);
					}
					BaseDeDatos.closeBD(BaseDeDatos.con);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		pnlIzquierda.add(cbTipo, "cell 2 16,grow");
		btnFiltrar = new JButton("Filtrar por Marca");
		btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().isEmpty()){
					JOptionPane.showMessageDialog(contentPane, "Introduce la el nombre de la marca que deseas filtrar");
				}else {
					FiltrarTabla(mRopa);
					textField.setText("");
				}
			}
		});
		
		textField = new JTextField();
		pnlIzquierda.add(textField, "cell 3 16,growx");
		textField.setColumns(10);

		pnlIzquierda.add(btnFiltrar, "cell 4 16,grow");

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
		JScrollPane scrollTAPedidos = new JScrollPane(taPedidos);
		scrollTAPedidos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		pnlDerecha.add(scrollTAPedidos, "cell 0 1,grow");
		taPedidos.setEditable(false);

		btnExportar = new JButton("Exportar Pedidos");
		

		pnlDerecha.add(btnExportar, "flowx,cell 0 2");

		btnBorrar = new JButton("Borrar Pedidos");
		pnlDerecha.add(btnBorrar, "cell 0 2");

		btnInicio = new JButton("HOME");
		// btnInicio.setIcon(new
		// ImageIcon(VentanaAdminN.class.getResource("/img/Inicio.png")));
		pnlDerecha.add(btnInicio, "cell 0 2,grow");

		
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
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		
		btnInicio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VentanaLoginN nueva = new VentanaLoginN();
				nueva.setVisible(true);
			}
		});
		
		btnExportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExportarPedidos();
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

		ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/img/icnDescatalogar.png"));
		Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnDescatalogar.setIcon(new ImageIcon(imgEscalada5));

	}

	private void ExportarPedidos() {
		try {
			JFileChooser arch = new JFileChooser(System.getProperty("user.dir"));
			arch.showSaveDialog(this);
			if (arch.getSelectedFile() != null) {
				try (FileWriter guardado = new FileWriter(arch.getSelectedFile())) {
					guardado.write(taPedidos.getText());
					JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito en la ruta seleccionada");
				}
			}
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}
	private void borrar() {
		int input1 = JOptionPane.showConfirmDialog(null, "Estas seguro que desea borrar todos los pedidos?", "Borrar",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		if (input1==0) {
			taPedidos.setText("");
			pedidos.clear();
			JOptionPane.showMessageDialog(rootPane, "Se ha borrado");
		}else if (input1==1) {
			assert true;
		}

	}
	public static void FiltrarTabla(DefaultTableModel tabla) {
		try {
			BaseDeDatos.initBaseDatos("Clientes.db");
			List<Articulo> lista = BaseDeDatos.getMarca(textField.getText());
			tRopa.removeAll();
			updateUI(lista);
			BaseDeDatos.closeBD(BaseDeDatos.con);
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		
	}
	private static void updateUI(List<Articulo> articulos) {
		tRopa.setModel(new ArticulosTableModel(articulos));
	}
}
