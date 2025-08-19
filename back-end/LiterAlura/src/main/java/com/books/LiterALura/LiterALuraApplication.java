package com.books.LiterALura;

import com.books.LiterALura.principal.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterALuraApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiterALuraApplication.class, args);
	}
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraMenu();
	}

}
