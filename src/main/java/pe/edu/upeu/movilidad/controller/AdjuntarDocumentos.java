package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.movilidad.service.EscuelaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/adjuntar")
public class AdjuntarDocumentos {

	@Autowired
	private EscuelaService escuelaService;
	
	@GetMapping("/getid/{id}")
	public Map<String, Object> getId(@PathVariable int id){
		return escuelaService.getIdEscuela(id);
	}
	
	
	
}
