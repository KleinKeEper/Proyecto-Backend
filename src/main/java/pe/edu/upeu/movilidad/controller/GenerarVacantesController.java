package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.movilidad.service.EscuelaService;
import pe.edu.upeu.movilidad.service.UniversidadConvenioService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/vacantes")
public class GenerarVacantesController {

	@Autowired
	private EscuelaService escuelaService;
	
	@Autowired
	private UniversidadConvenioService universidadConvenioService;
	
	@GetMapping("/escuela/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		
		System.out.println(escuelaService.readId(id));
		
		return escuelaService.readId(id);
	}
	
	@GetMapping("/universidad")
	public Map<String, Object> readAll() {
		return universidadConvenioService.readAll();
	}
	
	@GetMapping("/universidad/{id}")
	public Map<String, Object> readUni(@PathVariable int id) {
		return universidadConvenioService.readId(id);
	}
	
	
}
