package com.apap3.demospringbasic.DIManual;

public class CreditCardPaymentService implements PaymentService {
    public void processPayment(Order order) {
        // Proses pembayaran menggunakan kartu kredit
        System.out.println("pembayaran kartu kredit dilakukan...");
    }
}
