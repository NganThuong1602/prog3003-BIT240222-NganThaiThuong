package com.cmc.bai3_bankingcompletablefuture.model;

public class Customer {
    private String customerId;
    private String name;
    private boolean valid;

    public Customer(String customerId, String name, boolean valid) {
        this.customerId = customerId;
        this.name = name;
        this.valid = valid;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public boolean isValid() {
        return valid;
    }
}