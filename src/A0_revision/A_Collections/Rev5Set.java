package A0_revision.A_Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Rev5Set {

    static void main() {

        Set s = new HashSet();

        s.add("Yash");
        s.add("Yash");
        s.add(3);
        s.add(null);
        s.add(new Object());

        HashSet h = new HashSet();
        Set sm = Collections.synchronizedSet(h);
        System.out.println(s);

    }
}
