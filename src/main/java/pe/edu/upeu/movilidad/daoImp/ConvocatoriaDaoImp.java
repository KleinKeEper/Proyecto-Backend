package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.movilidad.dao.ConvocatoriaDao;
import pe.edu.upeu.movilidad.entity.Convocatoria;

@Repository
public class ConvocatoriaDaoImp implements ConvocatoriaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("LIST_CONVOCATORIA").withCatalogName("PK_GENERAR_VACANTES");
		return simpleJdbcCall.execute();
	}

	@Override
	public int create(Convocatoria c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_generar_vacantes.insert_convenio(?,?,?,?,?,?)",
									c.getNombre_convocatoria(),
									c.getNro_vacantes(),
									c.getRequisitos(),
									c.getFecha_de_presentacion(),
									c.getId_escuela(),
									c.getId_universidad_convenio());
	}
	
	

}
