package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.Convocatoria;

public interface ConvocatoriaService {
	public int create(Convocatoria c);
	public int delete(int id);
	public int update(Convocatoria c);
	public Map<String, Object> read(int id);
	Map<String, Object> readAll();

}
