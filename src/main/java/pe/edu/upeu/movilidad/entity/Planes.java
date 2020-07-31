package pe.edu.upeu.movilidad.entity;

public class Planes {
	private int id_plan;
	private String doc_plan;
	private String estado_decano;
	private String estado_ocni;
	private String estado_consejo_univ;
	private int id_presentacion_documentos;
	private int id_docente;
	private String estado_general;
	public Planes() {
		super();
	}
	
	public Planes(int id_plan, String doc_plan, String estado_decano, String estado_ocni, String estado_consejo_univ,
			int id_presentacion_documentos, int id_docente, String estado_general) {
		super();
		this.id_plan = id_plan;
		this.doc_plan = doc_plan;
		this.estado_decano = estado_decano;
		this.estado_ocni = estado_ocni;
		this.estado_consejo_univ = estado_consejo_univ;
		this.id_presentacion_documentos = id_presentacion_documentos;
		this.id_docente = id_docente;
		this.estado_general = estado_general;
	}

	public int getId_plan() {
		return id_plan;
	}

	public void setId_plan(int id_plan) {
		this.id_plan = id_plan;
	}

	public String getDoc_plan() {
		return doc_plan;
	}

	public void setDoc_plan(String doc_plan) {
		this.doc_plan = doc_plan;
	}

	public String getEstado_decano() {
		return estado_decano;
	}

	public void setEstado_decano(String estado_decano) {
		this.estado_decano = estado_decano;
	}

	public String getEstado_ocni() {
		return estado_ocni;
	}

	public void setEstado_ocni(String estado_ocni) {
		this.estado_ocni = estado_ocni;
	}

	public String getEstado_consejo_univ() {
		return estado_consejo_univ;
	}

	public void setEstado_consejo_univ(String estado_consejo_univ) {
		this.estado_consejo_univ = estado_consejo_univ;
	}

	public int getId_presentacion_documentos() {
		return id_presentacion_documentos;
	}

	public void setId_presentacion_documentos(int id_presentacion_documentos) {
		this.id_presentacion_documentos = id_presentacion_documentos;
	}

	public int getId_docente() {
		return id_docente;
	}

	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}

	public String getEstado_general() {
		return estado_general;
	}

	public void setEstado_general(String estado_general) {
		this.estado_general = estado_general;
	}

}
