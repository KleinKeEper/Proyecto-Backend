package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.Convocatoria;

public interface ConvocatoriaService {
	public int create(Convocatoria c);
	Map<String, Object> readAll();

}
