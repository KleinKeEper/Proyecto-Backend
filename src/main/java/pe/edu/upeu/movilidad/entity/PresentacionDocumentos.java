package pe.edu.upeu.movilidad.entity;

public class PresentacionDocumentos {

	private int id_presentacion_documentos;
	private String solicitud_mae;
	private String carta_motivacion;
	private String estado_evaluado;
	private int id_alumno;
	private int id_convocatoria;
	
	
	public PresentacionDocumentos() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PresentacionDocumentos(int id_presentacion_documentos, String solicitud_mae, String carta_motivacion,
			String estado_evaluado, int id_alumno, int id_convocatoria) {
		super();
		this.id_presentacion_documentos = id_presentacion_documentos;
		this.solicitud_mae = solicitud_mae;
		this.carta_motivacion = carta_motivacion;
		this.estado_evaluado = estado_evaluado;
		this.id_alumno = id_alumno;
		this.id_convocatoria = id_convocatoria;
	}


	public int getId_presentacion_documentos() {
		return id_presentacion_documentos;
	}


	public void setId_presentacion_documentos(int id_presentacion_documentos) {
		this.id_presentacion_documentos = id_presentacion_documentos;
	}


	public String getSolicitud_mae() {
		return solicitud_mae;
	}


	public void setSolicitud_mae(String solicitud_mae) {
		this.solicitud_mae = solicitud_mae;
	}


	public String getCarta_motivacion() {
		return carta_motivacion;
	}


	public void setCarta_motivacion(String carta_motivacion) {
		this.carta_motivacion = carta_motivacion;
	}


	public String getEstado_evaluado() {
		return estado_evaluado;
	}


	public void setEstado_evaluado(String estado_evaluado) {
		this.estado_evaluado = estado_evaluado;
	}


	public int getId_alumno() {
		return id_alumno;
	}


	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}


	public int getId_convocatoria() {
		return id_convocatoria;
	}


	public void setId_convocatoria(int id_convocatoria) {
		this.id_convocatoria = id_convocatoria;
	}
	
	
	
}
