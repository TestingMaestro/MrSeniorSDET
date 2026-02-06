package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab273ListInterface {
    static void main(String[] args) {

//        List lk = List.of("Orange", 1, null, "banana", 20.34f, true);

        //we cannot add any objects because add method is incomplete/ which is abstract method so,
        // we need to check for any implementation class which provides implementation for these methods

        List l1 = new ArrayList();
        l1.add("yash");
        l1.add("sou");
        l1.add(12);
        l1.add(0);
        l1.add(22.33);
        l1.add(21.2f);
        l1.add(true);
        l1.add(null);
        l1.add(null);
        l1.add('A');
        l1.add("");
        System.out.println(l1);
        l1.add(new Lab273ListInterface());

        List l2 = new ArrayList();
        l2.add("orange");
        l2.add("sou");
        l2.add(12);
        l2.add(null);
        l2.add(null);
        l2.add(900.23);
        l2.add(400.56);

        System.out.println(l2);
/*
        l1.remove(null);
        System.out.println(l1);

        l1.add(1);
        System.out.println(l1);
        System.out.println("Size of List: " + l1.size());*/

//        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
//        }

        l1.add(2, "yashodhar");
        System.out.println(l1);
//        l1.add(3, l2);
//        System.out.println(l1);

//        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
//        }

//        System.out.println(l1.get(3));

//        List mainList = l1;
//        List innerList = (List) mainList.get(3);
//        for (int i = 0; i < innerList.size(); i++) {
//            System.out.println(innerList.get(i));
//        }
        l1.retainAll(l2);
        System.out.println(l1);

        Iterator listIterator = l1.listIterator();
        if(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }


    }
}
