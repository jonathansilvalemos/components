package com.desafio1.componentes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio1.componentes.entities.Order;
import com.desafio1.componentes.services.OrderService;

@SpringBootApplication
public class ComponentesApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;

	
	public static void main(String[] args) {
						
		SpringApplication.run(ComponentesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.0);
		System.out.println("Código do pedido: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));
		
		order = new Order(2282, 800.00, 10.0);
		System.out.println("Código do pedido: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));
		
		order = new Order(1309, 95.90, 0.0);
		System.out.println("Código do pedido: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));
		
	}

}
