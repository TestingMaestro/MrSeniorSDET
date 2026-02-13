package A0_revision.A_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Rev8Queue {

    static void main(String[] args) {

        Queue linkedlist = new LinkedList();

        linkedlist.add("pushed ");
        linkedlist.add("yash");
        linkedlist.add(null);
        linkedlist.add("yash");
        linkedlist.add(123);
        System.out.println(linkedlist);

        linkedlist.poll();
        System.out.println(linkedlist);
        System.out.println(linkedlist.peek());

    }
}
