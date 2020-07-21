package pe.edu.upeu.movilidad.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import pe.edu.upeu.movilidad.dao.RolDao;
import pe.edu.upeu.movilidad.service.RolService;

@Service
public class RolServiceImp implements RolService{

	@Autowired
	private RolDao rolDao;
	
	@Override
	public List<GrantedAuthority> readAll(int id_usuario) {
		// TODO Auto-generated method stub
		return rolDao.readAll(id_usuario);
	}
	

}
