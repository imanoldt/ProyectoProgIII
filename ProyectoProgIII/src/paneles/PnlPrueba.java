package paneles;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import windows.VentanaLoginN;

import javax.swing.JLabel;
import javax.swing.JSpinner;

import clss.Articulo;
import clss.Talla;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.Image;

public class PnlPrueba extends JPanel {
	private static JLabel lblImagen;
	private JSpinner spnCantidad;
	private JButton btnComprar;
	private JLabel lblNombre;
	private JComboBox<Talla> cbTallas;
	static JLabel lblPrecio;

	
	
//	private JComboBox<Talla> comboTalla;

	/**
	 * Create the panel.
	 */
	public PnlPrueba() {
		setLayout(new MigLayout("", "[][][145.00,grow]", "[136.00][][][][][]"));

		lblImagen = new JLabel("");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblImagen, "cell 1 0 2 1,alignx center,aligny center");

		lblNombre = new JLabel("__________________________");
		add(lblNombre, "cell 1 3 2 1,alignx left,aligny center");

		spnCantidad = new JSpinner();
		add(spnCantidad, "cell 1 4,growx");

		cbTallas = new JComboBox<Talla>();
		add(cbTallas, "cell 2 4,growx");

		for (Talla t : Talla.values()) {
			cbTallas.addItem(t);

		}
		lblPrecio = new JLabel("Precio");
		add(lblPrecio, "cell 1 5 2 2,grow");
		
		
		
		btnComprar = new JButton("Comprar");
		btnComprar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnComprar.setBackground(Color.PINK);
		add(btnComprar, "cell 1 5 2 1,grow");

	}
	public static void rellenarPaneles(int precio, String imagen) {
		lblPrecio.setText("Precio: "+precio+"€");
	
		try {
			ImageIcon imgIcon = new ImageIcon(imagen);
			Image imgEscalada = imgIcon.getImage().getScaledInstance(199, 199, Image.SCALE_SMOOTH);
			ImageIcon im = new ImageIcon(imgEscalada);
			im.setDescription(imagen);
			lblImagen.setIcon(im);		

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
