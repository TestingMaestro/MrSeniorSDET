package ex_43_collections.comparator;

import ex_43_collections.comparable.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab295ALObjectCompare1 {
    static void main(String[] args) {

        Employee1 e11 = new Employee1("Yash", 2899, 30);
        Employee1 e21 = new Employee1("Sou", 2879, 23);
        Employee1 e31 = new Employee1("Myunni", 26, 29);
        Employee1 e41= new Employee1("Ajay", 210, 43);


        List<Employee1> myEmployeeList = new ArrayList<>();

        myEmployeeList.add(e11);
        myEmployeeList.add(e21);
        myEmployeeList.add(e31);
        myEmployeeList.add(e41);

        Collections.sort(myEmployeeList,new NameComparator());
        System.out.println("\n" + myEmployeeList);
        Collections.sort(myEmployeeList,new AgeComparator());
        System.out.println("\n" + myEmployeeList);
        Collections.sort(myEmployeeList,new IdComparator());
        System.out.println("\n" + myEmployeeList);
    }
}
