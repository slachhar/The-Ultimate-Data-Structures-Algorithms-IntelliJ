package com.Shefali;

import java.util.*;
import java.util.HashMap;

public class TreeExcercise {
    Node root;

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
        root = insert(root, value);
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.value < value) {
            root.rightChild = insert(root.rightChild, value);
        } else {
            root.leftChild = insert(root.leftChild, value);
        }


        return root;
    }

}
