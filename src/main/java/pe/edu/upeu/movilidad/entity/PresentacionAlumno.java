package pe.edu.upeu.movilidad.entity;

public class PresentacionAlumno {
	private int id_presentacion_alumno;
	private String ppt;
	private String fecha;
	private String estado;
	private int id_plan;
	private int id_docente;
	public PresentacionAlumno() {
		super();
	}
	public PresentacionAlumno(int id_presentacion_alumno, String ppt, String fecha, String estado,
			int id_plan, int id_docente) {
		super();
		this.id_presentacion_alumno = id_presentacion_alumno;
		this.ppt = ppt;
		this.fecha = fecha;
		this.estado = estado;
		this.id_plan = id_plan;
		this.id_docente = id_docente;
	}
	public int getId_presentacion_alumno() {
		return id_presentacion_alumno;
	}
	public void setId_presentacion_alumno(int id_presentacion_alumno) {
		this.id_presentacion_alumno = id_presentacion_alumno;
	}
	public String getPpt() {
		return ppt;
	}
	public void setPpt(String ppt) {
		this.ppt = ppt;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getId_plan() {
		return id_plan;
	}
	public void setId_plan(int id_plan) {
		this.id_plan = id_plan;
	}
	public int getId_docente() {
		return id_docente;
	}
	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}
	
	
	

}
