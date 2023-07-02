package com.apap3.demospringbasic.NoDI;

public class OrderService {
    private PaymentService paymentService;

    public OrderService() {
        this.paymentService = new PaymentService();
    }

    public void processOrder(Order order) {
        // Proses pesanan
        paymentService.processPayment(order);
    }
}
