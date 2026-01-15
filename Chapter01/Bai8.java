package Chapter01;

import java.util.HashMap;

public class Bai8 {
    public static void main(String[] args) {
        HashMap<Integer, String> emp = new HashMap<>();

        emp.put(101, "Anna");
        emp.put(102, "Peter");
        emp.put(103, "Mary");

        System.out.println("Nhan vien ID 102: " + emp.get(102));
        if (!emp.containsKey(105)) {
            emp.put(105, "Unknown");
        }

        System.out.println("Danh sach nhan vien: " + emp);
    }
}