package com.Shefali;

public class Node {
    public Node leftChild;
    public Node rightChild;
    public int value;
    public int height;
    public int balancedFactor;

    public Node(int value) {
        this.value = value;
    }

    public String toString() {
        return "Node=" + this.value;
    }
}
