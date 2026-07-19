package com.salario.desafio;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.salario.desafio.entities.Order;
import com.salario.desafio.services.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Order order = new Order();

		Integer code = sc.nextInt();

		Double basic = sc.nextDouble();
		order.setBasic(basic);

		Double discount = sc.nextDouble();
		order.setDiscount(discount);

		System.out.println("Pedido código: " + code);
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));

		sc.close();
	}

}
