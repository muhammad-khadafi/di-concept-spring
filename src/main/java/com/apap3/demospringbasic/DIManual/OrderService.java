package com.apap3.demospringbasic.DIManual;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processOrder(Order order) {
        // Proses pesanan
        paymentService.processPayment(order);
    }
}
