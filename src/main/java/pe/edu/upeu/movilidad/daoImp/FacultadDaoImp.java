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

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.movilidad.dao.FacultadDao;


@Repository
public class FacultadDaoImp  implements FacultadDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> getID(int id_persona) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("LIS_ID_FACULTAD").withCatalogName("PK_GENERAR_VACANTES")
				.declareParameters(new SqlOutParameter("id_facultad", OracleTypes.CURSOR, new ColumnMapRowMapper()),
						new SqlParameter("id_persona_entrada", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("id_persona_entrada", id_persona);
		
		return simpleJdbcCall.execute(in);
	}

}
