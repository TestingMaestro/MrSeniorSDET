package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Lab281TraversalUsingCursor {

    static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>();

        l1.add("Yash");
        l1.add("Xpulse 210");
        l1.add("Harley 48");
        l1.add("G wagon");

        // Using Iterator

        Iterator<String> itr = l1.iterator();

        while (itr.hasNext()) {
            String s1 = itr.next();
            if (s1.equalsIgnoreCase("xpulse 210")) {
                itr.remove();
            }
        }
        System.out.println(l1);
    }
}
