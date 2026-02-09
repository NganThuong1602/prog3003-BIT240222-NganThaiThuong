package Chapter04;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Bai5 {
    public static void main(String[] args) {
        Supplier<Double> randomNumber =
                () -> Math.random() * 100;
        Consumer<Double> print =
                n -> System.out.println("So may man: " + n);
        Double value = randomNumber.get();
        print.accept(value);
    }
}
