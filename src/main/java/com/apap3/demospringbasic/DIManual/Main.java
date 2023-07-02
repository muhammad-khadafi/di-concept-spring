package com.apap3.demospringbasic.DIManual;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new PaypalPaymentService(); // atau CreditCardPaymentService()
        OrderService orderService = new OrderService(paymentService);

        Order order = new Order();
        orderService.processOrder(order);
    }

}
