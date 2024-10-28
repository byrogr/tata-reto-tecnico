package com.rrojase.tataretotecnico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableFeignClients
@SpringBootApplication(scanBasePackages = "com.rrojase")
@EntityScan(basePackages = {"com.rrojase.tataretotecnico.infrastructure.persistence.shared.entities"})
@EnableJpaRepositories(basePackages = {"com.rrojase.tataretotecnico.infrastructure.persistence.shared.repository"})
public class TataRetoTecnicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TataRetoTecnicoApplication.class, args);
	}

}
