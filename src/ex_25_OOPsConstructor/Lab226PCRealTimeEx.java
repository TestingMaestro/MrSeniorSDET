package ex_25_OOPsConstructor;

public class Lab226PCRealTimeEx {
    static void main(String[] args) {
        Person p1 = new Person("Yashodhar Karki", 30, "JP Nagar", 7956575);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.address);
    }
}

class Person {

    String name;
    int age;
    String address;
    long phNo;

    Person() {

    }

    Person(String name, int age, String address, long phNo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phNo = phNo;
    }
}
