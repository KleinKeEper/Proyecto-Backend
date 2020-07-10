package pe.edu.upeu.movilidad.entity;

public class SolicitarDocumentos {

	private int id_solicitar_documentos;
	private String link;
	private String estado;
	private int id_documentos;
	private int id_presentacion_documentos;
	public SolicitarDocumentos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SolicitarDocumentos(int id_solicitar_documentos, String link, String estado, int id_documentos,
			int id_presentacion_documentos) {
		super();
		this.id_solicitar_documentos = id_solicitar_documentos;
		this.link = link;
		this.estado = estado;
		this.id_documentos = id_documentos;
		this.id_presentacion_documentos = id_presentacion_documentos;
	}
	public int getId_solicitar_documentos() {
		return id_solicitar_documentos;
	}
	public void setId_solicitar_documentos(int id_solicitar_documentos) {
		this.id_solicitar_documentos = id_solicitar_documentos;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getId_documentos() {
		return id_documentos;
	}
	public void setId_documentos(int id_documentos) {
		this.id_documentos = id_documentos;
	}
	public int getId_presentacion_documentos() {
		return id_presentacion_documentos;
	}
	public void setId_presentacion_documentos(int id_presentacion_documentos) {
		this.id_presentacion_documentos = id_presentacion_documentos;
	}
	
	
	
	
}
