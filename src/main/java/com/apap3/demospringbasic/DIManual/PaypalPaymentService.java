package com.apap3.demospringbasic.DIManual;

public class PaypalPaymentService implements PaymentService {
    public void processPayment(Order order) {
        // Proses pembayaran menggunakan Paypal
        System.out.println("pembayaran paypal dilakukan...");
    }
}
