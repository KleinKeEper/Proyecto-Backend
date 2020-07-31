package pe.edu.upeu.movilidad.service;

import java.util.Map;

public interface EscuelaService {
	public Map<String, Object> readId( int id);
	Map<String, Object> getIdEscuela( int id);
	Map<String, Object> getNameEscuela(int idpersona, int opcion);
}
