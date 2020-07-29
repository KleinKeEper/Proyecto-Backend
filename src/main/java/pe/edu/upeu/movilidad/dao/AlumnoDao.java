package pe.edu.upeu.movilidad.dao;

import java.util.Map;

public interface AlumnoDao {
	Map<String, Object> getAlumno( int idalumno);
	
	Map<String, Object> now(int idpersona);
	
	Map<String, Object> filtrar(int idalumno);
}
