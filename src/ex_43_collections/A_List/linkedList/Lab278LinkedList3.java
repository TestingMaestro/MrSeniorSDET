package ex_43_collections.A_List.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab278LinkedList3 {

    static void main(String[] args) {

        List myList1 = new ArrayList(); // default initial capacity 10;
        //new capacity = (initialCapacity*2/3)+1

        List myList2 = new LinkedList();

        myList2.add("Yash");
        myList2.add("Sou");
        myList2.add("Minni");
        myList2.add("Mummy");
        myList2.add("Pappa");
        myList2.add("Kushi");
        myList2.add("Kushi");
        myList2.add(null);
        myList2.add("");
        myList2.add(123);
        System.out.println(myList2);

        System.out.println(myList2.isEmpty());
        System.out.println(myList2.size());
        System.out.println(myList2.contains("Yash"));
        System.out.println(myList2.indexOf("Kushi"));
    }
}
