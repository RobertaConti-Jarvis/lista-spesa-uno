package it.iad.listaspesaunoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"it.iad.listaspesaunoserver"})
@EnableJpaRepositories(basePackages= {"it.iad.listaspesaunoserver"})
@EntityScan(basePackages= {"it.iad.listaspesaunoserver"})
public class ListaSpesaUnoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaSpesaUnoServerApplication.class, args);
	}

}
