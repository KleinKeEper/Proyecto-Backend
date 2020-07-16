package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pe.edu.upeu.movilidad.entity.Convocatoria;
import pe.edu.upeu.movilidad.service.ConvocatoriaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/vacantes")
public class AperturarConvocatoria {
	@Autowired
	private ConvocatoriaService convocatoriaService;
	
	@PutMapping("/estado/")
	public int update_convocatoria(@RequestBody Convocatoria convocatoria) {
		return convocatoriaService.update_convocatoria(convocatoria);
	}
	
	

}
