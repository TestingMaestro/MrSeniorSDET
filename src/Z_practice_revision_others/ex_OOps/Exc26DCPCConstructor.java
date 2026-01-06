package Z_practice_revision_others.ex_OOps;

public class Exc26DCPCConstructor {
    static void main(String[] args) {
        HumanBeing h1 = new HumanBeing("Yash", 28);
        h1.printDetails();

        HumanBeing h2 = new HumanBeing("Momme", 28,"Whitefield",54447);
        h2.printDetailsAll();
        h1.printDetails();
    }
}

class HumanBeing {
    String name;
    int age;
    String address;
    int phNo;
    boolean isMale;

    HumanBeing(String name, int age) {
        this.name = name;
        this.age = age;
    }

    HumanBeing(String name, int age, String add, int phNo) {
        this.name = name;
        this.age = age;
        this.address = add;
        this.phNo = phNo;
    }

    void eat() {
        System.out.println(this.name + " is Eating");
    }

    void sleep() {
        System.out.println(this.name + " is Sleeping");
    }

    void doHome() {
        System.out.println(this.name + " doing homework");
    }

    void printDetailsAll() {
        System.out.println("Name and Age: " + this.name + " " + this.age);
        System.out.println("Address and Phone Number: " + this.address + " " + this.phNo);
        System.out.println("Male/Female: " + this.isMale);
    }
    void printDetails()
    {
        System.out.println("Name and Age: " + this.name + " " + this.age);
    }

}
