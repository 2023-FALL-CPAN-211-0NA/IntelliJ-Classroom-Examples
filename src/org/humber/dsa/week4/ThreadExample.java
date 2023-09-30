package org.humber.dsa.week4;

class CustomThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadExample {

    public static void main(String[] args) {
        Thread customThread = new CustomThread();
        customThread.start();
    }
}
