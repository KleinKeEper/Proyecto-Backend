package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.movilidad.entity.Planes; 
import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.movilidad.dao.PlanesDao;
@Repository
public class PlanesDaoImp implements PlanesDao{
	@Autowired	
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Planes planes) {
		return jdbcTemplate.update("call PK_PLANES.SP_INSERTAR_PLAN (?,?)",planes.getDoc_plan(),planes.getId_presentacion_documentos());
	}
	@Override
	public Map<String, Object> readAll_plan_direscuela_espera() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_DIRESCUELA_ESPERA").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("PLAN_DIRESCUELA_ESPERA", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readAll_plan_direscuela_aprobado() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_DIRESCUELA_APROBADO").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("PLAN_DIRESCUELA_APROBADO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readAll_plan_direscuela_eliminado() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_DIRESCUELA_ELIMINADO").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("PLAN_DIRESCUELA_ELIMINADO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readAll_plan_direscuela_denegado() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_DIRESCUELA_DENEGADO").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("PLAN_DIRESCUELA_DENEGADO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public Map<String, Object> readAll_plan_ocni_espera() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_OCNI_ESPERA").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("PLAN_OCNI_ESPERA", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public Map<String, Object> readAll_plan_ocni_aprobado() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_OCNI_APROBADO").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("PLAN_OCNI_APROBADO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public Map<String, Object> readAll_plan_ocni_denegado() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_OCNI_DENEGADO").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("PLAN_OCNI_DENEGADO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public Map<String, Object> readAll_plan_consejo_espera() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_CONSEJO_ESPERA").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("PLAN_CONSEJO_ESPERA", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public Map<String, Object> readAll_plan_consejo_aprobado() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_CONSEJO_APROBADO").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("PLAN_CONSEJO_APROBADO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public Map<String, Object> readAll_plan_consejo_denegado() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_CONSEJO_DENEGADO").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("PLAN_CONSEJO_DENEGADO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public int estado_decano(Planes planes) {
		return jdbcTemplate.update("call PK_PLANES.SP_ESTADO_DECANO(?,?)",planes.getId_plan(), planes.getEstado_decano());
	}

	@Override
	public int estado_ocni(Planes planes) {
		return jdbcTemplate.update("call PK_PLANES.SP_ESTADO_OCNI(?,?)",planes.getId_plan(), planes.getEstado_ocni());
	}

	@Override
	public int estado_consejo_univ(Planes planes) {
		return jdbcTemplate.update("call PK_PLANES.SP_ESTADO_CONSEJO_UNIV(?,?)",planes.getId_plan(), planes.getEstado_consejo_univ());
	}

	@Override
	public int estado_general(Planes planes) {
		return jdbcTemplate.update("call PK_PLANES.SP_ESTADO_GENERAL(?,?)",planes.getId_plan(), planes.getEstado_general());
	}

	@Override
	public int eliminar_plan(int id) {
		return jdbcTemplate.update("call PK_PLANES.SP_ELIMINAR_PLAN(?)",id);
	}

	
	
}
