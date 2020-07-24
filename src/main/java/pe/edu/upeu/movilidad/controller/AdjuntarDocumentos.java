package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.movilidad.entity.PresentacionDocumentos;
import pe.edu.upeu.movilidad.service.AlumnoService;
import pe.edu.upeu.movilidad.service.ConvocatoriaService;
import pe.edu.upeu.movilidad.service.EscuelaService;
import pe.edu.upeu.movilidad.service.PresentacionDocumentosService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/adjuntar")
public class AdjuntarDocumentos {

	@Autowired
	private EscuelaService escuelaService;
	
	@Autowired
	private ConvocatoriaService convocatoriaService;
	
	@Autowired
	private AlumnoService alumnoService;
	
	@Autowired
	private PresentacionDocumentosService presentacionDocumentosService;
	
	@GetMapping("/getid/{id}")
	public Map<String, Object> getId(@PathVariable int id){
		return escuelaService.getIdEscuela(id);
	}
	
	
	@GetMapping("getconvocatoria/{idescuela}")
	public Map<String, Object> getConvocatorias( @PathVariable int idescuela) {
		return convocatoriaService.getConvocatorias(idescuela);
	}
	
	@GetMapping("getalumno/{idalumno}")
	public Map<String, Object> getAlumno( @PathVariable int idalumno) {
		return alumnoService.getAlumno(idalumno);
	}
	
	@PostMapping("/create")
	public int createpresentacion(@RequestBody PresentacionDocumentos pd) {
		return presentacionDocumentosService.create(pd);
	}
	
}
