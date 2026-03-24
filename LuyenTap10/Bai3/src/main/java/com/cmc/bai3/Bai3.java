package com.cmc.bai3;

public class Bai3 {
    public static void main(String[] args) {
        WorkerThread thread1 = new WorkerThread();

        WorkerRunnable runnable = new WorkerRunnable();
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}