package pe.edu.upeu.movilidad.dao;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.PresentacionDocumentos;

<<<<<<< HEAD

=======
>>>>>>> da20c00b0404e5b27ad9a31740e8019fbb39df3b
public interface PresentacionDocumentosDao {
	public Map<String, Object> readAll_alumno_ganador(int id_persona);
	public Map<String, Object> readAll_presentacion_documentos();
<<<<<<< HEAD
	public Map<String, Object> readAll_documentos_director(int id_persona);
	public int update_presentacion_documentos(PresentacionDocumentos presentacionDocumentos);
=======
	
	public int create (PresentacionDocumentos pd);
	public Map<String, Object> getPostulaciones(int idalumno, int idconvocatoria);
>>>>>>> da20c00b0404e5b27ad9a31740e8019fbb39df3b

}
