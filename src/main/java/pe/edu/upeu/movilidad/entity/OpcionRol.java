package pe.edu.upeu.movilidad.entity;

public class OpcionRol {

	private int id_opcion_rol;
	private int id_rol;
	private int id_opciones;
	public OpcionRol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OpcionRol(int id_opcion_rol, int id_rol, int id_opciones) {
		super();
		this.id_opcion_rol = id_opcion_rol;
		this.id_rol = id_rol;
		this.id_opciones = id_opciones;
	}
	public int getId_opcion_rol() {
		return id_opcion_rol;
	}
	public void setId_opcion_rol(int id_opcion_rol) {
		this.id_opcion_rol = id_opcion_rol;
	}
	public int getId_rol() {
		return id_rol;
	}
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	public int getId_opciones() {
		return id_opciones;
	}
	public void setId_opciones(int id_opciones) {
		this.id_opciones = id_opciones;
	}
	
	
}
