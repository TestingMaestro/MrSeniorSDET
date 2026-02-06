package ex_43_collections.A_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab289Interview2 {
    static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        marks.add(89);
        marks.add(67);
        marks.add(8);
        marks.add(23);
        marks.add(100);

        Collections.sort(marks);
        System.out.println(marks);
        marks.sort(Collections.reverseOrder());
        System.out.println(marks);
    }
}
