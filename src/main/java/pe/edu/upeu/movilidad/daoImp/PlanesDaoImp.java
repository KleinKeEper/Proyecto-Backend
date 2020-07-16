package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.movilidad.dao.PlanesDao;
@Repository
public class PlanesDaoImp implements PlanesDao{
	@Autowired	
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
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
}
