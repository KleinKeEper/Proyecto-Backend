package pe.edu.upeu.movilidad.service;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public interface RolService {
	
	List<GrantedAuthority> readAll(int id_usuario);
}
