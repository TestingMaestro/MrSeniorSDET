package A0_revision.A_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Rev3LinkedList {

    static void main(String[] args) {

        List l = new LinkedList();


        // Implements Queue and Deque , Stack as well
        l.add("Yash");
        l.add(null);
        l.add(0);
        l.add(0.23);
        l.add(120);
        l.add('A');
        l.add(new ArrayList<>());
        l.add("Hello World");
        l.add(100);
        l.add(45.99);
        l.add(true);
        System.out.println(l);

//        System.out.println(l.get(5));


//        for (Object m : l){
//            System.out.println(m);
//        }
        ListIterator itr = l.listIterator(l.size());
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }


    }
}
