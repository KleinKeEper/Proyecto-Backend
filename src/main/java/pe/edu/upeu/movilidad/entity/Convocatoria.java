package pe.edu.upeu.movilidad.entity;

public class Convocatoria {

	private int id_convocatoria;
	private String nombre_convocatoria;
	private int nro_vacantes;
	private String requisitos;
	private String fecha_de_presentacion;
	private String estado_evaluado;
	private String universidad_anfitriona;
	private int id_escuela;
	private int id_universidad_convenio;
	public Convocatoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Convocatoria(int id_convocatoria, String nombre_convocatoria, int nro_vacantes, String requisitos,
			String fecha_de_presentacion, String estado_evaluado, String universidad_anfitriona, int id_escuela,
			int id_universidad_convenio) {
		super();
		this.id_convocatoria = id_convocatoria;
		this.nombre_convocatoria = nombre_convocatoria;
		this.nro_vacantes = nro_vacantes;
		this.requisitos = requisitos;
		this.fecha_de_presentacion = fecha_de_presentacion;
		this.estado_evaluado = estado_evaluado;
		this.universidad_anfitriona = universidad_anfitriona;
		this.id_escuela = id_escuela;
		this.id_universidad_convenio = id_universidad_convenio;
	}



	public int getId_convocatoria() {
		return id_convocatoria;
	}
	public void setId_convocatoria(int id_convocatoria) {
		this.id_convocatoria = id_convocatoria;
	}
	public int getNro_vacantes() {
		return nro_vacantes;
	}
	public void setNro_vacantes(int nro_vacantes) {
		this.nro_vacantes = nro_vacantes;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public String getFecha_de_presentacion() {
		return fecha_de_presentacion;
	}
	public void setFecha_de_presentacion(String fecha_de_presentacion) {
		this.fecha_de_presentacion = fecha_de_presentacion;
	}
	public String getEstado_evaluado() {
		return estado_evaluado;
	}
	public void setEstado_evaluado(String estado_evaluado) {
		this.estado_evaluado = estado_evaluado;
	}
	public String getUniversidad_anfitriona() {
		return universidad_anfitriona;
	}
	public void setUniversidad_anfitriona(String universidad_anfitriona) {
		this.universidad_anfitriona = universidad_anfitriona;
	}
	public int getId_escuela() {
		return id_escuela;
	}
	public void setId_escuela(int id_escuela) {
		this.id_escuela = id_escuela;
	}
	public int getId_universidad_convenio() {
		return id_universidad_convenio;
	}
	public void setId_universidad_convenio(int id_universidad_convenio) {
		this.id_universidad_convenio = id_universidad_convenio;
	}



	public String getNombre_convocatoria() {
		return nombre_convocatoria;
	}



	public void setNombre_convocatoria(String nombre_convocatoria) {
		this.nombre_convocatoria = nombre_convocatoria;
	}
	
	
	
}
