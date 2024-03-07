class MyThread extends Thread {
    public void run() {
        // Sleep Method
        try {
            System.out.println("Thread is sleeping for 2 seconds.");
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Join Method
        Thread otherThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("OtherThread - Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        otherThread.start();

        try {
            otherThread.join(); // Wait for otherThread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Yield Method
        System.out.println("Yielding to other threads.");
        Thread.yield();

        // Interrupt Method
        Thread interruptThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("InterruptThread - Still running...");
            }
            System.out.println("InterruptThread - Interrupted.");
        });
        interruptThread.start();
        interruptThread.interrupt(); // Interrupt the thread

        // SetPriority Method
        Thread highPriorityThread = new Thread(() -> {
            System.out.println("HighPriorityThread - Running with high priority.");
        });
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        highPriorityThread.start();

        // Stop Method (deprecated)
        // This method is deprecated and not recommended for use
        // It forcefully stops the thread's execution
        // stop();

        // getPriority Method
        int mainThreadPriority = getPriority();
        System.out.println("Main thread priority: " + mainThreadPriority);

        // isAlive Method
        System.out.println("Main thread is waiting for other threads to complete.");
        System.out.println("Is OtherThread alive? " + otherThread.isAlive());
        System.out.println("Is HighPriorityThread alive? " + highPriorityThread.isAlive());
    }
}

public class MultithreadingMethod {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
