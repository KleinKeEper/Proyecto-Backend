package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.Convocatoria;

public interface ConvocatoriaService {
	public int create(Convocatoria c);
	public int update_convocatoria(Convocatoria convocatoria);
	public int delete(int id);
	public int update(Convocatoria c);
	public Map<String, Object> read(int id);
	Map<String, Object> readAll();
	public Map<String, Object> readAll_convo_espera();
	public Map<String, Object> readAll_convo_aperturada();
	public Map<String, Object> readAll_convo_no_aperturada();


}
