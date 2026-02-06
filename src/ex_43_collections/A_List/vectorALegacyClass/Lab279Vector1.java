package ex_43_collections.A_List.vectorALegacyClass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab279Vector1 {

    static void main(String[] args) {

        Vector vector1 = new Vector();

        vector1.add("Yash");
        vector1.add("Sou");
        vector1.add("12");
        vector1.add(23);
        System.out.println(vector1.size());

        //Access objects one by one or all

        //Legacy for loop

        System.out.println("------Legacy for loop------");
        for (int i = 0; i < vector1.size(); i++) {
            System.out.println(vector1.get(i));
        }

        //enhanced for
        System.out.println("------enhanced for------");
        for (Object o : vector1) {
            System.out.println(o);
        }

        //Iterator -> Cursor
        System.out.println("------Iterator------");

        Iterator itr = vector1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //ListIterator -> Cursor
        System.out.println("------ListIterator------");
        ListIterator litr = vector1.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        //Enumeration ->
        System.out.println("------Enumeration------");
        Enumeration<Object> enumeration = vector1.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("------ListIterator-> Backword traversal------");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
