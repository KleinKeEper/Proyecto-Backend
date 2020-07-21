package pe.edu.upeu.movilidad.dao;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.Rol;
import pe.edu.upeu.movilidad.entity.Usuario;

public interface UsuarioDao {
	public Usuario validarUsuario(String username);
	public Map<String, Object> datosUsuario(String username); 
	public int getIdRol(String username);

}
