package ex_29_polymorphism.runtimepolymorph;

public class Developer extends Employee {

    @Override
    void softwareEngineer() {
        System.out.println("Employee is a Developer");
    }
}
