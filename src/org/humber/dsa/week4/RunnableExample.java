package org.humber.dsa.week4;

class CustomRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("CustomRunnable Thread is running");
    }
}

public class RunnableExample {

    public static void main(String[] args) {
        Runnable customRunnable = new CustomRunnable();
        Thread thread = new Thread(customRunnable);
        thread.start();
    }
}
