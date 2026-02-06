package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Programs2 {
    static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List l2 = new ArrayList();
        l1.add(23);
        l1.add(2);
        l1.add(8);
        l1.add(9);
        l1.add(3);
        l1.add(26);
        l1.add(9);

        for (Integer num : l1) {
            if (l2.isEmpty())
            {
                l2.add("Test");
                l2.add('m');
            }
            System.out.println(num);
        }
    }
}
