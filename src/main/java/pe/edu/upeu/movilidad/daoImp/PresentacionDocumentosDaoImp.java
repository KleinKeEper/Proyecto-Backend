package pe.edu.upeu.movilidad.daoImp;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
<<<<<<< HEAD
=======
import org.springframework.jdbc.core.SqlParameter;
>>>>>>> da20c00b0404e5b27ad9a31740e8019fbb39df3b
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.movilidad.dao.PresentacionDocumentosDao;
import pe.edu.upeu.movilidad.entity.PresentacionDocumentos;
@Repository
public class PresentacionDocumentosDaoImp implements PresentacionDocumentosDao {
	@Autowired	
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> readAll_alumno_ganador(int id_persona) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_LISTAR_ALUMNO_GANADOR").withCatalogName("PK_PLANES")
				.declareParameters(new SqlOutParameter("SALIDA_ALUMNO_GANADOR", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("ID_PERSONA_ENTRADA", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("ID_PERSONA_ENTRADA", id_persona);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll_presentacion_documentos() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("list_presentacion_documentos").withCatalogName("pk_presentacion_documentos");
		return simpleJdbcCall.execute();
	}

	@Override
<<<<<<< HEAD
	public int update_presentacion_documentos(PresentacionDocumentos presentacionDocumentos) {
		return jdbcTemplate.update("call pk_presentacion_documentos.SP_APROBAR_DOCUMENTOS_OCNI(?,?)",
				presentacionDocumentos.getId_presentacion_documentos(),
				presentacionDocumentos.getEstado_evaluado());
	}

	@Override
	public Map<String, Object> readAll_documentos_director(int id_persona) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("list_prese_doc_dir").withCatalogName("pk_presentacion_documentos");
		SqlParameterSource in =new MapSqlParameterSource().addValue("ID_PERSONA_ENTRADA", id_persona);
		return simpleJdbcCall.execute(in);
=======
	public int create(PresentacionDocumentos pd) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_adjuntar_documentos.sp_create_presentacion(?,?,?,?)",
				pd.getSolicitud_mae(), pd.getCarta_motivacion(), pd.getId_alumno(), pd.getId_convocatoria());
	}
	
	@Override
	public Map<String, Object> getPostulaciones(int idalumno, int idconvocatoria) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withFunctionName("FN_POSTULAR_DENUEVO").withCatalogName("PK_ADJUNTAR_DOCUMENTOS");
		System.out.println("idalumno" + idalumno);
		System.out.println("idconvocatoria" + idconvocatoria);
		
		// SqlParameterSource in = new MapSqlParameterSource().addValue("IDALUMNO ", idalumno);
		// SqlParameterSource ino = new MapSqlParameterSource().addValue("IDCONVOCATORIA", idconvocatoria);
		
		return simpleJdbcCall.execute(idalumno,idconvocatoria);
>>>>>>> da20c00b0404e5b27ad9a31740e8019fbb39df3b
	}

	
	
}
