package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.BeanProperty;

import pe.edu.upeu.movilidad.dao.UsuarioDao;
import pe.edu.upeu.movilidad.entity.Rol;
import pe.edu.upeu.movilidad.entity.Usuario;


@Repository
@Component
public class UsuarioDaoImp implements UsuarioDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Map<String, Object> datosUsuario(String username) {
		// TODO Auto-generated method stub
		String SQL = "select u.id_usuario, u.username, p.id_persona , p.nombre_persona, p.apellido_persona, ur.id_usuario_rol from persona p, usuario u, " + 
				"usuario_rol ur where  u.id_persona = p.id_persona and u.id_usuario = ur.id_usuario and u.username = ?";
		Map<String, Object> map= jdbcTemplate.queryForMap(SQL, username);
		
	return map;
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario validarUsuario(String username) {
		// TODO Auto-generated method stub
		String SQL = "select * from usuario where username= ?";
		Usuario user = new Usuario();
		user = (Usuario)jdbcTemplate.queryForObject(SQL, new Object[]{username}, BeanPropertyRowMapper.newInstance(Usuario.class));	
		return user;
	}

	@Override
	public int getIdRol(String username) {
		// TODO Auto-generated method stub
		return 0;
	}


}
