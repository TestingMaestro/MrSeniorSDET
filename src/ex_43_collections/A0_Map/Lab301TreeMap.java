package ex_43_collections.A0_Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Lab301TreeMap {
    static void main(String[] args) {

        /* HashMap
         * java.util Package
         * Natural Sorting Order
         * No duplicates Keys
         * No Null Keys are allowed
         * Multiple null values are allowed
         * Not synchronized
         * * */
        Map m1 = new TreeMap();


        m1.put("id", 1);
        m1.put("Name", "Yash");
        m1.put("Age", 31);
        m1.put("Age", 31);
        m1.put("Phone No", 914835917);

    }
}
