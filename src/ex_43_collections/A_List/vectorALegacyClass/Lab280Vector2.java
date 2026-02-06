package ex_43_collections.A_List.vectorALegacyClass;

import java.util.ListIterator;
import java.util.Vector;

public class Lab280Vector2 {

    static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.addElement("Item1");
        v.add("Item2");
        v.add("Item3");
        v.add("Item4");
        v.add("Item5");

        //ListIterator
        ListIterator<String> itr = v.listIterator();
       /* while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        // ListerIterator --> Backword traversal is possible
        /*
         * 🔍 What’s happening internally?
         *       v.listIterator() creates an iterator at index 0
         *       At index 0:
         *           hasPrevious() → ❌ false
         *       So the loop never executes
         *       👉 That’s why you see no output
         *
         * Visual Memory Trick
         * Index:   0   1   2   3   4
         * Items:  I1  I2  I3  I4  I5
         * Cursor: ^
         * */



        // Solution 1 --> first do forward traversing --> when element reaches at the last index
        //do backward traversal

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("-------------------------");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        //Solution2: always cursor starts before index 0
        //so

        System.out.println("-------------Solution 2--------------");
        ListIterator<String> itrr = v.listIterator(v.size());
        while (itrr.hasPrevious())
        {
            System.out.println(itrr.previous());
        }


    }
}
