package A0_revision.A_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RevComparator {

    static void main(String[] args) {

        Employee s1 = new Employee("Yash", 31);
        Employee s2 = new Employee("Sou", 29);
        Employee s3 = new Employee("Minni", 27);
        Employee s4 = new Employee("Kushi", 2);

        List<Employee> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Collections.sort(list, new AgeComparator());
        Collections.sort(list, new NameComparator());

        System.out.println(list);
    }
}

class Employee {

    private String empName;
    private Integer age;

    public Employee(String empName, Integer age) {
        this.empName = empName;
        this.age = age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                '}';
    }
}

class NameComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getEmpName().compareTo(e2.getEmpName());
    }
}

class AgeComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getAge() - e2.getAge();
    }
}