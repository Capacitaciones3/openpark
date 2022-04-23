package com.evaluacion.openpark;

import com.evaluacion.openpark.model.Postulante;
import com.evaluacion.openpark.repositories.IOpenParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenparkApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenparkApplication.class, args);
	}
}
