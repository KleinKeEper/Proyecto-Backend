package pe.edu.upeu.movilidad.entity;

public class Rol {
	
	private int id_rol;
	private String nombre_rol;
	public Rol(int id_rol, String nombre_rol) {
		super();
		this.id_rol = id_rol;
		this.nombre_rol = nombre_rol;
	}
	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_rol() {
		return id_rol;
	}
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	public String getNombre_rol() {
		return nombre_rol;
	}
	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}
	
	

}
