package ex_43_collections.comparator;

import java.util.Comparator;

public class Employee1 {

    private String name;
    private int id;
    private int age;

    Employee1(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

class NameComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class AgeComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.getAge() - e2.getAge();
    }
}

class IdComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.getId() - e2.getId();
    }
}
