package ex_43_collections.A_List;

import java.util.ArrayList;
import java.util.List;

public class Lab291StudentsAL {

    static void main(String[] args) {

        Student s1 = new Student("Yash", "23093");
        Student s2 = new Student("Sou", "23094");
        Student s3 = new Student("Minni", "23095");

        List myList = new ArrayList<>();
        myList.add(s1);
        myList.add(s2);
        myList.add(s3);
        System.out.println(myList);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
