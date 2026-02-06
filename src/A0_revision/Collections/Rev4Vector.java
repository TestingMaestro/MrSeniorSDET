package A0_revision.Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Rev4Vector {

    static void main(String[] args) {

        /*
        * Legacy class of collection
        * jav.util package
        * it is synchronized and thread safe
        * duplicate elements are allowed
        * null is allowed
        * allows heterogeneous data
        * resizable/growable array
        * insertion order is preserved
        * frequent op us retrieval it is used
        * implements random access interface
        * implements serializable and clonable interface*/

        Vector v = new Vector();
        v.addElement("yash");
        v.add("test");
        v.addElement(2);
        v.add("Yash");
        v.add(null);
        v.add(0);
        v.add(0.23);
        v.add(120);
        v.add('A');
        v.add(new ArrayList());
        v.add("Hello World");
        v.add(100);
        v.add(45.99);
        v.add(true);

        System.out.println(v);
        System.out.println(v.capacity());

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        // We can only read the objects no manipulation
        Enumeration rn = v.elements();

        while(rn.hasMoreElements()){
            System.out.println(rn.nextElement());
        }
    }
}
