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
					String com = "";
					try {				
						com = "delete from ropa where codigo = '"+ (tfInsertarCod.getText()) +"'";
						BaseDeDatos.stmt.executeUpdate( com );
					} catch (SQLException e2) {
						
					}
				} else {
					JOptionPane.showMessageDialog( mensaje, "No hay ningun producto en la base de datos" );
				}
				BaseDeDatos.actualizaTabla(VentanaAdmin.mRopa);
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
