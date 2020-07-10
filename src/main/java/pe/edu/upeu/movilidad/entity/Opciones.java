package pe.edu.upeu.movilidad.entity;

public class Opciones {

	private int id_opciones;
	private String nombre_opciones;
	private String ruta;
	private String icon;
	public Opciones() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Opciones(int id_opciones, String nombre_opciones, String ruta, String icon) {
		super();
		this.id_opciones = id_opciones;
		this.nombre_opciones = nombre_opciones;
		this.ruta = ruta;
		this.icon = icon;
	}
	public int getId_opciones() {
		return id_opciones;
	}
	public void setId_opciones(int id_opciones) {
		this.id_opciones = id_opciones;
	}
	public String getNombre_opciones() {
		return nombre_opciones;
	}
	public void setNombre_opciones(String nombre_opciones) {
		this.nombre_opciones = nombre_opciones;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}
