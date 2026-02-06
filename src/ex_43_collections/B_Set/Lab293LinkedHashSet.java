package ex_43_collections.B_Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab293LinkedHashSet {

    static void main(String[] args) {

        //Insertion order is preserved
        //No duplicates
        //uses doubly linked list
        //allows one null

        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Muskmelon");
        lhs.add("Muskmelon");
        lhs.add(null);
        lhs.add(null);
        lhs.add("");
        System.out.println(lhs);
    }
}
