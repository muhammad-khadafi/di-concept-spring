package com.apap3.demospringbasic.DISpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        OrderService orderService = context.getBean("orderService", OrderService.class);

        Order order = new Order();
        orderService.processOrder(order);
    }
}
