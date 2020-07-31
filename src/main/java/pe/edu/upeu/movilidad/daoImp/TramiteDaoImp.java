package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.movilidad.dao.TramiteDao;
import pe.edu.upeu.movilidad.entity.*;
@Repository
public class TramiteDaoImp implements TramiteDao{
	@Autowired	
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Tramite tramite) {
		return jdbcTemplate.update("call PK_PLANES.SP_INSERTAR_TRAMITE (?,?,?,?,?,?)",tramite.getVisa(),tramite.getPasaporte(),tramite.getSeguro_internacional(),tramite.getTicket_avion(),tramite.getId_docente(),tramite.getId_plan());
	}
	
	@Override
	public Map<String, Object> readAll_Tramite() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_LISTAR_TRAMITE").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("LISTA_TRAMITE", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
}
