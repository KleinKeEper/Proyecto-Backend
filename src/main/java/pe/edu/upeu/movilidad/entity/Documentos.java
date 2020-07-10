package pe.edu.upeu.movilidad.entity;

public class Documentos {

	private int id_documentos;
	private String nombre_documento;
	private String descripcion;
	private String link;
	public Documentos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Documentos(int id_documentos, String nombre_documento, String descripcion, String link) {
		super();
		this.id_documentos = id_documentos;
		this.nombre_documento = nombre_documento;
		this.descripcion = descripcion;
		this.link = link;
	}
	public int getId_documentos() {
		return id_documentos;
	}
	public void setId_documentos(int id_documentos) {
		this.id_documentos = id_documentos;
	}
	public String getNombre_documento() {
		return nombre_documento;
	}
	public void setNombre_documento(String nombre_documento) {
		this.nombre_documento = nombre_documento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
	
}
