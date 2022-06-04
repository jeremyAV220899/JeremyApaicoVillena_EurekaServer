package com.idat.EurekaServerLavadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerLavadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerLavadoraApplication.class, args);
	}

}
