package pe.edu.upeu.movilidad.service;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.Tramite;

public interface TramiteService {
	public int create(Tramite tramite);
	public Map<String, Object> readAll_Tramite();
	public int eliminar_tramite(int id);

}
