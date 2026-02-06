package ex_43_collections.A_List.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Lab277LinkedList2 {
    static void main(String[] args) {

        List<String> l1 = new LinkedList<>();

        l1.add("Cat");
        l1.add("Elephant");
        l1.add("Lion");
        l1.add("Deer");
        l1.add("Cow");
        l1.addFirst("Kangaroo");
        l1.addLast("Raccoon");

        System.out.println("Linked List: " + l1);
        System.out.println("First Object: " + l1.getFirst());
        System.out.println("Last Object: " + l1.getLast());


    }
}
