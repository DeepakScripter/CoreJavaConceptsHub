class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                // Introducing some delay to simulate different states
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadLifecycle {
    public static void main(String[] args) {
        // 1. New
        MyThread myThread = new MyThread();

        // 2. Runnable
        myThread.start();

        // 3. Blocked 

        // 4. Waiting 

        // 5. Timed Waiting 

        try {
            // Introducing some delay before termination
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 6. Terminated
        System.out.println("Main thread has completed.");
    }
}
