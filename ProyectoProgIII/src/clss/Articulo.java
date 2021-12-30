package clss;

import java.io.File;

public abstract class Articulo {
	
	private int codigo;
	private int precio;
	private TipoSexo sexo;
	private String marca;
	private String color;
	private TipoArticulo tipo;
	protected String imagen;
	protected Talla talla;


	public Articulo(int codigo,TipoArticulo tipo,Talla talla, int precio, TipoSexo sexo, String marca, String color, String imagen) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.talla = talla;
		this.precio = precio;
		this.sexo = sexo;
		this.marca = marca;
		this.color = color;
		this.imagen = imagen;
	}
	
	public Articulo() {
		super();
		this.codigo = 0;
		this.tipo = TipoArticulo.Camiseta;
		this.precio = 0;
		this.talla = Talla.XS;
		this.sexo = TipoSexo.HOMBRE;
		this.marca = null;
		this.color = null;
		this.imagen = null;
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

	public String getImagen() {
		return imagen;
	}

	public  void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", precio=" + precio + ", sexo=" + sexo + ", marca=" + marca + ", color="
				+ color + ", tipo=" + tipo + "]";
	}




}
