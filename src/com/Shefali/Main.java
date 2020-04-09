package com.Shefali;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //insert(2);
        /*Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(5);
        root.leftChild.leftChild = new Node(3);
        root.leftChild.rightChild = new Node(4);
        root.rightChild.leftChild = new Node(6);
        root.rightChild.rightChild = new Node(7);
        root.rightChild.leftChild.leftChild = new Node(8);*/
        TreeExcercise tree = new TreeExcercise();
        tree.insert(10);
        tree.insert(12);
        tree.insert(11);
        ArrayList<Integer> list = new ArrayList<>();
        // tree.getAncestors(root, 8, list);
       // System.out.println(list);
    }
}

