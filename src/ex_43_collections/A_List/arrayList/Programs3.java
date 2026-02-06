package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Programs3
{
    static void main(String[] args) {

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

        System.out.println(l1.contains("F"));

        l1.set(3, "Pani");
        System.out.println(l1);
        l1.clear();
        System.out.println(l1);
    }
}
