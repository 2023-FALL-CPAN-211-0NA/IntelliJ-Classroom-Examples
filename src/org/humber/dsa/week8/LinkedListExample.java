package org.humber.dsa.week8;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple"); // 1
        linkedList.add("Banana"); // 2
        System.out.println(linkedList);
        System.out.println();
        linkedList.addFirst("Pineapple"); //0
        linkedList.addLast("Grapes"); // 3

        // Display the linked list
        System.out.println("Linked List: " + linkedList);
        System.out.println();

        // Access elements by index
        System.out.println("Element at index 2: " + linkedList.get(2));
        System.out.println();

        // Update an element
        linkedList.set(1, "Blueberry");
        System.out.println("Updated Linked List: " + linkedList);
        System.out.println();

        // Remove an element
        linkedList.remove(3);
        System.out.println("Updated Linked List after removing index 3: " + linkedList);
        System.out.println();

        // Check if the linked list contains a specific element
        System.out.println("Contains 'Cherry': " + linkedList.contains("Cherry"));
        System.out.println();

        // Find the index of an element
        int index = linkedList.indexOf("Banana");
        System.out.println("Index of 'Banana': " + index);
        System.out.println();

        // Get the size of the linked list
        System.out.println("Size of Linked List: " + linkedList.size());
    }
}
