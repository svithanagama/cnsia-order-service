package me.sanjayav.polarbookshop.orderservice;

import org.springframework.boot.SpringApplication;

public class TestCnsiaOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(CnsiaOrderServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
