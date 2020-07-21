package pe.edu.upeu.movilidad;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.movilidad.dao.EscuelaDao;
import pe.edu.upeu.movilidad.dao.RolDao;
import pe.edu.upeu.movilidad.dao.UsuarioDao;

@SpringBootTest
class MovilidadApplicationTests {

	@Autowired
	UsuarioDao usuarioDao;

	@Autowired
	EscuelaDao escuelaDao;
	
	@Autowired
	RolDao rolDao;
	
	@Test
	void contextLoads() {
		rolDao.readAll(2);
		
//		escuelaDao.readId(1);
//		usuarioDao.validarUsuario("cecile");
//		usuarioDao.datosUsuario("cecilie");
	}

}
