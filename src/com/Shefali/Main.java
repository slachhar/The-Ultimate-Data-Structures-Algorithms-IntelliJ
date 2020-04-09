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
        Heap heap = new Heap();
        heap.insert(15);
        heap.insert(10);
        heap.insert(3);
        heap.insert(8);
        heap.insert(12);
        heap.insert(9);
        heap.insert(4);
        heap.insert(1);
        heap.insert(24);
        // tree.getAncestors(root, 8, list);
        // System.out.println(list);
    }
}

