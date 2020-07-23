package pe.edu.upeu.movilidad.entity;

public class Planes {
	private int id_plan;
	private String doc_plan;
	private String estado_decano;
	private String estado_ocni;
	private String estado_consejo_univ;
	private String doc_financiero;
	private String visa;
	private String pasaporte;
	private String seguro_internacional;
	private String ticket_avion;
	private String ppt;
	private int id_presentacion_documentos;
	private String estado_general;
	public Planes() {
		super();
	}
	public Planes(int id_plan, String doc_plan, String estado_decano, String estado_ocni, String estado_consejo_univ, String doc_financiero,
			String visa, String pasaporte, String seguro_internacional, String ticket_avion, String ppt,
			int id_presentacion_documentos, String estado_general) {
		super();
		this.id_plan = id_plan;
		this.doc_plan = doc_plan;
		this.estado_decano = estado_decano;
		this.estado_ocni = estado_ocni;
		this.estado_consejo_univ = estado_consejo_univ;
		this.doc_financiero = doc_financiero;
		this.visa = visa;
		this.pasaporte = pasaporte;
		this.seguro_internacional = seguro_internacional;
		this.ticket_avion = ticket_avion;
		this.ppt = ppt;
		this.id_presentacion_documentos = id_presentacion_documentos;
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
	public String getDoc_financiero() {
		return doc_financiero;
	}
	public void setDoc_financiero(String doc_financiero) {
		this.doc_financiero = doc_financiero;
	}
	public String getVisa() {
		return visa;
	}
	public void setVisa(String visa) {
		this.visa = visa;
	}
	public String getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	public String getSeguro_internacional() {
		return seguro_internacional;
	}
	public void setSeguro_internacional(String seguro_internacional) {
		this.seguro_internacional = seguro_internacional;
	}
	public String getTicket_avion() {
		return ticket_avion;
	}
	public void setTicket_avion(String ticket_avion) {
		this.ticket_avion = ticket_avion;
	}
	public String getPpt() {
		return ppt;
	}
	public void setPpt(String ppt) {
		this.ppt = ppt;
	}
	public int getId_presentacion_documentos() {
		return id_presentacion_documentos;
	}
	public void setId_presentacion_documentos(int id_presentacion_documentos) {
		this.id_presentacion_documentos = id_presentacion_documentos;
	}
	public String getEstado_general() {
		return estado_general;
	}
	public void setEstado_general(String estado_general) {
		this.estado_general = estado_general;
	}
	
}
