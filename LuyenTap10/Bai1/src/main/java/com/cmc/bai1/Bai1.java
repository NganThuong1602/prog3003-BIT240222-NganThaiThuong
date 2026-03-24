package com.cmc.bai1;

import java.util.HashMap;

public class Bai1 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

        String employeeName = employees.get(102);
        System.out.println("Nhan vien co ID 102: " + employeeName);

        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
            System.out.println("Da them nhan vien ID 105 voi ten Unknown");
        }

        System.out.println("Danh sach nhan vien:");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " - " + employees.get(id));
        }
    }
}
