package pe.edu.upeu.movilidad.service;

import java.util.Map;

public interface DocumentosService {
	Map<String, Object> readAll();
	
	Map<String, Object> getDocumentos( int idpresentacion );
}
