package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.movilidad.dao.SolicitarDocumentosDao;
import pe.edu.upeu.movilidad.entity.SolicitarDocumentos;

@Repository
public class SolicitarDocumentosDaoImp implements SolicitarDocumentosDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	
	@Override
	public int create(SolicitarDocumentos sd) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_solicitar_documentos.sp_solicitar(?,?,?)",
				sd.getId_documentos(), sd.getId_presentacion_documentos(), sd.getEstado() );
	}


	@Override
	public Map<String, Object> validar(int idpresentacion) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("VALIDAR_DOCUMENTO").withCatalogName("PK_SOLICITAR_DOCUMENTOS");
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("idpresentacion", idpresentacion);
		return simpleJdbcCall.execute(in);
	}


	@Override
	public Map<String, Object> getDocumentosSolictados(int idpersona) {
		// TODO Auto-generated method stub
		
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("FN_LISTAR_SOLICITDOS").withCatalogName("PK_ADJUNTAR_SOLICITADOS");
		
		SqlParameterSource  in = new MapSqlParameterSource().addValue("idpersona", idpersona);
		
		return simpleJdbcCall.execute(in) ;
	}


	@Override
	public int updateFile(SolicitarDocumentos sd) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_adjuntar_solicitados.sp_update_file(?,?)", 
				sd.getId_solicitar_documentos(), sd.getLink());
	}


	@Override
	public Map<String, Object> get(int idpersona) {
		// TODO Auto-generated method stub
			
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("FN_GET").withCatalogName("PK_RECEPCIONAR_SOLICITADOS");
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("idpersona", idpersona);
		
		return simpleJdbcCall.execute(in);
	}

}
