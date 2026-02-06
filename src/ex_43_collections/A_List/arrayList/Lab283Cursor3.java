package ex_43_collections.A_List.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Lab283Cursor3 {
    static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = 1; i < 20; i++) {
            l1.add(i);
        }

        Iterator<Integer> itr = l1.iterator();

        // We can Only remove elements no other manipulations
        while (itr.hasNext()){
            Integer I = itr.next();
            if(I%2 == 0){
                System.out.println(I);
            }
        }
    }
}
