package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.SolicitarDocumentos;

public interface SolicitarDocumentosService {
	public int create( SolicitarDocumentos sd);
	Map<String, Object> validar(int idpresentacion);
	Map<String, Object> getDocumentosSolictados(int idpersona);
	public int updateFile(SolicitarDocumentos sd);
	
	Map<String, Object> get(int idpersona);
}

