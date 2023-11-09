package org.humber.dsa.week9;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        System.out.println(queue);
        System.out.println();

        queue.offer(2);
        System.out.println(queue);
        System.out.println();

        System.out.println("Peek: " + queue.peek());
        System.out.println();


        System.out.println("Element: " + queue.element());
        System.out.println();

        System.out.println("After remove: " + queue.remove());
        System.out.println(queue);
        System.out.println();

        System.out.println("After poll: " + queue.poll());
        System.out.println(queue);
        System.out.println();

        System.out.println("Peek: " + queue.peek());
        System.out.println();

        System.out.println("Element: " + queue.element());
        System.out.println();
    }

}
