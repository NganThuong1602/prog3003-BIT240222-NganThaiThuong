package com.cmc.bai2_paymentfactorymethod.creator;

import com.cmc.bai2_paymentfactorymethod.payment.PayPalPayment;
import com.cmc.bai2_paymentfactorymethod.payment.Payment;

public class PayPalFactory extends PaymentFactory {

    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
