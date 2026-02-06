package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Programs7 {

    static void main(String[] args) {


        // Reverse a List (without using Collections.reverse)

        List<Integer> l1 = new ArrayList<>();
        l1.add(23);
        l1.add(2);
        l1.add(8);
        l1.add(9);
        l1.add(3);
        l1.add(26);
        l1.add(9);
        System.out.println(l1);



        for (int i = l1.size() - 1; i >= 0; i--) {
            System.out.println(l1.get(i));
        }
    }
}
