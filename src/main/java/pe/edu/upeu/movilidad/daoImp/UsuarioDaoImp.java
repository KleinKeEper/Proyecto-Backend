package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
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
	private SimpleJdbcCall simpleJdbcCall;
	
	
	@Override
	public Map<String, Object> datosUsuario(String username) {
		// TODO Auto-generated method stub
		String SQL = "SELECT U.ID_USUARIO AS id_usuario, U.USERNAME AS username, P.ID_PERSONA  AS id_persona, P.NOMBRE_PERSONA AS nombre_persona, P.APELLIDO_PERSONA AS apellido_persona, U.FOTO AS foto FROM PERSONA P, USUARIO U, " + 
				"USUARIO_ROL UR WHERE  U.ID_PERSONA = P.ID_PERSONA AND U.ID_USUARIO = UR.ID_USUARIO AND U.USERNAME = ?";
		Map<String, Object> map= jdbcTemplate.queryForMap(SQL, username);
		
	return map;
	}
	
	

	@Override
	@Transactional(readOnly = true)
	public Usuario validarUsuario(String username) {
		// TODO Auto-generated method stub
//		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
//				.withProcedureName("")
		
		String SQL = "SELECT * FROM USUARIO WHERE USERNAME= ? AND ESTADO = 1";
		Usuario user = new Usuario();
		user = (Usuario)jdbcTemplate.queryForObject(SQL, new Object[]{username}, BeanPropertyRowMapper.newInstance(Usuario.class));	
		System.out.println("hola");
		System.out.println(user);
		return user;
	}

	@Override
	public int getIdRol(String username) {
		// TODO Auto-generated method stub
		return 0;
	}


}
