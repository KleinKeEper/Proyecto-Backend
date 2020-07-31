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

import pe.edu.upeu.movilidad.entity.Tramite;
import pe.edu.upeu.movilidad.service.TramiteService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/tramite")
public class TramiteController {
	@Autowired
	private TramiteService tramiteService;

	@PostMapping("/add")
	public int create(@RequestBody Tramite tramite) {
		return tramiteService.create(tramite);
	}
	
	@GetMapping("/listar")
	public Map<String, Object> readAll_Tramite(){
		return tramiteService.readAll_Tramite();
	}
	
	@DeleteMapping("/eliminar_tramite/{id}")
	public int eliminar_tramite(@PathVariable int id) {
		return tramiteService.eliminar_tramite(id);
	}
}
