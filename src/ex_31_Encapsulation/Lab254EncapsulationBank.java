package ex_31_Encapsulation;

import ex_28_method_overriding.Laptop;

public class Lab254EncapsulationBank {
    static void main(String[] args) {

        // Encapsulation Only
        /*ICICIBank icici = new ICICIBank("yash", "QWE123", 50000, 200);

        System.out.println("Account Balance: " + icici.getBalance());
        icici.setBalance(100);
        System.out.println("New balance: " + icici.getBalance());
        icici.depositAmount(5000);
        System.out.println(icici.getBalance());*/

        // Inheritance + Encapsulation + polymorphism
        Bank b1 = new ICICIBank("yash", "QWE123", 50000, 200);
        Bank b2 = new HDFCBank("yash", "QWE2", 5000, 29);

    }
}
