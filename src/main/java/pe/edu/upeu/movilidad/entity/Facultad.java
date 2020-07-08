package pe.edu.upeu.movilidad.entity;

public class Facultad {
	int id_facultad;
	String nombre_facultad;
	
	public Facultad(int id_facultad, String nombre_facultad) {
		super();
		this.id_facultad = id_facultad;
		this.nombre_facultad = nombre_facultad;
	}

	public int getId_facultad() {
		return id_facultad;
	}

	public void setId_facultad(int id_facultad) {
		this.id_facultad = id_facultad;
	}

	public String getNombre_facultad() {
		return nombre_facultad;
	}

	public void setNombre_facultad(String nombre_facultad) {
		this.nombre_facultad = nombre_facultad;
	}
	
}


