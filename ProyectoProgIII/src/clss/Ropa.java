package clss;

public abstract class Ropa {
	
	private String nombre;
	private int talla;
	private int precio;
	private TipoSexo sexo;
	private String marca;
	private String color;

	public Ropa(String nombre, int talla, int precio, TipoSexo sexo, String marca, String color) {
		super();
		this.nombre = nombre;
		this.talla = talla;
		this.precio = precio;
		this.sexo = sexo;
		this.marca = marca;
		this.color = color;
	}
	public Ropa() {
		super();
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
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
	
	
	
	
	
	
	

}
