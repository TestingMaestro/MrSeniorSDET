package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Programs10 {

    static void main(String[] args) {

        //Find longest String in a List

        List<String> l1 = new ArrayList<>();

        l1.add("Yash");
        l1.add("Pou");
        l1.add("Sou");
        l1.add("Tejaswini");
        l1.add("Aravind");
        l1.add("Prema");
        l1.add("Kushi");


        System.out.println(l1);

        String longest = l1.getFirst();

        for (String s : l1) {

            // “If I found a string longer than the current longest → update it”
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println("Longest element " + longest);


        System.out.println("-----------------------");

        String shortest = l1.getFirst();

        for (String s : l1) {

            // “If first string shorter than the found string → update it”
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        System.out.println("shortest element " + shortest);

    }
}
