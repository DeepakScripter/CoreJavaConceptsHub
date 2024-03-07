class MyRunnable implements Runnable {
    private volatile boolean suspended = false;

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Check if the thread is suspended
            synchronized (this) {
                while (suspended) {
                    try {
                        // If suspended, wait until resumed
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Method to suspend the thread
    public synchronized void suspendThread() {
        suspended = true;
    }

    // Method to resume the thread
    public synchronized void resumeThread() {
        suspended = false;
        notify();
    }
}

public class SuspendResume {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable, "MyThread");

        myThread.start();

        try {
            // Let the thread run for a while
            Thread.sleep(2000);

            // Suspend the thread for a while
            myRunnable.suspendThread();
            System.out.println("Thread suspended for 2 seconds...");

            Thread.sleep(2000);

            // Resume the thread
            myRunnable.resumeThread();
            System.out.println("Thread resumed...");

            // Let the thread complete its execution
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread has completed.");
    }
}
