package com.cmc.bai2;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetoothEnabled(true)
                .build();

        Computer computer2 = new Computer.ComputerBuilder("512GB", "8GB")
                .setBluetoothEnabled(false)
                .build();

        System.out.println("May tinh 1:");
        System.out.println(computer1);

        System.out.println("May tinh 2:");
        System.out.println(computer2);
    }
}