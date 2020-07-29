package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.ConstanciaFinancieraDao;
import pe.edu.upeu.movilidad.entity.ConstanciaFinanciera;
import pe.edu.upeu.movilidad.service.ConstanciaFinancieraService;

@Service
public class ConstanciaFinancieraServiceImp implements ConstanciaFinancieraService {
	@Autowired
	private ConstanciaFinancieraDao constanciaDao;
	
	@Override
	public int create(ConstanciaFinanciera constancia) {
		return constanciaDao.create(constancia);
	}
	
	@Override
	public Map<String, Object> getConstanciaFinanciera() {
		return constanciaDao.getConstanciaFinanciera();
	}
	
	@Override
	public Map<String, Object> getFacultad() {
		return constanciaDao.getFacultad();
	}
	
	@Override
	public Map<String, Object> getEscuelaFacultad(int idfacultad) {
		return constanciaDao.getEscuelaFacultad(idfacultad);
	}

	@Override
	public Map<String, Object> getPlanEscuela(int idescuela) {
		return constanciaDao.getPlanEscuela(idescuela);
	}

	
	
}
