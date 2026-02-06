package ex_43_collections.A0_Map;

import java.util.*;

public class Lab303RealTimeExample {

    static void main(String[] args) {

        Map<String, Object> student1 = new HashMap<>();
        Map<String, Object> student2 = new HashMap<>();

        student1.put("name", "Yash");
        student1.put("ph no", "9898754664");
        student1.put("Address1", "Netherlands");
        student1.put("Address2", "USA");

        student2.put("name", "Sou");
        student2.put("ph no", "9698754664");
        student2.put("Address1", "Netherlands");
        student2.put("Address2", "USA");

        List l = new ArrayList();
        Set s = new HashSet();

        l.add(student1);
        l.add(student2);
        System.out.println(l);

        s.add(student1);
        s.add(student2);
        System.out.println(s);

    }
}
