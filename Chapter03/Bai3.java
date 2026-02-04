package Chapter03;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class Bai3 {
    public static void main(String[] args) {
        CompletableFuture<Void> future =
                CompletableFuture
                        .supplyAsync(() -> {
                            return new int[]{1, 2, 5, 3, 100};
                        })
                        .thenApply(arr ->
                                Arrays.stream(arr)
                                        .filter(n -> n % 2 != 0)
                                        .sorted()
                                        .boxed()
                                        .collect(Collectors.toList())
                        )
                        .thenApply(list -> "Ket qua la: " + list)
                        .thenAccept(System.out::println);

        future.join();
    }
}
