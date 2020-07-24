package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.Planes;

public interface PlanesService {
	public int create(Planes planes);
	public Map<String, Object> readAll_plan_direscuela_espera();
	public Map<String, Object> readAll_plan_direscuela_aprobado();
	public Map<String, Object> readAll_plan_direscuela_eliminado();
	public Map<String, Object> readAll_plan_direscuela_denegado();
	public Map<String, Object> readAll_plan_ocni_espera();
	public Map<String, Object> readAll_plan_ocni_aprobado();
	public Map<String, Object> readAll_plan_ocni_denegado();
	public Map<String, Object> readAll_plan_consejo_espera();
	public Map<String, Object> readAll_plan_consejo_aprobado();
	public Map<String, Object> readAll_plan_consejo_denegado();
	public int estado_decano(Planes planes);
	public int estado_ocni(Planes planes);
	public int estado_consejo_univ(Planes planes);
	public int estado_general(Planes planes);
	public int eliminar_plan(int id);
}
