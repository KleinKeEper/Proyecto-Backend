package pe.edu.upeu.movilidad.service;

import java.util.Map;

public interface PlanesService {
	public Map<String, Object> readAll_plan_direscuela_espera();
	public Map<String, Object> readAll_plan_direscuela_aprobado();
	public Map<String, Object> readAll_plan_direscuela_eliminado();
	public Map<String, Object> readAll_plan_direscuela_denegado();
}
