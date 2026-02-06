package ex_43_collections.B_Set;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Lab294TreeSet {

    static void main(String[] args) {

        //Natural sorting order -  ASCII values
        //no duplicates
        //no null values
        //uses red and black tree mechanism to store elements
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Watermelon");
        ts.add("Muskmelon");
        ts.add("Muskmelon");
//        ts.add(123); //java.lang.ClassCastException -> Strings cannot be compared with numbers
//        ts.add(null); // java.lang.NullPointerException -> cannot compare any values with null

        System.out.println(ts);

        Set<String> s = Collections.synchronizedSet(ts); // synchronized version of Tree set






    }
}
