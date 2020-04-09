package com.Shefali;

import java.util.*;
import java.util.HashMap;

public class TreeExcercise {
    Node node;

    public static void PrintHorizontalTreeTraversal(Node root, java.util.HashMap<Integer, List<Integer>> listHashMap, int level) {
        if (root == null) {
            return;
        }

        if (listHashMap.containsKey(level)) {
            listHashMap.get(level).add(root.value);
        } else {
            listHashMap.put(level, new ArrayList<>(Collections.singletonList(root.value)));
        }

        PrintHorizontalTreeTraversal(root.leftChild, listHashMap, level + 1);
        PrintHorizontalTreeTraversal(root.rightChild, listHashMap, level + 1);
    }

    public static void PrintVerticalTreeTraversal(Node root, HashMap<Integer, List<Integer>> listHashMap, int index) {
        if (root == null) {
            return;
        }

        if (listHashMap.containsKey(index)) {
            listHashMap.get(index).add(root.value);
        } else {
            listHashMap.put(index, new ArrayList<>(Collections.singletonList(root.value)));
        }

        PrintVerticalTreeTraversal(root.leftChild, listHashMap, index - 1);
        PrintVerticalTreeTraversal(root.rightChild, listHashMap, index + 1);
    }

    public boolean getAncestors(Node root, int value, ArrayList<Integer> list) {
        if (root == null) {
            return true;
        }
        if (root.value == value) {
            return false;
        }

        list.add(root.value);

        if (getAncestors(root.leftChild, value, list)) {
            if (getAncestors(root.rightChild, value, list)) {
                list.remove(Integer.valueOf(root.value));
                return true;
            }
        }

        return false;
    }

    public void insert(int value) {
        node = insert(node, value, -1, -1);
    }

    public Node insert(Node root, int value, int left, int right) {
        if (root == null) {
            return new Node(value);
        }

        if (root.value < value) {
            root.rightChild = insert(root.rightChild, value, right, left);
            right = root.rightChild.height;
        } else {
            root.leftChild = insert(root.leftChild, value, right, left);
            left = root.leftChild.height;
        }
        root.height = Math.max(left, right) + 1;
        //balance factor = height(L) - height(R)
        // > 1 => left heavy
        // <-1 => right heavy
        root.balancedFactor = left - right;
        root = balanced(root);

        return root;
    }

    public Node balanced(Node node) {
        if (node.balancedFactor > 1) {
            // left heavy
            if (node.leftChild.balancedFactor > 0) {
                node = rightRotate(node);
            } else if (node.leftChild.balancedFactor < 0) {
                node.leftChild = leftRotate(node.leftChild);
                node = rightRotate(node);
            }
        } else if (node.balancedFactor < -1) {
            //right heavy
            if (node.rightChild.balancedFactor > 0) {
                node.rightChild = rightRotate(node.rightChild);
                node = leftRotate(node);
            } else if (node.rightChild.balancedFactor < 0) {
                node = leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node node) {
        Node newRoot = node.leftChild;
        node.leftChild = newRoot.rightChild;
        newRoot.rightChild = node;
        return newRoot;
    }

    public Node leftRotate(Node node) {
        Node newRoot = node.rightChild;
        node.rightChild = newRoot.leftChild;
        newRoot.leftChild = node;
        return newRoot;
    }

    public int height(Node root) {
        if (root == null)
            return -1;

        int left = height(root.leftChild);
        int right = height(root.rightChild);

        return Math.max(left, right) + 1;
    }

}
