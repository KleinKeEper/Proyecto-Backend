package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.movilidad.entity.PresentacionAlumno;
import pe.edu.upeu.movilidad.service.*;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/presentacion_alumno")
public class PresentacionAlumnoController {
	@Autowired
	private PresentacionAlumnoService presentacionAlumnoService;
	
	@PostMapping("/add")
	public int create(@RequestBody PresentacionAlumno presentacionAlumno) {
		return presentacionAlumnoService.create(presentacionAlumno);
	}
	
	@GetMapping("/listar")
	public Map<String, Object> read_Presentacion(){
		return presentacionAlumnoService.read_Presentacion();
	}
	
	@DeleteMapping("/eliminar_presentacion/{id}")
	public int eliminar_presentacion(@PathVariable int id) {
		return presentacionAlumnoService.eliminar_presentacion(id);
	}
}
