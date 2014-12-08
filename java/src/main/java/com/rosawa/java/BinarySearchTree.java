package com.rosawa.java;

public class BinarySearchTree {
    private int value;
    private BinarySearchTree left = null;
    private BinarySearchTree right = null;

    public BinarySearchTree(int value) {
        this.value = value;
    }

    public void add(int value) {
        if (this.value > value) {
            if (this.left == null) {
                this.left = new BinarySearchTree(value);
            } else {
                this.left.add(value);
            }
        } else {
            if (this.right == null) {
                this.right = new BinarySearchTree(value);
            } else {
                this.right.add(value);
            }
        }
    }

    public boolean contains(int value) {
        boolean found = false;
        if (this.value == value) {
            return true;
        }

        if (this.left != null) {
            found = this.left.contains(value);
        }

        if (this.right != null) {
            found = this.right.contains(value);
        }

        return found;
    }

    public void printPreOrder() {
        System.out.printf("%d ", this.value);
        if (this.left != null) {
            this.left.printPreOrder();
        }
        if (this.right != null) {
            this.right.printPreOrder();
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(1);
        bst.add(2);
        bst.add(3);
        bst.add(10);
        bst.add(5);
        bst.add((15));

        bst.printPreOrder();
        System.out.println(bst.contains(20));
    }
}
