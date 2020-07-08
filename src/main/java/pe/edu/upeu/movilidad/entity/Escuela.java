package pe.edu.upeu.movilidad.entity;

public class Escuela {
	int id_escuela;
	String nombre_escuela;
	int id_facultad;
	public Escuela() {
		super();
	}
	public Escuela(int id_escuela, String nombre_escuela, int id_facultad) {
		super();
		this.id_escuela = id_escuela;
		this.nombre_escuela = nombre_escuela;
		this.id_facultad = id_facultad;
	}
	public int getId_escuela() {
		return id_escuela;
	}
	public void setId_escuela(int id_escuela) {
		this.id_escuela = id_escuela;
	}
	public String getNombre_escuela() {
		return nombre_escuela;
	}
	public void setNombre_escuela(String nombre_escuela) {
		this.nombre_escuela = nombre_escuela;
	}
	public int getId_facultad() {
		return id_facultad;
	}
	public void setId_facultad(int id_facultad) {
		this.id_facultad = id_facultad;
	}
	
	
}
