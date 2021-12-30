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
	protected JLabel lblInsertar;
	public JTextField tfInsertarCod;
	
	protected JButton btnAceptar;
	protected JButton btnCancelar;
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
		
		lblInsertar = new JLabel("Inserte el código de la prenda que desea borrar : ");
		tfInsertarCod = new JTextField(10);
		arriba.add(lblInsertar);
		arriba.add(tfInsertarCod);
		
		btnAceptar = new JButton("Aceptar");
		btnCancelar = new JButton("Cancelar");
		
		abajo.add(btnCancelar);
		abajo.add(btnAceptar);
		
		btnAceptar.addActionListener(new ActionListener() {
			
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
							limpiar();
						}else {
							JOptionPane.showMessageDialog(null, "No existe ningun articulo con ese código", "Error", JOptionPane.ERROR_MESSAGE);
							limpiar();
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

	
		btnCancelar.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
		
			}
			});
		
	}
	public void limpiar(){
		tfInsertarCod.setText("");
    }
	
	
	public static void main(String[] args) {
		VentanaDescatalogar ventana = new VentanaDescatalogar();
		 ventana.setVisible(true);
		
	}

}
