package pe.edu.upeu.movilidad.dao;

import java.util.Map;

public interface DocumentoDao {

	Map<String, Object> radAll ();
	
	Map<String, Object> getDocumentos( int idpresentacion );
}
