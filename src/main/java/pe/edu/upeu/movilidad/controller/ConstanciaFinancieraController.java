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

import pe.edu.upeu.movilidad.entity.ConstanciaFinanciera;
import pe.edu.upeu.movilidad.service.ConstanciaFinancieraService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/constancia_fin")
public class ConstanciaFinancieraController {
	@Autowired
	private ConstanciaFinancieraService constanciaService;
	
	@PostMapping("/add")
	public int create(@RequestBody ConstanciaFinanciera constancia) {
		return constanciaService.create(constancia);
	}
	
	@GetMapping("/constancia_financiera")
	public Map<String, Object> getConstanciaFinanciera(){
		return constanciaService.getConstanciaFinanciera();
	}
	
	@GetMapping("/get_facultad")
	public Map<String, Object> getFacultad(){
		return constanciaService.getFacultad();
	}
	
	@GetMapping("/get_escuela_facultad/{id}")
	public Map<String, Object> getEscuelaFacultad(@PathVariable int id){
		return constanciaService.getEscuelaFacultad(id);
	}
	
	@GetMapping("/get_plan_escuela/{id}")
	public Map<String, Object> getPlanEscuela(@PathVariable int id){
		return constanciaService.getPlanEscuela(id);
	}
	
	@DeleteMapping("/eliminar_constancia/{id}")
	public int eliminar_constancia(@PathVariable int id) {
		return constanciaService.eliminar_constancia(id);
	}
}
