package Chapter01;

import java.util.Map;
import java.util.TreeMap;

public class Bai9 {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();

        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);

        System.out.println("Danh sach san pham (TreeMap): " + products);

        Map<String, Double> sub = products.subMap("K", "N");
        System.out.println("San pham tu K den M: " + sub);
    }
}