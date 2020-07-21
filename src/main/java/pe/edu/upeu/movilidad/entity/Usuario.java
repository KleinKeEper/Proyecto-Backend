package pe.edu.upeu.movilidad.entity;

public class Usuario {
	public int id_usuario;
	public String username;
	public String password;
	public String estado;
	public int id_persona;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(int id_usuario, String username, String password, String estado, int id_persona) {
		super();
		this.id_usuario = id_usuario;
		this.username = username;
		this.password = password;
		this.estado = estado;
		this.id_persona = id_persona;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
		
}
