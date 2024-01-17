package mx.com.gapsi.serviceImpl;

import org.springframework.stereotype.Service;

import mx.com.gapsi.dto.BienvenidaDto;
import mx.com.gapsi.dto.VersionDto;
import mx.com.gapsi.service.BienvenidaService;

@Service
public class BienvenidaServiceImpl implements BienvenidaService{

	@Override
	public BienvenidaDto obtenerUsuario() {	
		BienvenidaDto vb = new BienvenidaDto();
		vb.setUsuario("Bienvenido Candidato 01");
		return vb;
	}

	@Override
	public VersionDto obtenerVersionSistema() {
		VersionDto vs = new VersionDto();
		vs.setVersion("versión 0.0.1");
		return vs;
	}

}
