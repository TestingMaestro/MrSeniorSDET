package ex_25_OOPsConstructor;

public class Lab221OOPsConstructor {
    static void main(String[] args) {

        Baby b = new Baby();
    }
}

class Baby {
    String name;

    Baby() {
        System.out.println("Default Constructor");

        // Fetch the data from MySql Database
        // Read the data from CSV
        // Open file and read data (json, testdata.xlsx)
    }

    void cry() {
        System.out.println("Cry");
    }

    void eat() {
        System.out.println("Eat");
    }

    void sleep() {
        System.out.println("Sleep");
    }

}
