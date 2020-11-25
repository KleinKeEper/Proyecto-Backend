package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pe.edu.upeu.movilidad.entity.Convocatoria;
import pe.edu.upeu.movilidad.service.ConvocatoriaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/convocatoria")
public class AperturarConvocatoria {
	@Autowired
	private ConvocatoriaService convocatoriaService;
	
	@PutMapping("/estado/{id}")
	public int update_convocatoria(@RequestBody Convocatoria convocatoria, @PathVariable int id) {
		convocatoria.setId_convocatoria(id);
		return convocatoriaService.update_convocatoria(convocatoria);
	}
	
	@GetMapping("/espera")
	public Map<String, Object> readConvocatoriaEspera() {
		return convocatoriaService.readAll_convo_espera();
	}
	@GetMapping("/aperturada")
	public Map<String, Object> readConvocatoriaAperturada() {
		return convocatoriaService.readAll_convo_aperturada();
	}
	@GetMapping("/desaperturada")
	public Map<String, Object> readConvocatoriaNoAperturada() {
		return convocatoriaService.readAll_convo_no_aperturada();
	}
	@GetMapping("/convenios")
	public Map<String, Object> readAll_convenios() {
		return convocatoriaService.readAll_convenios();
	}
	

}
