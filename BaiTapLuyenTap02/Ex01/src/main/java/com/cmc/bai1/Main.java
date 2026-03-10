package com.cmc.bai1;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sach trong TreeSet:");
        System.out.println(names);

        String firstName = names.first();
        String lastName = names.last();

        System.out.println("Phan tu dau tien: " + firstName);
        System.out.println("Phan tu cuoi cung: " + lastName);
    }
}
