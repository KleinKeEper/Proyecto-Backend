package pe.edu.upeu.movilidad.entity;

public class Alumno {

	private int id_alumno;
	 private int ciclo;
	 private int id_escuela;
	 private int id_persona;
	 private int id_usuario;
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alumno(int id_alumno, int ciclo, int id_escuela, int id_persona, int id_usuario) {
		super();
		this.id_alumno = id_alumno;
		this.ciclo = ciclo;
		this.id_escuela = id_escuela;
		this.id_persona = id_persona;
		this.id_usuario = id_usuario;
	}
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public int getId_escuela() {
		return id_escuela;
	}
	public void setId_escuela(int id_escuela) {
		this.id_escuela = id_escuela;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	 
	 
	 
}
