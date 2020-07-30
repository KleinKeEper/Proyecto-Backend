package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.*;
import pe.edu.upeu.movilidad.entity.PresentacionAlumno;
import pe.edu.upeu.movilidad.service.PresentacionAlumnoService;
@Service
public class PresentacionAlumnoServiceImp implements PresentacionAlumnoService{
	@Autowired
	private PresentacionAlumnoDao presentacionAlumnoDao;
	
	@Override
	public int create(PresentacionAlumno presentacionAlumno) {
		return presentacionAlumnoDao.create(presentacionAlumno);
	}

	@Override
	public Map<String, Object> read_Presentacion() {
		return presentacionAlumnoDao.read_Presentacion();
	}

}
