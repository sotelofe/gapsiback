package mx.com.gapsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="mx.com.gapsi")	
public class GapsiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GapsiApplication.class, args);
	}

}
