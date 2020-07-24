package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.movilidad.dao.EscuelaDao;

@Repository
public class EscuelaDaoImp implements EscuelaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> readId(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("LIST_ESCUELA").withCatalogName("PK_GENERAR_VACANTES");
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("id_facu", id);
		
//		Map<String, Object> res = simpleJdbcCall.execute(in);
		
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> getIdEscuela(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("FN_GET_ESCUELA").withCatalogName("PK_ADJUNTAR_DOCUMENTOS");
		SqlParameterSource in = new MapSqlParameterSource().addValue("idpersona", id);
		return simpleJdbcCall.execute(in);
	}
	

}
