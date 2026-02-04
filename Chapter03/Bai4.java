package Chapter03;

import java.util.concurrent.*;

public class Bai4 {

    public static void main(String[] args) {

        CompletableFuture<Void> checkProduct =
                CompletableFuture.runAsync(() -> {
                    sleep(1000);
                    System.out.println("Kiem tra san pham hoan tat");
                });

        CompletableFuture<Void> payment =
                CompletableFuture.runAsync(() -> {
                    sleep(1500);
                    System.out.println("Thanh toan hoan tat");
                });

        CompletableFuture<Void> shipping =
                CompletableFuture.runAsync(() -> {
                    sleep(2000);
                    System.out.println("Van chuyen hoan tat");
                });

        CompletableFuture<Void> allTasks =
                CompletableFuture.allOf(checkProduct, payment, shipping);

        allTasks.thenRun(() ->
                System.out.println("Don hang da duoc xu ly hoan tat!")
        ).join();
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
