package A0_revision.A_Collections;

import java.util.*;

public class RevLinkedHasSet {

    static void main(String[] args) {


        Set<Object> set = new LinkedHashSet<>();

        set.add("Yash");
        set.add(null);
        set.add(0);
        set.add(0.23);
        set.add(120);
        set.add('A');

        System.out.println(set);

        for (Object o : set) {

            System.out.println(o);
        }

        Iterator<Object> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }





    }
}
