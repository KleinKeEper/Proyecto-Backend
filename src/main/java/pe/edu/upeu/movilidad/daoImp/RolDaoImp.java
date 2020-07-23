package pe.edu.upeu.movilidad.daoImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.movilidad.dao.RolDao;
import pe.edu.upeu.movilidad.entity.Rol;

@Repository
public class RolDaoImp  implements RolDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<GrantedAuthority> readAll(int id_usuario) {
		// TODO Auto-generated method stub
		List<GrantedAuthority> authors = new ArrayList<>();
		String SQL = "SELECT U.ID_USUARIO AS ID_USUARIO, R.ID_ROL AS ID_ROL, R.NOMBRE_ROL AS NOMBRE_ROL "
				+ "FROM ROL R, USUARIO_ROL UR, USUARIO U WHERE R.ID_ROL = UR.ID_ROL AND UR.ID_USUARIO=U.ID_USUARIO AND U.ID_USUARIO = ?";
		
		List<Rol> roles = jdbcTemplate.query(SQL, new Object[]{id_usuario}, new BeanPropertyRowMapper<Rol>(Rol.class) );
		for (int i = 0; i < roles.size(); i++) {
			authors.add(new SimpleGrantedAuthority(roles.get(i).getNombre_rol()));
		}
		
		return authors;
	}

}
