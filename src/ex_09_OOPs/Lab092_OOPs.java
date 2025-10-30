package ex_09_OOPs;

public class Lab092_OOPs {
    static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Yash";
        System.out.println(p1.name);
        p1.age = 30;
        p1.eyesColor = "Blue";
        p1.place = "Kundapura";
        p1.salary = 78000000;
        String myName = p1.greetPerson("Yashodhar");
        System.out.println(myName);
        int mySalary = p1.remainingAmount(98898093, 70000);
        System.out.println("Remaining Salary " + mySalary);
        p1.sleepP();
    }
}

class Person {
    // Attributes/variables/data members/state
    String name;
    String gender;
    byte age;
    boolean isMale;
    String eyesColor;
    String place;
    double salary;


    void sleepP() {

        System.out.println(this.name + " is sleeping");
    }

    String greetPerson(String name) {
        return "Hello " + name;

    }

    int remainingAmount(int salary, int tax) {
        return salary - tax;
    }

}

