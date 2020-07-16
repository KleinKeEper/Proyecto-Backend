package pe.edu.upeu.movilidad.dao;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.Convocatoria;

public interface ConvocatoriaDao {
	public int create(Convocatoria c);
	public int update_convocatoria(Convocatoria convocatoria);
	public int delete(int id);
	public int update(Convocatoria c);
	public Map<String, Object> readId(int id);
	Map<String, Object> readAll();
}
