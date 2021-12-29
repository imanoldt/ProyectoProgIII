package windows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import clss.BaseDeDatos;

public class VentanaDescatalogar extends JFrame{
	
	protected JPanel arriba;
	protected JPanel abajo;
	protected JLabel insertar;
	public JTextField tfInsertarCod;
	
	protected JButton aceptar;
	protected JButton cancelar;
	private static JFrame mensaje;
	
	static DefaultTableModel mRopa;	
	
	public VentanaDescatalogar() {
		this.setSize(450, 100);
		this.setUndecorated (false);
		setLocationRelativeTo(null);
		Container cp = this.getContentPane();
		cp.setLayout(new GridLayout(2, 1));
		
		arriba = new JPanel();
		abajo = new JPanel();
		cp.add(arriba);
		cp.add(abajo);
		
		arriba.setBackground(new Color(249, 194, 4));
		abajo.setBackground(new Color(249, 194, 4));
		
		insertar = new JLabel("Inserte el código de la prenda que desea borrar : ");
		tfInsertarCod = new JTextField(10);
		arriba.add(insertar);
		arriba.add(tfInsertarCod);
		
		aceptar = new JButton("aceptar");
		cancelar = new JButton("cancelar");
		
		abajo.add(cancelar);
		abajo.add(aceptar);
		
		aceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!tfInsertarCod.getText().isEmpty()) {
					int codigo = Integer.parseInt((tfInsertarCod.getText()));
					BaseDeDatos.comprobarCodigo(codigo);
					try {
						if (BaseDeDatos.rs.next()) {
							BaseDeDatos.borrarRopa(codigo);
							BaseDeDatos.actualizaTabla(VentanaAdminN.mRopa);
							JOptionPane.showMessageDialog( mensaje, "Se ha borrado el articulo correctamente" );
						}else {
							JOptionPane.showMessageDialog(null, "No existe ningun articulo con ese código", "Error", JOptionPane.ERROR_MESSAGE);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} else {
					JOptionPane.showMessageDialog(null, "No se ha intoducido ningun código", "Error", JOptionPane.ERROR_MESSAGE);
					
				}
				
			}
		});

	
		cancelar.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
		
			}
			});
		
	}
	public static void main(String[] args) {
		VentanaDescatalogar ventana = new VentanaDescatalogar();
		 ventana.setVisible(true);
		
	}

}
