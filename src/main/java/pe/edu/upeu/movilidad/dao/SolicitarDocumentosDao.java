package pe.edu.upeu.movilidad.dao;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.SolicitarDocumentos;

public interface SolicitarDocumentosDao {
	public int create( SolicitarDocumentos sd);
	
	Map<String, Object> validar( int idpresentacion);
	
	Map<String, Object> getDocumentosSolictados(int idpersona);
	public int updateFile (SolicitarDocumentos sd ); 
}
