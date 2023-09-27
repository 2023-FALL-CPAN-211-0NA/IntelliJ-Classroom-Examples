package org.humber.dsa.week4;


class NamedThread extends Thread {
    private final String name;

    public NamedThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is running.");
        try {
            Thread.sleep(2000); // Simulate some work for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " is done.");
    }
}

public class JoinExample {
    public static void main(String[] args) {

        NamedThread thread1 = new NamedThread("Thread 1");
        NamedThread thread2 = new NamedThread("Thread 2");

        thread1.start();
        thread2.start();

        try {
            System.out.println("Main thread is waiting for Thread 1 to finish.");
            thread1.join(); // Main thread waits for Thread 1 to finish
            System.out.println("Main thread is waiting for Thread 2 to finish.");
            thread2.join(); // Main thread waits for Thread 2 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread is done.");
    }
}
