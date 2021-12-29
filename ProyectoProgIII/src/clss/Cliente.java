package clss;

import java.util.Date;

public class Cliente {
	
	private String nombre;
	private String email;
	private String dni;
	private TipoSexo sexo;
	private String direccion;
	private int codigoPostal;
	private String usuario;
	private String contrsenya;
	private Date fechanac;
	
	public Cliente(String nombre, String email,String dni, String direccion,int codigoPostal, Date fechanac, TipoSexo sexo, String usuario, String contrsenya) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.dni = dni;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.fechanac = fechanac;
		this.sexo = sexo;
		this.usuario = usuario;
		this.contrsenya = contrsenya;
	}
	
	public Cliente() {
		super();
		this.nombre = null;
		this.email = null;
		this.dni = null;
		this.direccion = null;
		this.codigoPostal = 0;
		this.fechanac = null;
		this.sexo = null;
		this.usuario = null;
		this.contrsenya = null;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrsenya() {
		return contrsenya;
	}

	public void setContrsenya(String contrsenya) {
		this.contrsenya = contrsenya;
	}

	public Date getFechanac() {
		return fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", email=" + email + ", dni=" + dni + ", sexo=" + sexo + ", direccion="
				+ direccion + ", codigoPostal=" + codigoPostal + ", usuario=" + usuario + ", contrsenya=" + contrsenya
				+ ", fechanac=" + fechanac + "]";
	}



}
