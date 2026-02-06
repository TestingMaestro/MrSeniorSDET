package ex_43_collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab295ALObjectCompare {
    static void main(String[] args) {

        Employee e1 = new Employee("Yash", 2899, 30);
        Employee e2 = new Employee("Sou", 2879, 23);
        Employee e3 = new Employee("Myunni", 26, 29);
        Employee e4 = new Employee("Ajay", 210, 43);


        List<Employee> myEmployeeList = new ArrayList<>();

        myEmployeeList.add(e1);
        myEmployeeList.add(e2);
        myEmployeeList.add(e3);
        myEmployeeList.add(e4);

        Collections.sort(myEmployeeList);
        System.out.println("\n" + myEmployeeList);
    }
}
