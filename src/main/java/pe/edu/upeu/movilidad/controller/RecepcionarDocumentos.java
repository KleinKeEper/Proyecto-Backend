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

import pe.edu.upeu.movilidad.entity.PresentacionDocumentos;
import pe.edu.upeu.movilidad.service.PresentacionDocumentosService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/documentos")
public class RecepcionarDocumentos {
	@Autowired
	private PresentacionDocumentosService presentacionDocumentosService;
	@GetMapping("/convocatoria")
	public Map<String, Object> readConvocatoriaEspera() {
		return presentacionDocumentosService.readAll_presentacion_documentos();
	}
	//este es el problema
	@GetMapping("convocatoria/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return presentacionDocumentosService.readAll_documentos_director(id);
	}
	//No cambies esto 
	@PutMapping("/estado/{id}")
	public int update_presentacion_documentos(@RequestBody PresentacionDocumentos presentacionDocumentos, @PathVariable int id) {
		presentacionDocumentos.setId_convocatoria(id);
		return presentacionDocumentosService.update_presentacion_documentos(presentacionDocumentos);
	}

}
