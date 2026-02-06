package ex_43_collections.B_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab292HashSet {

    static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        hs.add("Yash");
        hs.add("Sou");
        hs.add("Minni");
        hs.add("apple");
        hs.add("apple");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        for (String s : hs) {
            System.out.println(s);
        }

        System.out.println("---------------");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
