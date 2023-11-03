package org.humber.dsa.week8;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);

        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
            System.out.println(stack);
        }

    }


}
