package clss;

public class Cliente {
	
	private String nombre;
	private String email;
	private String DNI;
	private TipoSexo sexo;
	private String direccion;
	private String codigoPostal;
	
	public Cliente(String nombre, String email, String dNI, TipoSexo sexo, String direccion, String codigoPostal) {
		super();
		this.nombre = nombre;
		this.email = email;
		DNI = dNI;
		this.sexo = sexo;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
	}
	
	public Cliente() {
		super();
		this.nombre = null;
		this.email = null;
		DNI = null;
		this.sexo = null;
		this.direccion = null;
		this.codigoPostal = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", email=" + email + ", DNI=" + DNI + ", sexo=" + sexo + ", direccion="
				+ direccion + ", codigoPostal=" + codigoPostal + "]";
	}
	
	

}
