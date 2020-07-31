package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.Planes;

public interface PlanesService {
	public int create(Planes planes);
	public Map<String, Object> getId_Docente(int idpersona);
	public Map<String, Object> getId_Plan(int idplan);
	public Map<String, Object> readAll_plan_direscuela_espera(int idpersona);
	public Map<String, Object> readAll_plan_direscuela_aprobado(int idpersona);
	public Map<String, Object> readAll_plan_direscuela_eliminado(int idpersona);
	public Map<String, Object> readAll_plan_direscuela_denegado(int idpersona);
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
