package clss;

public abstract class Articulo {
	
	private int codigo;
	private int precio;
	private TipoSexo sexo;
	private String marca;
	private String color;
	private TipoArticulo tipo;


	public Articulo(int codigo,TipoArticulo tipo, int precio, TipoSexo sexo, String marca, String color) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.precio = precio;
		this.sexo = sexo;
		this.marca = marca;
		this.color = color;
	}
	
	public Articulo() {
		super();
		this.codigo = 0;
		this.tipo = TipoArticulo.Camiseta;
		this.precio = 0;
		this.sexo = TipoSexo.HOMBRE;
		this.marca = null;
		this.color = null;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public TipoArticulo getTipo() {
		return tipo;
	}

	public void setTipo(TipoArticulo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", precio=" + precio + ", sexo=" + sexo + ", marca=" + marca + ", color="
				+ color + ", tipo=" + tipo + "]";
	}
	
	

	

}
