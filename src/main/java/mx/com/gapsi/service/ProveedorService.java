package mx.com.gapsi.service;

import java.util.List;

import mx.com.gapsi.dto.ProveedorDto;
import mx.com.gapsi.dto.ResponseDto;

public interface ProveedorService {

	public List<ProveedorDto> consulta();
	public ResponseDto alta();
	public ResponseDto baja();
}
