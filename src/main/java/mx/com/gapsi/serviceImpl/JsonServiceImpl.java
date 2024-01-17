package mx.com.gapsi.serviceImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class JsonServiceImpl{

	public String getTextoJson() {
		StringBuilder cadena = new StringBuilder();
		
		try {
			  String rutaAbsoluta = new File("bd.json").getAbsolutePath();
		      BufferedReader lector = new BufferedReader(new FileReader(rutaAbsoluta));		      
		      String line = null;		    
		      while ((line = lector.readLine()) != null) {
		        cadena.append(line);		      
		      }
		      lector.close();		     
		    } catch (FileNotFoundException e) {		      
		      e.printStackTrace();
		    } catch (IOException e) {		      
		      e.printStackTrace();
		    }
		
		return cadena.toString();
	}
}
