package com.cmc.bai2_paymentfactorymethod;

import com.cmc.bai2_paymentfactorymethod.creator.CashFactory;
import com.cmc.bai2_paymentfactorymethod.creator.CreditCardFactory;
import com.cmc.bai2_paymentfactorymethod.creator.PayPalFactory;
import com.cmc.bai2_paymentfactorymethod.creator.PaymentFactory;
import com.cmc.bai2_paymentfactorymethod.payment.Payment;

public class Main {

    public static void main(String[] args) {
        PaymentFactory creditFactory = new CreditCardFactory();
        PaymentFactory payPalFactory = new PayPalFactory();
        PaymentFactory cashFactory = new CashFactory();

        Payment payment1 = creditFactory.createPayment();
        Payment payment2 = payPalFactory.createPayment();
        Payment payment3 = cashFactory.createPayment();

        payment1.pay(1500000);
        payment2.pay(250000);
        payment3.pay(90000);
    }
}
