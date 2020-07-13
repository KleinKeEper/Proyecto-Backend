package pe.edu.upeu.movilidad.entity;

public class UniversidadConvenio {
	private int id_universidad_convenio;
	private String nombre_universidad_convenio;
	private String telefono;
	private String contacto;
	private String email;
	private String pais;
	public UniversidadConvenio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UniversidadConvenio(int id_universidad_convenio, String nombre_universidad_convenio, String telefono,
			String contacto, String email, String pais) {
		super();
		this.id_universidad_convenio = id_universidad_convenio;
		this.nombre_universidad_convenio = nombre_universidad_convenio;
		this.telefono = telefono;
		this.contacto = contacto;
		this.email = email;
		this.pais = pais;
	}

	public int getId_universidad_convenio() {
		return id_universidad_convenio;
	}

	public void setId_universidad_convenio(int d_universidad_convenio) {
		this.id_universidad_convenio = d_universidad_convenio;
	}

	public String getNombre_universidad_convenio() {
		return nombre_universidad_convenio;
	}

	public void setNombre_universidad_convenio(String nombre_universidad_convenio) {
		this.nombre_universidad_convenio = nombre_universidad_convenio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}
