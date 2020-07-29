package pe.edu.upeu.movilidad.daoImp;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.movilidad.dao.ConstanciaFinancieraDao;
import pe.edu.upeu.movilidad.entity.*;

@Repository
public class ConstanciaFinancieraDaoImp implements ConstanciaFinancieraDao{
	@Autowired	
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> getConstanciaFinanciera() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_LISTAR_CONS_FINANCIERO").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("LISTA_CONS_FINANCIERO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public int create(ConstanciaFinanciera constancia) {
		return jdbcTemplate.update("call PK_PLANES.SP_INSERTAR_CONS_FINANCIERO (?,?,?)",constancia.getDoc_financiero(),constancia.getId_plan(),constancia.getId_docente());
	}
	
	@Override
	public Map<String, Object> getFacultad() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_LISTAR_FACULTAD").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("FACU", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> getEscuelaFacultad(int idfacultad) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_LISTAR_ESCUELA_FACU").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("LISTAR_ESCUELA", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDFACULTAD", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDFACULTAD", idfacultad);
		return simpleJdbcCall.execute(in);
	}
	
	@Override
	public Map<String, Object> getPlanEscuela(int idescuela) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_PLAN_FINANCIERO").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("LISTA_PLANES_APROB", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDESCUELA", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDESCUELA", idescuela);
		return simpleJdbcCall.execute(in);
	}

}
