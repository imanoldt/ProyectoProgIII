package paneles;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import clss.Articulo;
import clss.Talla;
import net.miginfocom.swing.MigLayout;
import windows.VentanaCarrito;

public class PnlCarrito extends JPanel{
	private static JLabel lblImagen;
	private JButton btnEliminar;
	private JLabel lblNombre;
	static JLabel lblPrecio;
	private Articulo articulo_asignado;
//	static ArrayList<Articulo> articulos_carrito = VentanaCarrito.getArticulos_carrito();

	
	
//	private JComboBox<Talla> comboTalla;

	/**
	 * Create the panel.
	 */
	public PnlCarrito() {
		setLayout(new MigLayout("", "[][][145.00,grow]", "[136.00][][][][][]"));

		lblImagen = new JLabel("");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblImagen, "cell 1 0 2 1,alignx center,aligny center");

		lblNombre = new JLabel("__________________________");
		add(lblNombre, "cell 1 3 2 1,alignx left,aligny center");


		lblPrecio = new JLabel("Precio");
		add(lblPrecio, "cell 1 5 2 2,grow");
		
		
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setBackground(Color.PINK);
		add(btnEliminar, "cell 1 5 2 1,grow");
		
		btnEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Articulo compra = getArticulo_asignado();
				VentanaCarrito.articulos_carrito.remove(compra);
				VentanaCarrito.cargarPaneles();
				VentanaCarrito.panelarriba.updateUI();
				
				
			}
		});

	}
	
	public  Articulo getArticulo_asignado() {
		return articulo_asignado;
	}


	public void setArticulo_asignado(Articulo articulo_asignado) {
		this.articulo_asignado = articulo_asignado;
	}
	/**
	 * Rellena el panel
	 */


	public  void rellenarPanelesCarrito(int precio, String imagen, Articulo articulo) {
		lblPrecio.setText("Precio: "+precio+"€");
	
		try {
			ImageIcon imgIcon = new ImageIcon(imagen);
			Image imgEscalada = imgIcon.getImage().getScaledInstance(199, 199, Image.SCALE_SMOOTH);
			ImageIcon im = new ImageIcon(imgEscalada);
			im.setDescription(imagen);
			lblImagen.setIcon(im);
			setArticulo_asignado(articulo);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
