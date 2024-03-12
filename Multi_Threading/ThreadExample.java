// Define a custom thread class that extends Thread
class MyThread extends Thread {
    // Override the run method to define the behavior of the thread
    @Override
    public void run() {
        // Print a message 10 times indicating the thread ID
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello from Thread " + Thread.currentThread().getId());
        }
    }
}

// Main class to demonstrate thread usage
public class ThreadExample {
    public static void main(String[] args) {
        // Create two instances of MyThread
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
