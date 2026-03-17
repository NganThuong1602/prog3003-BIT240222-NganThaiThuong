package com.cmc.bai3_bankingcompletablefuture;

import com.cmc.bai3_bankingcompletablefuture.model.Account;
import com.cmc.bai3_bankingcompletablefuture.model.Customer;
import com.cmc.bai3_bankingcompletablefuture.service.BankingService;

public class Main {

    public static void main(String[] args) {
        BankingService bankingService = new BankingService();

        Customer customer1 = new Customer("C001", "Nguyen Van A", true);
        Account fromAccount1 = new Account("ACC001", 5000);
        Account toAccount1 = new Account("ACC002", 2000);

        System.out.println("===== GIAO DICH 1 =====");
        String result1 = bankingService
                .processTransaction(customer1, fromAccount1, toAccount1, 3000)
                .join();
        System.out.println(result1);

        System.out.println();

        Customer customer2 = new Customer("C002", "Tran Thi B", false);
        Account fromAccount2 = new Account("ACC003", 7000);
        Account toAccount2 = new Account("ACC004", 1000);

        System.out.println("===== GIAO DICH 2 =====");
        String result2 = bankingService
                .processTransaction(customer2, fromAccount2, toAccount2, 2000)
                .join();
        System.out.println(result2);

        System.out.println();

        Customer customer3 = new Customer("C003", "Le Van C", true);
        Account fromAccount3 = new Account("ACC005", 1000);
        Account toAccount3 = new Account("ACC006", 500);

        System.out.println("===== GIAO DICH 3 =====");
        String result3 = bankingService
                .processTransaction(customer3, fromAccount3, toAccount3, 3000)
                .join();
        System.out.println(result3);
    }
}