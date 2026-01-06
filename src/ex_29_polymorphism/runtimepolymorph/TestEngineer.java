package ex_29_polymorphism.runtimepolymorph;

public class TestEngineer extends Employee
{
    @Override
    void softwareEngineer() {
        System.out.println("Employee is a Test Engineer");
    }
}
