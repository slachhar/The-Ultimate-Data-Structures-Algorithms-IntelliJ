package com.Shefali;

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
        System.out.println(linkedList.hasLoop());
    }
}
