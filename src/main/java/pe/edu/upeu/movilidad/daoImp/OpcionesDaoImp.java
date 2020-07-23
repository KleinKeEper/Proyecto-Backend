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
import pe.edu.upeu.movilidad.dao.OpcionesDao;

@Repository
public class OpcionesDaoImp implements OpcionesDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
		
	
	@Override
	public Map<String, Object> read(String username) {
		// TODO Auto-generated method stub
//		System.out.println("estoy buscando opciones");
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_GET_OPCIONES").withCatalogName("PKG_LOGIN")
				.declareParameters(new SqlOutParameter("opciones", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("user_ent", Types.VARCHAR));
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("user_ent", username);
		
//		System.out.println(in);
//		System.out.println(simpleJdbcCall.execute(in));
		return simpleJdbcCall.execute(in);
	}

	
	
}
