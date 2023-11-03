package org.humber.dsa.week8.linkedlist;

import java.util.Objects;

class Node<E> {

    E data;

    Node<E> next;

    public Node(E data) {
        this.data = data;
    }
}


public class SingleLinkedListExample {

    public static void main(String[] args) {
        Node<Integer> head;
        Node<Integer> node1 = createNode(1);
        head = node1;

        Node<Integer> node2 = createNode(2);
        node1.next = node2;

        Node<Integer> node3 = createNode(3);
        node2.next = node3;

        printLinkedList(head);

        addNode(head, 4);
        addNode(head, 5);

        printLinkedList(head);

        head = removeNode(head, 1);
        head = removeNode(head, 3);

        printLinkedList(head);

    }

    private static Node<Integer> removeNode(Node<Integer> head, Integer value) {
        Node<Integer> temp = head;
        if (Objects.equals(head.data, value)) {
            head = head.next;
            return head;
        }
        while (temp.next != null) {
            if (Objects.equals(temp.next.data, value)) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static void addNode(Node<Integer> head, Integer value) {
        Node<Integer> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = createNode(value);
    }

    private static void printLinkedList(Node<Integer> head) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        System.out.println("Elements of Single Linked List: ");
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node<Integer> createNode(Integer value) {
        return new Node<>(value);
    }
}
