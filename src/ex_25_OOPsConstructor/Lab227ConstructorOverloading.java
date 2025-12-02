package ex_25_OOPsConstructor;

public class Lab227ConstructorOverloading {
    static void main(String[] args) {
        Person2 p1 = new Person2("Yash", 30);
        Person2 p2 = new Person2("Sou", 22, "JP NAGAR");
        System.out.println(p1.name);
        System.out.println(p1.age);

        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.address);


    }
}

class Person2 {
    String name;
    int age;
    String address;
    long phNo;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
