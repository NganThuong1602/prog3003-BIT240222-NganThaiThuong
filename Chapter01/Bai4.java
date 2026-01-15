package Chapter01;

import java.util.ArrayList;

public class Bai4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.add(1, "Mango");

        int idxBanana = fruits.indexOf("Banana");
        if (idxBanana != -1) {
            fruits.set(idxBanana, "Grapes");
        }

        boolean hasApple = fruits.contains("Apple");
        System.out.println("Danh sach: " + fruits);
        System.out.println("Co 'Apple' khong? " + hasApple);
    }
}