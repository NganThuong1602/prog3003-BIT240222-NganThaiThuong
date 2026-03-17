package com.cmc.bai3_bankingcompletablefuture.service;

import com.cmc.bai3_bankingcompletablefuture.model.Account;
import com.cmc.bai3_bankingcompletablefuture.model.Customer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class BankingService {

    public CompletableFuture<Customer> validateCustomer(Customer customer) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(1000);
            System.out.println("Dang xac thuc khach hang...");

            if (customer == null || !customer.isValid()) {
                throw new RuntimeException("Xac thuc that bai: khach hang khong hop le.");
            }

            System.out.println("Xac thuc khach hang thanh cong.");
            return customer;
        });
    }

    public CompletableFuture<Account> checkBalance(Account fromAccount, double amount) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(1500);
            System.out.println("Dang kiem tra so du tai khoan...");

            if (fromAccount == null) {
                throw new RuntimeException("Tai khoan nguon khong ton tai.");
            }

            if (fromAccount.getBalance() < amount) {
                throw new RuntimeException("So du khong du de thuc hien giao dich.");
            }

            System.out.println("Kiem tra so du thanh cong.");
            return fromAccount;
        });
    }

    public CompletableFuture<String> transferMoney(Account fromAccount, Account toAccount, double amount) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(2000);
            System.out.println("Dang thuc hien chuyen tien...");

            fromAccount.withdraw(amount);
            toAccount.deposit(amount);

            return "Chuyen tien thanh cong. So tien: " + amount
                    + " | So du con lai: " + fromAccount.getBalance();
        });
    }

    public CompletableFuture<String> processTransaction(Customer customer,
                                                        Account fromAccount,
                                                        Account toAccount,
                                                        double amount) {
        return validateCustomer(customer)
                .thenCompose(validCustomer -> checkBalance(fromAccount, amount))
                .thenCompose(validAccount -> transferMoney(fromAccount, toAccount, amount))
                .handle((result, ex) -> {
                    if (ex != null) {
                        return "Giao dich that bai: " + ex.getMessage();
                    }
                    return result;
                });
    }

    private void simulateDelay(int milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Tac vu bi gian doan.");
        }
    }
}
