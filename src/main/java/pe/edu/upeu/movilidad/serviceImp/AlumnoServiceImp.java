package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.AlumnoDao;
import pe.edu.upeu.movilidad.service.AlumnoService;

@Service
public class AlumnoServiceImp implements AlumnoService {

	@Autowired
	private AlumnoDao alumnoDao;
	
	@Override
	public Map<String, Object> getAlumno(int idalumno) {
		// TODO Auto-generated method stub
		return alumnoDao.getAlumno(idalumno);
	}

}
