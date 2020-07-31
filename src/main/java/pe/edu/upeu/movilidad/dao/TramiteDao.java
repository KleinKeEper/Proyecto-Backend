package pe.edu.upeu.movilidad.dao;

import java.util.Map;

import pe.edu.upeu.movilidad.entity.*;

public interface TramiteDao {
	public int create(Tramite tramite);
	public Map<String, Object> readAll_Tramite();

}
