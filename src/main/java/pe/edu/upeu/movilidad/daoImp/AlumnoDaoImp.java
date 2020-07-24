package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.movilidad.dao.AlumnoDao;

@Repository
public class AlumnoDaoImp implements AlumnoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcTemplate;	
	
	@Override
	public Map<String, Object> getAlumno(int idalumno) {
		// TODO Auto-generated method stub
		
		simpleJdbcTemplate = new SimpleJdbcCall(jdbcTemplate).withFunctionName("FN_GET_ALUMNO").withCatalogName("PK_ADJUNTAR_DOCUMENTOS");
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("idalumno", idalumno); 
		return simpleJdbcTemplate.execute(in);
	}

}
