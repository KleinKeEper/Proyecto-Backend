package pe.edu.upeu.movilidad.service;

import java.util.Map;

public interface AlumnoService {
	Map<String, Object> getAlumno(int idalumno);

	Map<String, Object> now(int idpersona);
	
	Map<String, Object> filtrar(int idalumno);
}
