package A0_revision.A_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevComparable {

    static void main(String[] args) {

        Student s1 = new Student("Yash", 31);
        Student s2 = new Student("Sou", 29);

        List<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);

        Collections.sort(list);
        System.out.println(list);
    }
}

class Student implements Comparable<Student> {

    private String name;
    private Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int compareTo(Student s) {
//        return this.age - s.age;
//    }

    // Only one natural sorting order

    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
    }


}
