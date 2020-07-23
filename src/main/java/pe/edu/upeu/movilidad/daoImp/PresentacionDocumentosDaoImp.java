package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.movilidad.dao.PresentacionDocumentosDao;
@Repository
public class PresentacionDocumentosDaoImp implements PresentacionDocumentosDao {
	@Autowired	
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> readAll_alumno_ganador() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_LISTAR_ALUMNO_GANADOR").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("SALIDA_ALUMNO_GANADOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readAll_presentacion_documentos() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("list_presentacion_documentos").withCatalogName("pk_presentacion_documentos");
		return simpleJdbcCall.execute();
	}

	
	
}
