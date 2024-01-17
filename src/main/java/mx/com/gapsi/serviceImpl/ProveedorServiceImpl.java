package mx.com.gapsi.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.gapsi.dto.ProveedorDto;
import mx.com.gapsi.dto.ResponseDto;
import mx.com.gapsi.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	private JsonServiceImpl serviceJson;
	
	@Override
	public List<ProveedorDto> consulta() {		
		List<ProveedorDto> lista = new ArrayList<>();
		try {			
			JSONObject obj = new JSONObject(serviceJson.getTextoJson());
			JSONArray arr = obj.getJSONArray("proveedores");
		    for (int i = 0; i < arr.length(); i++) {
		      String nombre = arr.getJSONObject(i).getString("nombre");
		      String razonSocial = arr.getJSONObject(i).getString("razonSocial");
		      String direccion = arr.getJSONObject(i).getString("direccion");
		      ProveedorDto pd = new ProveedorDto();
		      pd.setNombre(nombre);
		      pd.setRazonSocial(razonSocial);
		      pd.setDireccion(direccion);
		      lista.add(pd);
		    }
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		return lista;
	}

	@Override
	public ResponseDto alta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseDto baja() {
		// TODO Auto-generated method stub
		return null;
	}	
	

}
