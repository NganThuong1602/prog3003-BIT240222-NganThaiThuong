package com.cmc.bai2_paymentfactorymethod.payment;

public class PayPalPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan bang PayPal: " + amount);
    }
}