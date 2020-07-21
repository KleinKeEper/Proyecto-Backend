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
		String SQL = "SELECT u.id_usuario as 'id_usuario', r.id_rol as 'id_rol', r.nombre_rol as 'nombre_rol' "
				+ "FROM rol r, usuario_rol ur, usuario u WHERE r.id_rol = ur.id_rol and ur.id_usuario=u.id_usuario and u.id_usuario = ?";
		
		List<Rol> roles = jdbcTemplate.query(SQL, new Object[]{id_usuario}, new BeanPropertyRowMapper<Rol>(Rol.class) );
		for (int i = 0; i < roles.size(); i++) {
			authors.add(new SimpleGrantedAuthority(roles.get(i).getNombre_rol()));
		}
		
		return authors;
	}

}
