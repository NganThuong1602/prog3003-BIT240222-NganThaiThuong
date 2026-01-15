package Chapter01;

public class Bai2 {
    public static <E> void printArray(E[] arr) {
        for (E e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        String[] b = {"A", "B", "C"};

        System.out.print("Integer[]: ");
        printArray(a);

        System.out.print("String[]: ");
        printArray(b);
    }
}