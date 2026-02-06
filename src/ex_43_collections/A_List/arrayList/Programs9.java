package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Programs9 {

    static void main(String[] args) {

        // Count frequency of each String in a List

        List<String> l1 = new ArrayList<>();

        l1.add("Yash");
        l1.add("Sou");
        l1.add("Tejaswini");
        l1.add("Aravind");
        l1.add("Prema");
        l1.add("Kushi");

        System.out.println(l1);

        for (int i = 0; i < l1.size(); i++) {
            System.out.println("Count of: " + l1.get(i)+" "+ l1.get(i).length());
        }
    }
}
