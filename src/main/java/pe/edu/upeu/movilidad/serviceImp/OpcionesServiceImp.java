package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.OpcionesDao;
import pe.edu.upeu.movilidad.service.OpcionesService;


@Service
public class OpcionesServiceImp implements OpcionesService {

	@Autowired
	private OpcionesDao opcionesDao;
	
	@Override
	public Map<String, Object> read(String username) {
		// TODO Auto-generated method stub
		return opcionesDao.read(username);
	}

}
