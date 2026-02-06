package ex_43_collections.A0_Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab301LinkedHashMap {
    static void main(String[] args) {

        /* HashMap
         * java.util Package
         * Insertion order is preserved
         * No duplicates Keys
         * 1 Null key is allowed
         * Multiple null values are allowed
         * Not synchronized
         * * */
        Map m1 = new LinkedHashMap();

        m1.put("id", 1);
        m1.put("Name", "Yash");
        m1.put("Age", 31);
        m1.put("Age1", 31);
        m1.put("Age1", 33);
        m1.put(null, 323);
        m1.put(null, 233);
        m1.put("Phone No", 914835917);

        System.out.println(m1);
        Iterator itr = m1.entrySet().iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
