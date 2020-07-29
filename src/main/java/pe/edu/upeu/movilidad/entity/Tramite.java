package pe.edu.upeu.movilidad.entity;

public class Tramite {
	private int id_tramite;
	private String visa;
	private String pasaporte;
	private String seguro_internacional;
	private String ticket_avion;
	private int id_docente;
	private int id_plan;
	private String estado;
	public Tramite() {
		super();
	}
	public Tramite(int id_tramite, String visa, String pasaporte, String seguro_internacional, String ticket_avion,
			int id_docente, int id_plan, String estado) {
		super();
		this.id_tramite = id_tramite;
		this.visa = visa;
		this.pasaporte = pasaporte;
		this.seguro_internacional = seguro_internacional;
		this.ticket_avion = ticket_avion;
		this.id_docente = id_docente;
		this.id_plan = id_plan;
		this.estado = estado;
	}
	public int getId_tramite() {
		return id_tramite;
	}
	public void setId_tramite(int id_tramite) {
		this.id_tramite = id_tramite;
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
	public int getId_docente() {
		return id_docente;
	}
	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}
	public int getId_plan() {
		return id_plan;
	}
	public void setId_plan(int id_plan) {
		this.id_plan = id_plan;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
