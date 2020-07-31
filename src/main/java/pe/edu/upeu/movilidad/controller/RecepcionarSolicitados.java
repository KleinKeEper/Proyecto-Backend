package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.movilidad.service.DocumentosService;
import pe.edu.upeu.movilidad.service.SolicitarDocumentosService;

@RestController
@RequestMapping("/recepcionar")
public class RecepcionarSolicitados {

	@Autowired
	private SolicitarDocumentosService solicitarDocumentosService;
	
	@Autowired
	private DocumentosService documentoService;
	
	@GetMapping("/get/{idpersona}")
	public Map<String, Object> get( @PathVariable int idpersona) {
		return solicitarDocumentosService.get(idpersona);
	}
	
	
	@GetMapping("/documento/{idpresentacion}")
	public Map<String, Object> getDocumentos (@PathVariable int idpresentacion) {
		return documentoService.getDocumentos(idpresentacion) ;
	}
	
}
