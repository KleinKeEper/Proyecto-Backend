package pe.edu.upeu.movilidad.service;

import java.util.Map;

public interface UniversidadConvenioService {
	public Map<String, Object> readAll();
	public Map<String, Object> readId(int id);

}
