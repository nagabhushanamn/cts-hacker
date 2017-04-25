package com.shop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.shop.bill.Billing;

@SpringBootApplication
public class ShopItWithSpringIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopItWithSpringIocApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			Billing billing = (Billing) ctx.getBean("billing");
			String[] cart = { "123123", "423123" };
			double total = billing.getTotalPrice(cart);
			System.out.println("Total: " + total);
			System.out.println("Happy shopping");
		};
	}
}
