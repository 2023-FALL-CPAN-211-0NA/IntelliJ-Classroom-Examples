package org.humber.dsa.week4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads (e.g., 4)
        int numberOfThreads = 4;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        // Submit tasks to th e thread pool
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                try {
                    // Simulate some work
                    Thread.sleep(1000);
                    System.out.println("Task " + taskId + " completed by thread=" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shutdown the thread pool when you're done with it
        executorService.shutdown();
        executorService.close();
    }
}
