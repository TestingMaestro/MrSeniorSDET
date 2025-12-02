package ex_22_OOPSConcept;

public class Lab215OOps1 {
    static void main(String[] args) {

        Person p1; //nothing

        Person p2 = new Person();
        p2.name = "Yash";
        System.out.println(p2.name);

        Person p3 = new Person();
        p3.name = "Minni";
        System.out.println(p3.name);

        p2.phno = "9148359187";
        System.out.println("Phone number " + p2.phno);

        p3.phno = "8907767327";
        System.out.println("Phone number " + p3.phno);

        String name1 = p2.greetName(p2.name);
        System.out.println(name1);
        String name2 = p3.greetName(p3.name);
        System.out.println(name2);

        int mySalary = p2.remainingSalary(100000000, 20000);
        System.out.println(mySalary);


    }
}

// BluePrint - It does not take or uses any memory
class Person {
    //Data members/Attributes/Properties/instance variables
    String name;
    String phno;
    String eyestColor;
    String hariColor;
    byte age;
    double salary;
    boolean isMale;
    double weight;

    //Member Functions/Behavior/Functionality/Instance methods

    String greetName(String name) {
        return "Hello " + name;
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void talk() {
        System.out.println(greetName(name) + " is talking");
    }

    int remainingSalary(int salary, int tax) {
        return salary - tax;
    }
}
