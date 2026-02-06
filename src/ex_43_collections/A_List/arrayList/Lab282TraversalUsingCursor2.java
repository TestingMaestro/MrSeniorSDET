package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Lab282TraversalUsingCursor2 {

    static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>();

        l1.add("Yash");
        l1.add("Xpulse 210");
        l1.add("Harley 48");
        l1.add("G wagon");

        ListIterator<String> itr = l1.listIterator();

        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("Yash")) {
                itr.remove();
            } else if (s.equalsIgnoreCase("harley 48")) {
                itr.set("Harley Davidson 48");
            } else if (s.equalsIgnoreCase("g wagon")) {
                itr.add("JP nagar Mansion -> Dollar's Colony");
                itr.nextIndex();
            }
        }
        System.out.println(l1);
    }
}
