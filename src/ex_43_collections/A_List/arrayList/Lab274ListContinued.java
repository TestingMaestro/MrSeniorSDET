package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab274ListContinued {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> l1 = new ArrayList<>();
        System.out.println("Add elements into the List");

        for (int i = 0; i < 5; i++) {
            System.out.println("Add element at "+i+" th index");
            l1.add(sc.next());

        }
        System.out.println(l1);
        System.out.println(l1.getFirst());
    }
}
