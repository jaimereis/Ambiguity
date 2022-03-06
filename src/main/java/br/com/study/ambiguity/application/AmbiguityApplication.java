package br.com.study.ambiguity.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.study.ambiguity")
@EntityScan(basePackages = "br.com.study.ambiguity")
public class AmbiguityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmbiguityApplication.class, args);
	}

}
