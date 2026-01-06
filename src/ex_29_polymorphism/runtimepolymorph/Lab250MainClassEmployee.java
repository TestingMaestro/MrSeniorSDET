package ex_29_polymorphism.runtimepolymorph;

public class Lab250MainClassEmployee
{
    static void main(String[] args) {

        Employee e1 = new ServiceEngineer();
        Employee e2 = new Developer();
        Employee e3 = new TestEngineer();

        e1.designation();

    }
}
