package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.movilidad.service.AlumnoService;
import pe.edu.upeu.movilidad.service.OpcionesService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/principal")
public class PrincipalController {
	
	@Autowired
	private OpcionesService opcionesService;
	
	@Autowired
	private AlumnoService alumnoService;
	
	
	@GetMapping("/opciones/{username}")
	public Map<String, Object> read( @PathVariable String username) {
		return opcionesService.read(username);
	}
	
	@GetMapping("/now/{idpersona}")
	public Map<String, Object> now (@PathVariable int idpersona){
		System.out.println("idpersona controller" + idpersona);
		return alumnoService.now(idpersona);
	}
	
	@GetMapping("/filtrar/{idalumno}")
	public Map<String, Object> filtar( @PathVariable int idalumno ) {
		return alumnoService.filtrar(idalumno);
	}

}
