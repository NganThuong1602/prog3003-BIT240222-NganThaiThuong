package com.cmc.bai2_paymentfactorymethod.creator;

import com.cmc.bai2_paymentfactorymethod.payment.Payment;

public abstract class PaymentFactory {
    public abstract Payment createPayment();
}