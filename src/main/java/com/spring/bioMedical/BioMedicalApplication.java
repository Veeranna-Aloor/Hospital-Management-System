package com.spring.bioMedical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author Veeranna Aloor
 */
@SpringBootApplication
@EnableAsync
public class BioMedicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BioMedicalApplication.class, args);
	}

}
