package com.apap3.demospringbasic.DISpringBoot;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {
    public void processPayment(Order order) {
        // Proses pembayaran menggunakan Paypal
        System.out.println("pembayaran paypal dilakukan...");
    }
}
