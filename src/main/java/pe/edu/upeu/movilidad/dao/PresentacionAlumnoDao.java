package pe.edu.upeu.movilidad.dao;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.*;

public interface PresentacionAlumnoDao {
	public int create(PresentacionAlumno presentacionAlumno);
	public Map<String, Object> read_Presentacion();
}
