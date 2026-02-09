package Chapter04;

import java.util.*;
import java.util.function.Function;

public class Bai4 {
    public static void main(String[] args) {
        List<String> prices = Arrays.asList("$10", "$20", "$50");
        Function<String, Integer> convert =
                s -> Integer.parseInt(s.substring(1));

        List<Integer> result = new ArrayList<>();
        for (String p : prices) {
            result.add(convert.apply(p));
        }
        System.out.println(result);
    }
}
