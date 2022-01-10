package windows;


import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import clss.Articulo;

public class ArticulosTableModel extends AbstractTableModel {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	private final List<String> headers = Arrays.asList( "Codigo", "Tipo", "Talla", "Precio", "Sexo", "Marca", "Color", "Ruta");
	private List<Articulo> articulos;

	public ArticulosTableModel(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	@Override
	public String getColumnName(int column) {
		return headers.get(column);
	}

	@Override
	public int getRowCount() {
		return articulos.size();
	}

	@Override
	public int getColumnCount() {
		return headers.size(); 
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Articulo articulo = articulos.get(rowIndex);
		switch (columnIndex) {
			case 0: return articulo.getCodigo();
			case 1: return articulo.getTipo();
			case 2: return articulo.getTalla();
			case 3: return articulo.getPrecio();
			case 4: return articulo.getSexo();
			case 5: return articulo.getMarca();
			case 6: return articulo.getColor();
			case 7: return articulo.getImagen();
			default: return null;
		}
	}


}
