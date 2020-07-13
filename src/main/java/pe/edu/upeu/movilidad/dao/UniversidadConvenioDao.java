package pe.edu.upeu.movilidad.dao;

import java.util.Map;

public interface UniversidadConvenioDao {

	public Map<String, Object> readAll();
	public Map<String, Object> readId(int id);
}
