package com.Shefali;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.removeAt(1);
        System.out.println(numbers.indexOf(10));
        numbers.print();*/
/*
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        //System.out.println(linkedList.size());
        //linkedList.addLast(20);
        //linkedList.addLast(30);
       // linkedList.addLast(40);
        linkedList.addLast(50);
        //System.out.println(linkedList.size());
       // System.out.println(linkedList.indexOf(30));
        //System.out.println(linkedList.indexOf(40));
        //linkedList.deleteLast();
       // System.out.println(linkedList.contains(20));
        //linkedList.deleteFirst();
      //  System.out.println(linkedList.size());
        int[] intArray = linkedList.toArray();
        System.out.println(Arrays.toString(intArray));
        //linkedList.reverse();
        //System.out.println(Arrays.toString(linkedList.toArray()));
       // System.out.println(linkedList.getKthFromTheEnd(1));
        System.out.println(linkedList.printMidldle());
        //linkedList.createWithLoop();
        System.out.println(linkedList.hasLoop());*/

        //StringReverser reverser = new StringReverser();
        //System.out.println(reverser.reverse(null));
        //BalancedExpressions be = new BalancedExpressions();
        //System.out.println(be.balancedExpression("890>[<(4){7}()]"));

       /* Stack stack = new Stack();
        stack.push1(10);
        stack.push1(20);
        stack.push1(30);
        stack.push1(40);
        //stack.push2(10);
        //stack.push2(20);
       // stack.push2(30);
        //stack.push2(40);
        //stack.push2(40);
        //stack.push2(40);
        stack.pop2();
        stack.pop();
        stack.pop();
        //stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());*/

        // Let us create 3 stacks in an array of size 10
        int k = 3, n = 10;

        KStack.KStacks ks = new KStack.KStacks(k, n);

        ks.push(15, 2);
        ks.push(45, 2);

        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }
}
