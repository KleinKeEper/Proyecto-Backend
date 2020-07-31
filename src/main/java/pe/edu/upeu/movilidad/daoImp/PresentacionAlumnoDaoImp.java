package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.movilidad.dao.PresentacionAlumnoDao;
import pe.edu.upeu.movilidad.entity.PresentacionAlumno;
@Repository
public class PresentacionAlumnoDaoImp implements PresentacionAlumnoDao{
	@Autowired	
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(PresentacionAlumno presentacionAlumno) {
		return jdbcTemplate.update("call PK_PLANES.SP_INSERTAR_PRESENTACION (?,?,?,?)",presentacionAlumno.getPpt(),presentacionAlumno.getFecha(),presentacionAlumno.getId_plan(),presentacionAlumno.getId_docente());
	}

	@Override
	public Map<String, Object> read_Presentacion() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_LISTAR_PRESENTACION").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("LISTA_PRESENTACION", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public int eliminar_presentacion(int id) {
		return jdbcTemplate.update("call PK_PLANES.SP_ELIMINAR_PRESENTACION(?)",id);

	}

}
