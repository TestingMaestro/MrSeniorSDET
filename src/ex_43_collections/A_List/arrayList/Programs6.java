package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Programs6 {
    static void main(String[] args) {

        //Find largest and smallest number in a List
        List<Integer> l1 = new ArrayList<>();
        l1.add(23);
        l1.add(2);
        l1.add(8);
        l1.add(9);
        l1.add(3);
        l1.add(26);
        l1.add(30);
        l1.add(9);
        System.out.println(l1);
        int max = 0;
        for (int i = 0; i < l1.size(); i++) {

            if(l1.get(i) > max)
            {
                max = l1.get(i);
            }
        }
        System.out.println(max);
    }
}
