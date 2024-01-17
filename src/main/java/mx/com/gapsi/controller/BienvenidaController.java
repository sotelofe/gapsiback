package mx.com.gapsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.gapsi.dto.BienvenidaDto;
import mx.com.gapsi.dto.VersionDto;
import mx.com.gapsi.service.BienvenidaService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.PUT })
@RestController
@RequestMapping("/bienvenida")
public class BienvenidaController {

	@Autowired
	private BienvenidaService serviceBienvenida;

	@GetMapping(value = "/obtenerUsuario", produces = MediaType.APPLICATION_JSON_VALUE)
	public BienvenidaDto obtenerUsuario() {		
		return serviceBienvenida.obtenerUsuario();
	}
	
	@GetMapping(value = "/obtenerVersionSistema", produces = MediaType.APPLICATION_JSON_VALUE)
	public VersionDto obtenerVersionSistema() {		
		return serviceBienvenida.obtenerVersionSistema();
	}
}
