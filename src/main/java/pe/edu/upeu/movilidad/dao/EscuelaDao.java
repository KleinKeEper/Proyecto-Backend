package pe.edu.upeu.movilidad.dao;

import java.util.Map;

public interface EscuelaDao {
	Map<String, Object> readId(int id);
	Map<String, Object> getIdEscuela( int id);
	
	Map<String, Object> getNameEscuela(int idpersona, int opcion);
	
	
}
