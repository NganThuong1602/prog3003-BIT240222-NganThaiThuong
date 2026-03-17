package com.cmc.bai2_paymentfactorymethod.payment;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan bang Credit Card: " + amount);
    }
}