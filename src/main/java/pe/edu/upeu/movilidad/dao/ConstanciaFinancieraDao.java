package pe.edu.upeu.movilidad.dao;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.ConstanciaFinanciera;


public interface ConstanciaFinancieraDao {
	public int create(ConstanciaFinanciera constancia);
	public Map<String, Object> getConstanciaFinanciera();
	public Map<String, Object> getFacultad();
	public Map<String, Object> getEscuelaFacultad(int idfacultad);
	public Map<String, Object> getPlanEscuela(int idescuela);
}
