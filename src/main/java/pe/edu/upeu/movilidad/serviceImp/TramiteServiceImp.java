package pe.edu.upeu.movilidad.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.TramiteDao;
import pe.edu.upeu.movilidad.entity.Tramite;
import pe.edu.upeu.movilidad.service.TramiteService;

@Service
public class TramiteServiceImp implements TramiteService{
	@Autowired
	private TramiteDao tramiteDao;
	
	@Override
	public int create(Tramite tramite) {
		return tramiteDao.create(tramite);
	}
	
	@Override
	public Map<String, Object> readAll_Tramite() {
		return tramiteDao.readAll_Tramite();
	}
}
