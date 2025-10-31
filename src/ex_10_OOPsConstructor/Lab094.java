package ex_10_OOPsConstructor;

class Baby {
    String name;

    Baby() {
        System.out.println("I'm called when object is created, They call me *Default Constructor*");
        // Fetch the mySQL Database
        // Read from CSV file, xlsx
        // Open file and read the data (json, testdata.xslx, txt file)
    }

    void eat() {
        System.out.println("Eat!!");
    }

    void cry() {
        System.out.println("Cry!!");
    }

    void sleep() {
        System.out.println("Sleep!!");
    }
}

public class Lab094 {
    static void main(String[] args) {

        Baby b1 = new Baby();
        new Baby();

    }
}
