package pe.edu.upeu.movilidad.dao;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.PresentacionDocumentos;

public interface PresentacionDocumentosDao {
	public Map<String, Object> readAll_alumno_ganador();
	public Map<String, Object> readAll_presentacion_documentos();
	
	public int create (PresentacionDocumentos pd);

}
