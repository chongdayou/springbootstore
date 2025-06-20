package com.terryspringlearn.store;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentServiceInterface {
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount=" + amount);
    }
}
