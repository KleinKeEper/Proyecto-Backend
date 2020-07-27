package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.DocumentoDao;
import pe.edu.upeu.movilidad.daoImp.DocumentosDaoImp;
import pe.edu.upeu.movilidad.service.DocumentosService;

@Service
public class DocumentosServiceImp implements DocumentosService {

	@Autowired
	private DocumentoDao documentosDao;
	
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return documentosDao.radAll();
	}

}
