package org.humber.dsa.week4;

class SharedResource {
    private boolean signalSentFlag = false;

    public synchronized void waitForSignal() {
        while (!signalSentFlag) {
            try {
                wait(); // Wait until a signal is received
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Signal received.");
    }

    public synchronized void sendSignal() {
        signalSentFlag = true;
        notify(); // Notify waiting threads that the signal is received
        System.out.println("Signal sent.");
    }
}

public class WaitNotifyExample {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread waitingThread = new Thread(() -> {
            System.out.println("Waiting thread is waiting for a signal.");
            sharedResource.waitForSignal();
            System.out.println("Waiting thread has resumed.");
        });
/*
        Thread waitingThread2 = new Thread(() -> {
            System.out.println("Waiting thread2 is waiting for a signal.");
            sharedResource.waitForSignal();
            System.out.println("Waiting thread2 has resumed.");
        });
*/

        Thread signalingThread = new Thread(() -> {
            System.out.println("Signaling thread is sending a signal.");
            sharedResource.sendSignal();
            System.out.println("Signaling thread has finished.");
        });

        waitingThread.start();
//        waitingThread2.start();
        signalingThread.start();
    }
}
