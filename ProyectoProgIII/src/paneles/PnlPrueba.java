package paneles;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;

import clss.Talla;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class PnlPrueba extends JPanel {
	private JLabel lblImagen;
	private JSpinner spnCantidad;
	private JButton btnComprar;
	private JLabel lblNombre;
	private JComboBox<Talla> comboTalla;

	/**
	 * Create the panel.
	 */
	public PnlPrueba() {
		setLayout(new MigLayout("", "[][][145.00]", "[136.00][][][][]"));
		
		lblImagen = new JLabel("*Imagen*");
		add(lblImagen, "cell 1 0 2 1,alignx center,aligny center");
		
		lblNombre = new JLabel("______");
		add(lblNombre, "cell 1 2 2 1,alignx left,aligny center");
		
		spnCantidad = new JSpinner();
		add(spnCantidad, "cell 1 4,growx");
		
		btnComprar = new JButton("Comprar");
		add(btnComprar, "cell 2 4,growx,aligny center");
		
		comboTalla = new JComboBox<Talla>();

		for (Talla t : Talla.values()) {
			comboTalla.addItem(t);
		add(comboTalla, "cell 3 4,growx,aligny center");
		}

	}

}
