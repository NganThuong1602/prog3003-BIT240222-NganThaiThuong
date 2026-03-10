package com.cmc.bai3;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static CompletableFuture<String> validateCustomer() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Da xac thuc thong tin khach hang");
            return "Khach hang hop le";
        });
    }

    public static CompletableFuture<String> issueTicket() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Da xuat ve xem phim");
            return "Ve da duoc xuat";
        });
    }

    public static void main(String[] args) {
        CompletableFuture<String> validateFuture = validateCustomer();
        CompletableFuture<String> ticketFuture = issueTicket();

        CompletableFuture<String> finalResult = validateFuture.thenCombine(ticketFuture,
                (validateResult, ticketResult) -> validateResult + " | " + ticketResult);

        System.out.println("He thong dang xu ly...");

        String result = finalResult.join();

        System.out.println("Ket qua cuoi cung:");
        System.out.println(result);
        System.out.println("Tat ca tac vu da hoan thanh");
    }
}