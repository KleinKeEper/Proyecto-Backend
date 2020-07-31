package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.movilidad.dao.PresentacionDocumentosDao;
import pe.edu.upeu.movilidad.entity.PresentacionDocumentos;
import pe.edu.upeu.movilidad.service.PresentacionDocumentosService;

@Service
public class PresentacionDocumentosServiceImp implements PresentacionDocumentosService {
	@Autowired
	private PresentacionDocumentosDao presentacionDocumentosDao;

	@Override
	public Map<String, Object> readAll_alumno_ganador(int id_persona) {
		return presentacionDocumentosDao.readAll_alumno_ganador(id_persona);
	}

	@Override
	public Map<String, Object> readAll_presentacion_documentos() {
		return presentacionDocumentosDao.readAll_presentacion_documentos();
	}
	
	@Override
	public int create(PresentacionDocumentos pd) {
		// TODO Auto-generated method stub
		return presentacionDocumentosDao.create(pd);
	}

<<<<<<< HEAD
	@Override
	public int update_presentacion_documentos(PresentacionDocumentos presentacionDocumentos) {
		return presentacionDocumentosDao.update_presentacion_documentos(presentacionDocumentos) ;
	}

	@Override
	public Map<String, Object> readAll_documentos_director(int id_persona) {
		// TODO Auto-generated method stub
		return presentacionDocumentosDao.readAll_documentos_director(id_persona);
	}

=======

	@Override
	public Map<String, Object> getPostulaciones(int idalumno, int idconvocatoria) {
		// TODO Auto-generated method stub
		return presentacionDocumentosDao.getPostulaciones(idalumno, idconvocatoria);
	}
>>>>>>> da20c00b0404e5b27ad9a31740e8019fbb39df3b
}
