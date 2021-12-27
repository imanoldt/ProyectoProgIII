package paneles;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class PnlPrueba extends JPanel {
	private JLabel lblImagen;
	private JSpinner spnCantidad;
	private JButton btnComprar;
	private JLabel lblNombre;

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

	}

}
