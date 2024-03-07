class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            // Allowing other threads of the same priority to run
            Thread.yield();
        }
    }
}

public class ThreadScheduler {
    public static void main(String[] args) {
        // Creating two threads with different priorities
        Thread thread1 = new Thread(new MyRunnable(), "Thread-1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread-2");

        // Setting different priorities for the threads
        // thread1.setPriority(Thread.MIN_PRIORITY);
        // thread2.setPriority(Thread.MAX_PRIORITY);

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
