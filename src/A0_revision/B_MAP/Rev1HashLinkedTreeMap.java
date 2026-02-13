package A0_revision.B_MAP;

import java.util.*;

public class Rev1HashLinkedTreeMap {
    static void main(String[] args) {

        Map<String, Object> map1 = new HashMap<>();
        Map<String, Object> map2 = new LinkedHashMap<>();
        Map<String, Object> map3 = new TreeMap<>();

        map1.put("ID", 12);
        map1.put("Name", "Yashodhar Karki");
        map1.put("Age", 31);
        map1.put("RollNo", 2341);
        map1.put("Phone No", 917746373);
        map1.put(null, 23);
        map1.put(null, 2);
        map1.put("Phone No1", 917746373);

        System.out.println(map1.entrySet());

        //Iterate Over map

        Set<Map.Entry<String, Object>> itr = map1.entrySet();

        for (Map.Entry<String, Object> item : itr) {
            System.out.println(item.getKey() + " = " + item.getValue());
        }

        System.out.println("\n----------------LinkedHashMap----------------");
        map2.put("ID", 12);
        map2.put("Name", "Yashodhar Karki");
        map2.put("Age", 31);
        map2.put("RollNo", 2341);
        map2.put("Phone No", 917746373);
        map2.put(null, 23);
        map2.put(null, 2);
        map2.put("Phone No1", 917746373);
        System.out.println(map2);

        // iterate:

        Set<Map.Entry<String, Object>> itr1 = map2.entrySet();
        for (Map.Entry<String, Object> item : itr1) {
            System.out.println(item.getKey() + " = " + item.getValue());
        }

        System.out.println("\n----------------TreeMap----------------");
        map3.put("ID", 12);
        map3.put("Name", "Yashodhar Karki");
        map3.put("Age", 31);
        map3.put("RollNo", 2341);
        map3.put("Phone No", 917746373);
        map3.put("Phone No1", 917746373);
        System.out.println(map3);

        // iterate:
        Set<Map.Entry<String, Object>> itr2 = map2.entrySet();
        for (Map.Entry<String, Object> item : itr2) {
            System.out.println(item.getKey() + " = " + item.getValue());
        }


        System.out.println("\n----------------HashTable----------------");
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        hashtable.put("ID", 12);
        hashtable.put("Name", "Yashodhar Karki");
        System.out.println(hashtable);

        Set<Map.Entry<Object, Object>> itr3= hashtable.entrySet();
        for (Map.Entry<Object, Object> item : itr3) {
            System.out.println(item.getKey() + " = " + item.getValue());
        }

    }
}
