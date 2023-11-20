package org.humber.dsa.week10;


import java.util.Arrays;
import java.util.List;

class BinaryTree {
    private final Node root;

    public BinaryTree(Integer rootElement) {
        root = new Node(rootElement);
    }

    public boolean insertNode(Integer value) {
        if(value == null) {
            return false;
        }
        return insertNode(root, value);
    }

    public boolean searchNode(Integer value) {
        if(value == null) {
            return false;
        }
        return searchNode(root, value);
    }

    private boolean searchNode(Node root, Integer value) {
        if(value == root.value) {
            return true;
        }
        if(value < root.value) {
            if(root.isLeftNull()) {
                return false;
            }
            return searchNode(root.left, value);
        }
        if(value > root.value) {
            if(root.isRightNull()) {
                return false;
            }
            return searchNode(root.right, value);
        }
        return true;
    }


    private boolean insertNode(Node root, Integer value) {
        if(value < root.value) {
            if(root.isLeftNull()) {
                root.left = new Node(value);
                return true;
            }
            return insertNode(root.left, value);
        }
        if(value > root.value) {
            if(root.isRightNull()) {
                root.right = new Node(value);
                return true;
            }
            return insertNode(root.right, value);
        }
        return false;
    }

    public void inOrderTraversal() {
        System.out.print("In order traversal= ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(" " + root.value);
        inOrder(root.right);
    }

    public void preOrderTraversal() {
        System.out.print("Pre order traversal= ");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(" " + root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrderTraversal() {
        System.out.print("Post order traversal= ");
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node root) {
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" " + root.value);
    }



    private static class Node {
        Node left;
        Integer value;
        Node right;

        public Node(Integer value) {
            this.value = value;
        }

        public boolean isLeftNull() {
            return left == null;
        }

        public boolean isRightNull() {
            return right == null;
        }

        public boolean isLeaf() {
            return isLeftNull() && isRightNull();
        }
    }
}


public class BinaryTreeSolution {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7,9,6,2,3,5);

        BinaryTree binaryTree = new BinaryTree(5);

        for(Integer each : numbers) {
            System.out.println("Added " + each + " to BinaryTree = " + binaryTree.insertNode(each));
        }

        binaryTree.inOrderTraversal();
        binaryTree.preOrderTraversal();
        binaryTree.postOrderTraversal();

        System.out.println("Searching 100 = "  + binaryTree.searchNode(100));
        System.out.println("Searching 5 = "  + binaryTree.searchNode(5));
    }
}
