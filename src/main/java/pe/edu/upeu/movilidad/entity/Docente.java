package pe.edu.upeu.movilidad.entity;

public class Docente {

	private int id_docente;
	private int id_escuela;
	private int id_persona;
	private int id_usuario;
	
	
	
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Docente(int id_docente, int id_escuela, int id_persona, int id_usuario) {
		super();
		this.id_docente = id_docente;
		this.id_escuela = id_escuela;
		this.id_persona = id_persona;
		this.id_usuario = id_usuario;
	}



	public int getId_docente() {
		return id_docente;
	}



	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
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
