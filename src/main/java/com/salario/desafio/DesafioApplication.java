package com.salario.desafio;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	
		Integer code = sc.nextInt();


		Double basic = sc.nextDouble();
		orderService.setBasic(basic);

		Double discount = sc.nextDouble();
		orderService.setDiscount(discount);

		System.out.println("Pedido código: " + code);
		System.out.println("Valor total: R$ " + orderService.total());

		sc.close();
	}

}
