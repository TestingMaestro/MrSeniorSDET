package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Programs5 {

    static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(23);
        l1.add(2);
        l1.add(8);
        l1.add(9);
        l1.add(3);
        l1.add(26);
        l1.add(9);
        System.out.println(l1);

        int count = 0;

        for (int i = 0; i < l1.size(); i++) {
            for (int j = i + 1; j < l1.size(); j++) {
                if (l1.get(i).equals(l1.get(j))) {
                    System.out.println("Duplicates Found " + l1.get(i));
                    count++;
                    break;

                }
            }
        }
        System.out.println("Total Duplicate elements" + count);

    }
}
