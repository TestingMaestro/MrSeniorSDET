package A0_revision.A_Collections;

import java.util.*;

public class Rev2ArrrayList {

    static void main(String[] args) {

        Rev2ArrrayList arrrev = new Rev2ArrrayList();
        arrrev.myArrayList();

    }

    void myArrayList() {

        List<Object> l = new ArrayList<>();
        l.add("Yash");
        l.add(null);
        l.add(0);
        l.add(0.23);
        l.add(120);
        l.add('A');
        l.add(new ArrayList());
        l.add("Hello World");             // 1. String
        l.add(100);                       // 2. Integer
        l.add(45.99);                     // 3. Double
        l.add(true);                      // 4. Boolean
        l.add('A');                       // 5. Character
        l.add(500L);                      // 6. Long
        l.add(3.14f);                     // 7. Float
        l.add((short) 10);                // 8. Short
        l.add((byte) 1);                  // 9. Byte
        l.add(new Date());                // 10. Date Object
        l.add(new StringBuilder("Hi"));   // 11. StringBuilder
        l.add(null);                      // 12. Null value
        l.add(new ArrayList<String>());   // 13. Another List (Nested)
        l.add(Math.PI);                   // 14. Static Constant
        l.add(System.currentTimeMillis());// 15. Current Time (Long)
        l.add(new Object());              // 16. Plain Object
        l.add("");                        // 17. Empty String
        l.add(-999);                      // 18. Negative Integer
        l.add(false);                     // 19. Second Boolean
        l.add("Element 20");
        System.out.println(l);
        System.out.println();

        l.remove(null);

        System.out.println(l.contains(null));

        l.addFirst("re");
        l.addLast("re");
        l.removeFirst();
        l.removeLast();

//        l.clear();
        System.out.println(l);
        ArrayList ll = new ArrayList();

        List m1 = Collections.synchronizedList(ll);

        //traditional for

        System.out.println("------------Traditional for------------");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println(l);
        System.out.println("------------Enhanced for------------");
        for (Object o : l) {
            System.out.println(o);
        }
        System.out.println(l);

        System.out.println("------------iterator------------");
//        Iterator<Object> itr = l.iterator();
//
//        while (itr.hasNext()) {
//            Object s = itr.next();
//            String s1 = (String) s;
//            if (s1.equals("Hello World")) {
//                itr.remove();
//            }
//        }
//        System.out.println(l);


        List<String> arrayList = new ArrayList<>();
        arrayList.add("Yash");
        arrayList.add("Sou");
        arrayList.add("Myunni");
        arrayList.add("Kushi");
        arrayList.add("Muummy");
        arrayList.add("Pappa");

        Iterator<String> itr1 = arrayList.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println(arrayList);


        System.out.println("------------listiterator------------");

        ListIterator<String> itr = arrayList.listIterator();
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equalsIgnoreCase("Myunni")) {
                itr.add("Meow Myunni");
            } else if (s.equalsIgnoreCase("pappa")) {
                itr.set("World's best pappa");
            }

        }
        System.out.println(arrayList);

    }
}
