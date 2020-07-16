package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.movilidad.service.PlanesService;
import pe.edu.upeu.movilidad.service.PresentacionDocumentosService;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/planes")
public class PlanesController {
	@Autowired
	private PresentacionDocumentosService presentacionDocumentosService;
	@Autowired
	private PlanesService planesService;
	
	@GetMapping("/alumno_ganador")
	public Map<String, Object> readAll_alumno_ganador(){
		return presentacionDocumentosService.readAll_alumno_ganador();
	}
	
	@GetMapping("/plan_direscuela_espera")
	public Map<String, Object> readAll_plan_direscuela_espera(){
		return planesService.readAll_plan_direscuela_espera();
	}
	
	@GetMapping("/plan_direscuela_aprobado")
	public Map<String, Object> readAll_plan_direscuela_aprobado(){
		return planesService.readAll_plan_direscuela_aprobado();
	}
	
	@GetMapping("/plan_direscuela_eliminado")
	public Map<String, Object> readAll_plan_direscuela_eliminado(){
		return planesService.readAll_plan_direscuela_eliminado();
	}
	
	@GetMapping("/plan_direscuela_denegado")
	public Map<String, Object> readAll_plan_direscuela_denegado(){
		return planesService.readAll_plan_direscuela_denegado();
	}
}
