package pe.edu.upeu.movilidad.dao;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.Convocatoria;

public interface ConvocatoriaDao {
	public int create(Convocatoria c);
	Map<String, Object> readAll();
}
