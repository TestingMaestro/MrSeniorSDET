package ex_22_OOPSConcept;

public class Lab216OOPs2 {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Manga";
        System.out.println(s1.name);
        s1.study();
    }
}

class Student {
    String name;
    String rollNo;

    void study() {
        System.out.println("Study u ass");
    }
}
