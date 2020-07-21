package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.Usuario;

public interface UsuarioService {

	Usuario validarUsuario(String username);
	Map<String, Object> datosUsuario(String username);
	
}
