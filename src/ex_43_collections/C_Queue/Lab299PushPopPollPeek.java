package ex_43_collections.C_Queue;

import java.util.*;

public class Lab299PushPopPollPeek {


    static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        Vector<Integer> s1 = new Stack<>();
        List s =new LinkedList();

        q1.add(20);
        q1.add(100);
        q1.add(1);
        q1.add(2);
        q1.add(19);
        q1.add(344);
        q1.add(444);
        q1.add(12);
        q1.add(500);
        q1.offer(22);
        System.out.println(q1);
        System.out.println(q1.poll()); // comes in queue ->> poll ->> removes head element
        System.out.println(q1.peek());// comes in queue -->> returns head element

    }
}
