package pe.edu.upeu.movilidad.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.UsuarioDao;
import pe.edu.upeu.movilidad.entity.Rol;
import pe.edu.upeu.movilidad.entity.Usuario;
import pe.edu.upeu.movilidad.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{

	
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public Usuario validarUsuario(String username) {
		// TODO Auto-generated method stub
		return usuarioDao.validarUsuario(username);
	}

	@Override
	public Map<String, Object> datosUsuario(String username) {
		// TODO Auto-generated method stub
		return usuarioDao.datosUsuario(username);
	}
	

	

	
}
