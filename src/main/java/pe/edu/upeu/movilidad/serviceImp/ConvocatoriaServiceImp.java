package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.ConvocatoriaDao;
import pe.edu.upeu.movilidad.entity.Convocatoria;
import pe.edu.upeu.movilidad.service.ConvocatoriaService;

@Service
public class ConvocatoriaServiceImp implements ConvocatoriaService {

	@Autowired
	private ConvocatoriaDao convocatoriaDao;
	
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return convocatoriaDao.readAll();
	}

	@Override
	public int create(Convocatoria c) {
		// TODO Auto-generated method stub
		return convocatoriaDao.create(c);
	}

}
