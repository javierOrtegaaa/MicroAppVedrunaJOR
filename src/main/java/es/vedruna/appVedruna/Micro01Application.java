package es.vedruna.appVedruna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Micro01Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro01Application.class, args);
	}

}
