package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.PlanesDao;
import pe.edu.upeu.movilidad.service.PlanesService;
@Service
public class PlanesServiceImp implements PlanesService{
	@Autowired
	private PlanesDao planesDao;

	@Override
	public Map<String, Object> readAll_plan_direscuela_espera() {
		return planesDao.readAll_plan_direscuela_espera();
	}

	@Override
	public Map<String, Object> readAll_plan_direscuela_aprobado() {
		return planesDao.readAll_plan_direscuela_aprobado();
	}

	@Override
	public Map<String, Object> readAll_plan_direscuela_eliminado() {
		return planesDao.readAll_plan_direscuela_eliminado();
	}

	@Override
	public Map<String, Object> readAll_plan_direscuela_denegado() {
		return planesDao.readAll_plan_direscuela_denegado();
	}
}
