package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.UniversidadConvenioDao;
import pe.edu.upeu.movilidad.service.UniversidadConvenioService;

@Service
public class UniversidadConvenioServiceImp implements UniversidadConvenioService {

	@Autowired
	private UniversidadConvenioDao universidadConvenioDao;
	
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return universidadConvenioDao.readAll();
	}

	@Override
	public Map<String, Object> readId(int id) {
		// TODO Auto-generated method stub
		return universidadConvenioDao.readId(id);
	}

}
