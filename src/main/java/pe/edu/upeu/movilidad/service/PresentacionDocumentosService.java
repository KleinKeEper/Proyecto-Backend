package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.PresentacionDocumentos;

public interface PresentacionDocumentosService {
	public Map<String, Object> readAll_alumno_ganador(int id_persona);
	public Map<String, Object> readAll_presentacion_documentos();
	public Map<String, Object> readAll_documentos_director(int id_persona);

	public int update_presentacion_documentos(PresentacionDocumentos presentacionDocumentos);


	public int create(PresentacionDocumentos pd);
	Map<String, Object> getPostulaciones(int idalumno, int idconvocatoria);
}
