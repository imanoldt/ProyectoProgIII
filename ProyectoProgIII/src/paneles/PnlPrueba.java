package paneles;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;

import clss.Talla;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.MouseMotionAdapter;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class PnlPrueba extends JPanel {
	private JLabel lblImagen;
	private JSpinner spnCantidad;
	private JButton btnComprar;
	private JLabel lblNombre;
	private JComboBox<Talla> cbTallas;
//	private JComboBox<Talla> comboTalla;

	/**
	 * Create the panel.
	 */
	public PnlPrueba() {
		setLayout(new MigLayout("", "[][][145.00,grow]", "[136.00][][][][][]"));

		lblImagen = new JLabel("*Imagen*");
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
		
		btnComprar = new JButton("Comprar");
		btnComprar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnComprar.setBackground(Color.PINK);
		add(btnComprar, "cell 1 5 2 1,grow");

	}

}
