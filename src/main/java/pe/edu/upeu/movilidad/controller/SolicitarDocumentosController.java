package pe.edu.upeu.movilidad.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.movilidad.entity.SolicitarDocumentos;
import pe.edu.upeu.movilidad.service.DocumentosService;
import pe.edu.upeu.movilidad.service.SolicitarDocumentosService;

@RestController
@RequestMapping("/solicitar")
public class SolicitarDocumentosController {

	@Autowired
	private SolicitarDocumentosService solicitarDocumentosServiceImp;
	
	@Autowired
	private DocumentosService documentosService;
	
	@PostMapping("/create")
	public int create( @RequestBody SolicitarDocumentos sd ) {
		return solicitarDocumentosServiceImp.create(sd);
	}
	
	@GetMapping("/documentos")
	public Map<String, Object> readAll() {
		return documentosService.readAll();
	}
	
	
	@GetMapping("/validar/{idpresentacion}")
	public Map<String, Object> validar(@PathVariable int idpresentacion) {
	return solicitarDocumentosServiceImp.validar(idpresentacion);	
	}
	
	
	@GetMapping("/getdocumentos/{idpersona}")
	public Map<String, Object> getDocuementosSolictado(@PathVariable int idpersona) {
		return solicitarDocumentosServiceImp.getDocumentosSolictados(idpersona);
	}
	
	@PutMapping("/update")
	public int update_files(@RequestBody SolicitarDocumentos sd) {
		return solicitarDocumentosServiceImp.updateFile(sd);
	}
	
}
