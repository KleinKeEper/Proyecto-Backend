package pe.edu.upeu.movilidad;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.movilidad.dao.EscuelaDao;
import pe.edu.upeu.movilidad.dao.OpcionesDao;
import pe.edu.upeu.movilidad.dao.RolDao;
import pe.edu.upeu.movilidad.dao.UsuarioDao;
import pe.edu.upeu.movilidad.entity.Usuario;

@SpringBootTest
class MovilidadApplicationTests {

	@Autowired
	UsuarioDao usuarioDao;

	@Autowired
	EscuelaDao escuelaDao;
	
	@Autowired
	RolDao rolDao;
	
	@Autowired
	OpcionesDao opcionesDao;
	
	@Test
	void contextLoads() {
//		rolDao.readAll(1);
		
		
//		opcionesDao.read("sera");
		
//		escuelaDao.readId(1);
		Usuario user = usuarioDao.validarUsuario("arlon"); 
		System.out.println(user.getPassword());
		
//		usuarioDao.datosUsuario("arlon");
//		System.out.println(usuarioDao.datosUsuario("arlon"));
		
//		usuarioDao.datosUsuario("cecilie");
	}

}
