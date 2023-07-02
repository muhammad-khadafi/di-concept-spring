package com.apap3.demospringbasic.NoDI;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();
        OrderService orderService = new OrderService();
        orderService.processOrder(order);
    }
}
