package it.iad.listaSpesaUnoServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"it.iad.listaSpesaUnoServer"})
@EnableJpaRepositories(basePackages= {"it.iad.listaSpesaUnoServer"})
@EntityScan(basePackages= {"it.iad.listaSpesaUnoServer"})
public class ListaSpesaUnoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaSpesaUnoServerApplication.class, args);
	}

}
