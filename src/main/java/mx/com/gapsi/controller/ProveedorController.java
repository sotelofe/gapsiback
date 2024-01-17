package mx.com.gapsi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.gapsi.dto.ProveedorDto;
import mx.com.gapsi.dto.ResponseDto;
import mx.com.gapsi.service.ProveedorService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.PUT })
@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

	@Autowired
	private ProveedorService serviceProveedor;

	@GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProveedorDto> consulta() {		
		return serviceProveedor.consulta();
	}
	
	@GetMapping(value = "/alta", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseDto alta() {		
		return serviceProveedor.alta();
	}
	
	@GetMapping(value = "/baja", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseDto baja() {		
		return serviceProveedor.baja();
	}
}
