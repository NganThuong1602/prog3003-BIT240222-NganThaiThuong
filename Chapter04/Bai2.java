package Chapter04;

import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        List<String> cities =
                Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");
        Collections.sort(cities, (a, b) -> a.length() - b.length());
        System.out.println(cities);
    }
}
