package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.PlanesDao;
import pe.edu.upeu.movilidad.entity.Planes;
import pe.edu.upeu.movilidad.service.PlanesService;
@Service
public class PlanesServiceImp implements PlanesService{
	@Autowired
	private PlanesDao planesDao;
	
	@Override
	public int create(Planes planes) {
		return planesDao.create(planes);
	}
	
	@Override
	public Map<String, Object> getId_Docente(int idpersona) {
		return planesDao.getId_Docente(idpersona);
	}
	
	@Override
	public Map<String, Object> getId_Plan(int idplan) {
		return planesDao.getId_Plan(idplan);
	}
	@Override
	public Map<String, Object> readAll_plan_direscuela_espera(int idpersona) {
		return planesDao.readAll_plan_direscuela_espera(idpersona);
	}

	@Override
	public Map<String, Object> readAll_plan_direscuela_aprobado(int idpersona) {
		return planesDao.readAll_plan_direscuela_aprobado(idpersona);
	}

	@Override
	public Map<String, Object> readAll_plan_direscuela_eliminado(int idpersona) {
		return planesDao.readAll_plan_direscuela_eliminado(idpersona);
	}

	@Override
	public Map<String, Object> readAll_plan_direscuela_denegado(int idpersona) {
		return planesDao.readAll_plan_direscuela_denegado(idpersona);
	}
	
	@Override
	public Map<String, Object> readAll_plan_ocni_espera() {
		return planesDao.readAll_plan_ocni_espera();
	}
	
	@Override
	public Map<String, Object> readAll_plan_ocni_aprobado() {
		return planesDao.readAll_plan_ocni_aprobado();
	}
	
	@Override
	public Map<String, Object> readAll_plan_ocni_denegado() {
		return planesDao.readAll_plan_ocni_denegado();
	}
	
	@Override
	public Map<String, Object> readAll_plan_consejo_espera() {
		return planesDao.readAll_plan_consejo_espera();
	}
	@Override
	public Map<String, Object> readAll_plan_consejo_aprobado() {
		return planesDao.readAll_plan_consejo_aprobado();
	}
	
	@Override
	public Map<String, Object> readAll_plan_consejo_denegado() {
		return planesDao.readAll_plan_consejo_denegado();
	}
	
	@Override
	public int estado_decano(Planes planes) {
		return planesDao.estado_decano(planes);
	}

	@Override
	public int estado_ocni(Planes planes) {
		return planesDao.estado_ocni(planes);
	}

	@Override
	public int estado_consejo_univ(Planes planes) {
		return planesDao.estado_consejo_univ(planes);
	}

	@Override
	public int estado_general(Planes planes) {
		return planesDao.estado_general(planes);
	}

	@Override
	public int eliminar_plan(int id) {
		return planesDao.eliminar_plan(id);
	}



	

	
	
}
