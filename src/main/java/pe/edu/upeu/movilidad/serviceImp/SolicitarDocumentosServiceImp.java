package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.SolicitarDocumentosDao;
import pe.edu.upeu.movilidad.entity.SolicitarDocumentos;
import pe.edu.upeu.movilidad.service.SolicitarDocumentosService;

@Service
public class SolicitarDocumentosServiceImp implements SolicitarDocumentosService{

	@Autowired
	private SolicitarDocumentosDao solicitarDocumentosDao;
	
	@Override
	public int create(SolicitarDocumentos sd) {
		// TODO Auto-generated method stub
		return solicitarDocumentosDao.create(sd);
	}

	@Override
	public Map<String, Object> validar(int idpresentacion) {
		// TODO Auto-generated method stub
		return solicitarDocumentosDao.validar(idpresentacion);
	}

	@Override
	public Map<String, Object> getDocumentosSolictados(int idpersona) {
		// TODO Auto-generated method stub
		return solicitarDocumentosDao.getDocumentosSolictados(idpersona);
	}

}
