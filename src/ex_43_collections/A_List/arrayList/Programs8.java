package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Programs8 {

    static void main(String[] args) {

        /*
         * Sort a List: ascending/descending
         */

        List<Integer> l1 = new ArrayList<>();
        l1.add(23);
        l1.add(2);
        l1.add(8);
        l1.add(9);
        l1.add(3);
        l1.add(26);
        l1.add(9);
        System.out.println(l1);

        for (int i = 0; i < l1.size(); i++) {
            for (int j = i + 1; j < l1.size(); j++) {
                if (l1.get(i) > l1.get(j)) {
                    int temp = l1.get(i);
                    l1.set(i, l1.get(j));
                    l1.set(j, temp);

                }
            }
        }
        System.out.println("Ascending sort: "+l1);


        System.out.println("----------------------------------------------------------");


        for (int i = 0; i < l1.size(); i++) {
            for (int j = i + 1; j < l1.size(); j++) {
                if (l1.get(i) < l1.get(j)) {
                    int temp = l1.get(i);
                    l1.set(i, l1.get(j));
                    l1.set(j, temp);

                }
            }
        }
        System.out.println("Descending sort: "+l1);

    }
}
