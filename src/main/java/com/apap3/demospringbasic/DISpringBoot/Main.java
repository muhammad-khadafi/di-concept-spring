package com.apap3.demospringbasic.DISpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        OrderService orderService = context.getBean(OrderService.class);

        Order order = new Order();
        orderService.processOrder(order);
    }
}
