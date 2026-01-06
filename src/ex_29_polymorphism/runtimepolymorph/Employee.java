package ex_29_polymorphism.runtimepolymorph;

public class Employee {

    void designation() {
        softwareEngineer();
        noIT();
    }

    private void noIT() {
        System.out.println("Admin");
    }

    void softwareEngineer() {
        System.out.println("Employee is a Software Engineer");
    }
}

