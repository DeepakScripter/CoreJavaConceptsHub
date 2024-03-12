// Define a custom thread class that extends Thread
class MyThread extends Thread {
    // Override the run method to define the behavior of the thread
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " created");
        try {
            // Simulate some work by sleeping for 1 second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + Thread.currentThread().getId() + " starting");
        try {
            // Simulate some work by sleeping for another 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + Thread.currentThread().getId() + " terminating");
    }
}

// Main class to demonstrate thread usage
public class ThreadExamples {
    public static void main(String[] args) {
        // Create an instance of MyThread
        Thread myThread = new MyThread();

        // Print the state of the main thread
        System.out.println("Main thread state: " + myThread.getState());

        // Start the thread
        myThread.start();

        // Print the state of the main thread after starting
        System.out.println("Main thread state after starting: " + myThread.getState());

        try {
            // Join the thread to wait for it to finish execution
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the state of the main thread after joining
        System.out.println("Main thread state after joining: " + myThread.getState());
    }
}
