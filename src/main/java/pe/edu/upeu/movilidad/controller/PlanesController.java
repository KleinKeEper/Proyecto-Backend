package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.movilidad.entity.*;
import pe.edu.upeu.movilidad.service.PlanesService;
import pe.edu.upeu.movilidad.service.PresentacionDocumentosService;
@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/planes")
public class PlanesController {
	@Autowired
	private PresentacionDocumentosService presentacionDocumentosService;
	@Autowired
	private PlanesService planesService;
	
	@PostMapping("/add")
	public int create(@RequestBody Planes planes) {
		return planesService.create(planes);
	}
	@GetMapping("/get_docente/{id}")
	public Map<String, Object> getId_Docente(@PathVariable int id){
		return planesService.getId_Docente(id);
	}
	@GetMapping("/get_plan/{id}")
	public Map<String, Object> getId_Plan(@PathVariable int id){
		return planesService.getId_Plan(id);
	}
	@GetMapping("/alumno_ganador/{id}")
	public Map<String, Object> readAll_alumno_ganador(@PathVariable int id){
		return presentacionDocumentosService.readAll_alumno_ganador(id);
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
	
	@GetMapping("/plan_ocni_espera")
	public Map<String, Object> readAll_plan_ocni_espera(){
		return planesService.readAll_plan_ocni_espera();
	}
	
	@GetMapping("/plan_ocni_aprobado")
	public Map<String, Object> readAll_plan_ocni_aprobado(){
		return planesService.readAll_plan_ocni_aprobado();
	}
	
	@GetMapping("/plan_ocni_denegado")
	public Map<String, Object> readAll_plan_ocni_denegado(){
		return planesService.readAll_plan_ocni_denegado();
	}
	
	@GetMapping("/plan_consejo_espera")
	public Map<String, Object> readAll_plan_consejo_espera(){
		return planesService.readAll_plan_consejo_espera();
	}
	@GetMapping("/plan_consejo_aprobado")
	public Map<String, Object> readAll_plan_consejo_aprobado(){
		return planesService.readAll_plan_consejo_aprobado();
	}
	
	@GetMapping("/plan_consejo_denegado")
	public Map<String, Object> readAll_plan_consejo_denegado(){
		return planesService.readAll_plan_consejo_denegado();
	}
	
	@PutMapping("/estado_decano/{id}")
	public int estado_decano(@RequestBody Planes planes, @PathVariable int id) {
		planes.setId_plan(id);
		return planesService.estado_decano(planes);
	}
	
	@PutMapping("/estado_ocni/{id}")
	public int estado_ocni(@RequestBody Planes planes, @PathVariable int id) {
		planes.setId_plan(id);
		return planesService.estado_ocni(planes);
	}
	
	@PutMapping("/estado_consejo_univ/{id}")
	public int estado_consejo_univ(@RequestBody Planes planes, @PathVariable int id) {
		planes.setId_plan(id);
		return planesService.estado_consejo_univ(planes);
	}
	@PutMapping("/estado_general/{id}")
	public int estado_general(@RequestBody Planes planes, @PathVariable int id) {
		planes.setId_plan(id);
		return planesService.estado_general(planes);
	}
	@DeleteMapping("/eliminar_plan/{id}")
	public int eliminar_plan(@PathVariable int id) {
		return planesService.eliminar_plan(id);
	}
	
}
