package com.Shefali;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tree {
    private Node root;

    public class Node {
        public Node leftChild;
        public Node rightChild;
        public int value;

        public Node(int value) {
            this.value = value;
        }

        public String toString() {
            return "Node=" + this.value;
        }
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Node current = root;
        while (current != null) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    return;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    return;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        if (root == null) {
            throw new IllegalStateException("the tree is empty");
        }
        Node current = root;
        while (current != null) {
            if (value > current.value) {
                current = current.rightChild;
            } else if (value < current.value)
                current = current.leftChild;
            else
                return true;
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    public void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.leftChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    public void traverseInOrder(Node root) {
        if (root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    public void traversePostOrder(Node root) {
        if (root == null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height() {
        return height(root);
    }

    public int height(Node root) {
        if (root == null)
            return 0;

        if (root.leftChild == null && root.rightChild == null) {
            return 0;
        }
        int heightleft = height(root.leftChild);
        int heightright = height(root.rightChild);
        return 1 + Math.max(heightleft, heightright);
    }

    public int minBinarySearchTree() {
        return minBinarySearchTree(root);
    }

    //Binary Tree
    public int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.leftChild == null && root.rightChild == null) {
            return root.value;
        }

        int minLeft = min(root.leftChild);
        int minRight = min(root.rightChild);
        return Math.min(root.value, Math.min(minLeft, minRight));
    }

    //Binary Search Tree
    public int minBinarySearchTree(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        Node current = root;
        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current.value;
    }

    public boolean equals(Tree tree) {
        return equals(tree.root, root);
    }

    public boolean equals(Node rootOther, Node root) {

        if (rootOther == null && root == null) {
            return true;
        } else if (rootOther == null || root == null)
            return false;

        if (root.value != rootOther.value)
            return false;

        boolean equalsLeft = equals(rootOther.leftChild, root.leftChild);
        boolean equalsRight = equals(rootOther.rightChild, root.rightChild);
        return equalsLeft && equalsRight;
    }

    public boolean validateBST() {
        return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean validateBST(Node root, int minRange, int maxRange) {
        if (root == null) {
            return true;
        }

        if (root.value > minRange && root.value < maxRange) {
            return validateBST(root.leftChild, minRange, root.value)
                    && validateBST(root.rightChild, root.value, maxRange);
        }

        return false;
    }

    public void swapRoot() {
        Node temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

    public HashMap<Integer, Integer> NodeKDistance(int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        NodeKDistance(root, k, map, 0);
        return map;
    }

    public void NodeKDistance(Node root, int k, HashMap<Integer, Integer> list, Integer parent) {
        if (root == null)
            return;

        if (k != 0) {
            k--;
            NodeKDistance(root.leftChild, k, list, root.value);
            NodeKDistance(root.rightChild, k, list, root.value);
            return;
        }
        list.put(root.value, parent);
        return;
    }

    public int size() {
        return size(root);
    }

    public int size(Node root) {
        if (root == null) {
            return 0;
        }

        return size(root.leftChild) + size(root.rightChild) + 1;
    }

    public int countLeaves() {
        return countLeaves(root);
    }

    public int countLeaves(Node root) {
        if (root == null)
            return 0;

        if (root.leftChild == null && root.rightChild == null)
            return 1;

        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }

    public int max() {
        return max(root);
    }

    public int max(Node root) {
        if (root == null)
            return 0;

        if (root.rightChild == null)
            return root.value;

        return max(root.rightChild);
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    public boolean contains(Node root, int value) {
        if (root == null)
            return false;

        if (root.value == value)
            return true;

        return contains(root.leftChild, value) || contains(root.rightChild, value);
    }

    public boolean areSiblings(int value1, int value2) {
        return areSiblings(root, value1, value2);
    }

    public boolean areSiblings(Node root, int value1, int value2) {
        if (root == null)
            return false;

        for (int i = 1; i < height(); i++) {
            HashMap<Integer, Integer> map = NodeKDistance(i);
            if (map.size() > 1
                    && map.containsKey(value1)
                    && map.containsKey(value2))
                return map.get(value1) == map.get(value2);
        }
        return false;
    }

    public void PrintHorizontalTree() {
        PrintHorizontalTree(root);
    }

    public void PrintHorizontalTree(Node root) {
        if (root == null) {
            System.out.println("No nodes");
        }
        Node current = root;
        while (current != null) {
            for (int i = 0; i < height(); i++) {
                System.out.println(NodeKDistance(i));
            }
        }
    }

    public void insertBinaryTree(int value) {
        insertBinaryTree(root, value);
    }

    public void insertBinaryTree(Node root, int value) {
        if (root == null) {
            root.value = value;
            return;
        }
        if (root.leftChild == null) {
            insertBinaryTree(root.leftChild, value);
        }
        if (root.rightChild == null) {
            insertBinaryTree(root.rightChild, value);
        }
    }

}
