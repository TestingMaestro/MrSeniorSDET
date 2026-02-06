package ex_43_collections.C_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Lab298LinkedListUsedAsQueue {

    static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();

        q1.add(20);
        q1.add(100);
        q1.add(1);
        q1.add(0);
        q1.offer(22);
        System.out.println(q1);
        System.out.println(q1.peek()); //examines first element
        System.out.println(q1.poll()); //removes first element
    }
}
