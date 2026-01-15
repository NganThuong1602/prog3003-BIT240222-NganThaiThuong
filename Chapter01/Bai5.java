package Chapter01;

import java.util.LinkedList;

public class Bai5 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.addFirst(5);
        queue.addLast(40);

        queue.removeFirst();
        queue.removeLast();

        System.out.println("Danh sach con lai: " + queue);
    }
}