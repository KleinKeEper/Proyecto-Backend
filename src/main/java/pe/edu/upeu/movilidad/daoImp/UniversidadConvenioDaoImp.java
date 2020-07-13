package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.movilidad.dao.UniversidadConvenioDao;

@Repository
public class UniversidadConvenioDaoImp implements UniversidadConvenioDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("LIST_UNIVERSIDAD_CONVENIO").withCatalogName("PK_GENERAR_VACANTES");
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readId(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("LIST_ID_UNIVERSIDAD_CONVENIO").withCatalogName("PK_GENERAR_VACANTES");
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("id_universidad", id);
		return simpleJdbcCall.execute(in);
	}

	
}
