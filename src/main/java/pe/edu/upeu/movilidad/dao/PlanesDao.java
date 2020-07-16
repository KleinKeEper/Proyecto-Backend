package pe.edu.upeu.movilidad.dao;

import java.util.Map;

public interface PlanesDao {
	public Map<String, Object> readAll_plan_direscuela_espera();
	public Map<String, Object> readAll_plan_direscuela_aprobado();
	public Map<String, Object> readAll_plan_direscuela_eliminado();
	public Map<String, Object> readAll_plan_direscuela_denegado();
}
