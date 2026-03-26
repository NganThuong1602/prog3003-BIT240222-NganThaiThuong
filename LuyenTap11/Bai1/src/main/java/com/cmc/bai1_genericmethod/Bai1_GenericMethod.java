package com.cmc.bai1_genericmethod;

public class Bai1_GenericMethod {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40};
        String[] strArray = {"Java", "Generic", "Method"};

        System.out.println("Mang Integer:");
        printArray(intArray);

        System.out.println("Mang String:");
        printArray(strArray);
    }
}
