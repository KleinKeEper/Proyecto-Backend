package pe.edu.upeu.movilidad.entity;

public class Persona {

	
	private int id_persona;
	private String nombre_persona;
	private String apellido_persona;
	private String tipo_documento;
	private String numero_documento;
	private String correo;
	private String codigo;
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(int id_persona, String nombre_persona, String apellido_persona, String tipo_documento, String numero_documento, String correo,
			String codigo) {
		super();
		this.id_persona = id_persona;
		this.nombre_persona = nombre_persona;
		this.apellido_persona = apellido_persona;
		this.tipo_documento = tipo_documento;
		this.numero_documento = numero_documento;
		this.correo = correo;
		this.codigo = codigo;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombre_persona() {
		return nombre_persona;
	}
	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}
	public String getApellido_persona() {
		return apellido_persona;
	}
	public void setApellido_persona(String apellido_persona) {
		this.apellido_persona = apellido_persona;
	}
	public String getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNumero_documento() {
		return numero_documento;
	}
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
	
	
}
