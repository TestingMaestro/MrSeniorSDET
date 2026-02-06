package ex_43_collections.A_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Lab287Interview1 {

    static void main() {

        //List within List

        List fruits = new ArrayList();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Kiwi");

        List veggies = new ArrayList();

        veggies.add("Palak");
        veggies.add("Coriander leaves");
        veggies.add("Methi lEaves");


        List allEssentials = new ArrayList();

        allEssentials.add(fruits);
        allEssentials.add(veggies);
        System.out.println(allEssentials);
        System.out.println(allEssentials.get(0));

    }
}
