package ex_43_collections.A_List.vectorALegacyClass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab284UsingEnumerations {

    static void main(String[] args) {

        // Legacy Cursor
        // Applies for only Vector and Legacy Classes

        Vector<String> v = new Vector<>();

        v.addElement("Item1");
        v.add("Item2");
        v.add("Item3");
        v.add("Item4");
        v.add("Item5");

        // Enumeration Cursor
        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        Iterator itr = e.asIterator();
        while (itr.hasNext()) {
            System.out.println(itr);
        }
    }
}
