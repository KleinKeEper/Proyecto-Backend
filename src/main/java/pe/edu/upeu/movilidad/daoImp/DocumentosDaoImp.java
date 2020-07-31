package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.movilidad.dao.DocumentoDao;

@Repository
public class DocumentosDaoImp implements DocumentoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> radAll() {
		// TODO Auto-generated method stub
		
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("LIST_DOCUMENTOS").withCatalogName("pk_solicitar_documentos");
		
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> getDocumentos(int idpresentacion) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("fn_archivos").withCatalogName("pk_recepcionar_solicitados");
		SqlParameterSource in = new MapSqlParameterSource().addValue("idpresentacion", idpresentacion );
		
		return simpleJdbcCall.execute(in);
	}

}
