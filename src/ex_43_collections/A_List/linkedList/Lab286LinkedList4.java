package ex_43_collections.A_List.linkedList;

import java.util.LinkedList;

public class Lab286LinkedList4 {

    static void main() {

        LinkedList l1 = new LinkedList();

        l1.add("Cat");
        l1.add("Elephant");
        l1.add("Lion");
        l1.add("Deer");
        System.out.println(l1);

        l1.push("Go");
        System.out.println(l1);

        l1.pop();
        System.out.println(l1);

        l1.poll();
        System.out.println(l1);

        System.out.println(l1.peek());
    }
}
