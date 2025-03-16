package me.sanjayav.polarbookshop.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CnsiaOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnsiaOrderServiceApplication.class, args);
	}

}
