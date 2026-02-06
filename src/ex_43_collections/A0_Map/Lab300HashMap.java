package ex_43_collections.A0_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab300HashMap {

    static void main(String[] args) {

        /* HashMap
         * java.util Package
         * Order is not guaranteed [Random Order]
         * No duplicates Keys
         * 1 Null key is allowed
         * Multiple null values are allowed
         * Not synchronized
         * * */
        Map<String, Integer> m1 = new HashMap();

        m1.put("id", 1);
        m1.put("id2", 2);
        m1.put("Age", 31);
        m1.put("Phone No", 914835917);

        for (Map.Entry<String, Integer> item : m1.entrySet()) {

            System.out.println(item.getKey() + " -> " + item.getValue());
        }


        System.out.println(m1.entrySet());

        System.out.println(m1.get("id"));
        System.out.println(m1.containsKey("id"));
        System.out.println(m1.containsValue("Yash"));

        System.out.println(m1.keySet());

        System.out.println(m1.values());


//        Iterator itr = m1.entrySet().iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//
//        for (int i = 0; i < m1.size(); i++) {
//            System.out.println(m1.entrySet());
//        }
    }
}
