package com.Shefali;

import java.util.Queue;

public class Queues {
    public Queue<Integer> reverse(Queue<Integer> queue) {
        //add
        //remove
        //isEmpty
        Stack stack = new Stack();
        for (int item : queue) {
            stack.push(item);
        }

        StringBuffer sb = new StringBuffer();
        Queue<Integer> reverseQueue ;
        while (!stack.isEmpty()){
           // reverseQueue.add(stack.pop());
        }
        return queue;
    }
}
