package pe.edu.upeu.movilidad.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
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
	public Map<String, Object> readAll(int idescuela) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("LIST_CONVOCATORIA").withCatalogName("PK_GENERAR_VACANTES");
		SqlParameterSource in = new MapSqlParameterSource().addValue("idescuela", idescuela);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public int create(Convocatoria c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_generar_vacantes.insert_convenio(?,?,?,?,?,?)",
									c.getNombre_convocatoria(),
									c.getNro_vacantes(),
									c.getRequisitos(),
									c.getFecha_presentacion(),
									c.getId_escuela(),
									c.getId_universidad_convenio());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_generar_vacantes.delete_convocatoria(?)", id);
	}
	
	
	@Override
	public int update(Convocatoria c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_generar_vacantes.update_convenio(?,?,?,?,?,?,?)", 
									c.getId_convocatoria(),
									c.getNombre_convocatoria(),
									c.getNro_vacantes(),
									c.getRequisitos(),
									c.getFecha_presentacion(),
									c.getId_escuela(),
									c.getId_universidad_convenio());
	}

	
	@Override
	public Map<String, Object> readId(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("LIST_ID_CONVOCATORIA").withCatalogName("PK_GENERAR_VACANTES");
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("i_id_convocatoria", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public int update_convocatoria(Convocatoria convocatoria) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_convocatoria.SP_APERTURAR_CONVOCATORIA(?,?)",
				convocatoria.getId_convocatoria(),
				convocatoria.getEstado_evaluado());	
		}

	@Override
	public Map<String, Object> readAll_convo_espera() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("list_convo_espera").withCatalogName("pk_convocatoria");
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readAll_convo_aperturada() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("list_convo_aperturada").withCatalogName("pk_convocatoria");
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readAll_convo_no_aperturada() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("list_convo_no_aperturada").withCatalogName("pk_convocatoria");
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> getConvocatorias(int idescuela) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("fn_list_convocatoria").withCatalogName("pk_adjuntar_documentos");
		
		SqlParameterSource  in = new MapSqlParameterSource().addValue("idescuela", idescuela);
		
		return simpleJdbcCall.execute(in) ;
	}

	
	

}
