package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Programs1 {
    static void main(String[] args) {

        Programs1 p1 = new Programs1();
        p1.evenAndOdd();
    }

    void evenAndOdd() {
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
            Integer m = l1.get(i);
            if (m % 2 == 0) {
                continue;

            }
            System.out.println(m);
        }
    }
}