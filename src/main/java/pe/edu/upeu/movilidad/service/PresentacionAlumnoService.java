package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.PresentacionAlumno;

public interface PresentacionAlumnoService {
	public int create(PresentacionAlumno presentacionAlumno);
	public Map<String, Object> read_Presentacion();
	public int eliminar_presentacion(int id);


}
