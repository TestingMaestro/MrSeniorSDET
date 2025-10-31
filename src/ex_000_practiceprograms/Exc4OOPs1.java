package ex_000_practiceprograms;

public class Exc4OOPs1 {
    static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Loudi";
        p2.name = "Sanat Mohapatra";
        p1.age = 30;
        p1.gender = "Male";
        p1.salary = 2000000;
        p1.place = "Kundapura";
        p1.eyesColor = "Black";

        p1.personName(p1.name);
        p2.personName(p2.name);

        String person1Name = p1.personName(p1.name);
        System.out.println(person1Name);

        String person2Name = p2.personName(p2.name);
        System.out.println(person2Name);

        double personSalary = p1.personSalary(p1.salary, 30000, 3000);
        System.out.println(personSalary);

        p1.sleep();

        p1.eat();

    }
}

class Person {
    String name;
    byte age;
    String gender;
    boolean isMale;
    int salary;
    String place;
    String eyesColor;

    String personName(String name) {
        return "Hello " + name;
    }

    int personSalary(int salary, int emiExpenses, int tax) {
        return salary - emiExpenses - tax;
    }

    void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

}
