package ex_43_collections.C_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab297PriorityQueue {

    static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>();

        q.add("Yash");
        q.add("Minni");
        q.add("Kushi");
        System.out.println(q);
        System.out.println(q.poll()); // removes head element
        System.out.println(q.peek()); // examines and give tail ele
    }
}
