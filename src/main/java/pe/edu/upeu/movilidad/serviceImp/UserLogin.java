package pe.edu.upeu.movilidad.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.RolDao;
import pe.edu.upeu.movilidad.dao.UsuarioDao;
import pe.edu.upeu.movilidad.entity.Usuario;

@Service("userService")
public class UserLogin implements UserDetailsService {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Autowired
	private RolDao rolDao;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario user = usuarioDao.validarUsuario(username);
		UserDetails details = new User(user.getUsername(), user.getPassword(), rolDao.readAll(user.getId_usuario()));
		return details;
	}

}
