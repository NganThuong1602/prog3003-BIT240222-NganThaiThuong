package Chapter03;

class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread dang chay...");
    }
}

class WorkerRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable dang chay...");
    }
}

public class Bai1 {
    public static void main(String[] args) {
        WorkerThread thread = new WorkerThread();
        Thread runnableThread = new Thread(new WorkerRunnable());

        thread.start();
        runnableThread.start();
    }
}
