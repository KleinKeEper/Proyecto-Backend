package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
