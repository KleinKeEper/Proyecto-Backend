package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.ConstanciaFinanciera;

public interface ConstanciaFinancieraService {
	public int create(ConstanciaFinanciera constancia);
	public Map<String, Object> getConstanciaFinanciera();
	public Map<String, Object> getFacultad();
	public Map<String, Object> getEscuelaFacultad(int idfacultad);
	public Map<String, Object> getPlanEscuela(int idescuela);
	public int eliminar_constancia(int id);

}
