package pe.edu.upeu.movilidad.dao;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public interface RolDao {
	
	List<GrantedAuthority> readAll(int id_usuario);

}
