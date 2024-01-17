package mx.com.gapsi.service;

import mx.com.gapsi.dto.BienvenidaDto;
import mx.com.gapsi.dto.VersionDto;

public interface BienvenidaService {

	public BienvenidaDto obtenerUsuario();
	public VersionDto obtenerVersionSistema();
}
