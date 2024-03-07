import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}

class MyCallable implements Callable<String> {
    public String call() {
        return "Thread using Callable and Future";
    }
}

public class Multithreading {
    public static void main(String[] args) throws Exception {
        // 1. Extending the Thread Class
        MyThread thread1 = new MyThread();
        thread1.start();

        // 2. Implementing the Runnable Interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        // 3. Anonymous Inner Class
        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread using anonymous inner class");
            }
        });
        thread3.start();

        // 4. Lambda Expression
        Thread thread4 = new Thread(() -> System.out.println("Thread using lambda expression"));
        thread4.start();

        // 5. Executor Framework
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new MyRunnable());
        executorService.shutdown();

        // 6. Callable and Future
        ExecutorService callableExecutor = Executors.newSingleThreadExecutor();
        Future<String> future = callableExecutor.submit(new MyCallable());
        String result = future.get();
        System.out.println(result);
        callableExecutor.shutdown();
    }
}
