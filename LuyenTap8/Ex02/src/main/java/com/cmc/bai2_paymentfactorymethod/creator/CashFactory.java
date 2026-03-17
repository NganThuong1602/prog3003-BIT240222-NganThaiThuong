package com.cmc.bai2_paymentfactorymethod.creator;

import com.cmc.bai2_paymentfactorymethod.payment.CashPayment;
import com.cmc.bai2_paymentfactorymethod.payment.Payment;

public class CashFactory extends PaymentFactory {

    @Override
    public Payment createPayment() {
        return new CashPayment();
    }
}