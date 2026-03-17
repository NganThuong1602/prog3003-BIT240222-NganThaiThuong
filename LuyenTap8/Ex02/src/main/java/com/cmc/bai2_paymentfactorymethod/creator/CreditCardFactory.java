package com.cmc.bai2_paymentfactorymethod.creator;

import com.cmc.bai2_paymentfactorymethod.payment.CreditCardPayment;
import com.cmc.bai2_paymentfactorymethod.payment.Payment;

public class CreditCardFactory extends PaymentFactory {

    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}