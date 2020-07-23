package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.FacultadDao;
import pe.edu.upeu.movilidad.service.FacultadServicio;

@Service
public class FacultadServiceImp  implements FacultadServicio{

	@Autowired
	private FacultadDao facultadDao;
	
	@Override
	public Map<String, Object> getId(int id_persona) {
		// TODO Auto-generated method stub
		return facultadDao.getID(id_persona);
	}

}
