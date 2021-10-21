package br.com.zup.cep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CepApp {

	public static void main(String[] args) {
		SpringApplication.run(CepApp.class, args);
	}

}
