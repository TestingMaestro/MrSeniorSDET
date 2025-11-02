package ex_10_OOPsConstructor;

public class Lab100ThisCallingStatement2 {
    static void main(String[] args) {
        Dogs1 d1 = new Dogs1(2);
    }
}

class Dogs1 {
    String name;
    int age;
    String breed;
    String eyesColor;
    boolean isMale;
    int numberOfPuppies;
    int numberOfEyes;

    Dogs1() {
        System.out.println("No Argument Constructor");
    }

    Dogs1(String name) {
        this();
        this.name = name;
        System.out.println("Dog's Name: " + this.name);

    }

    Dogs1(int age, boolean isMale) {
        this("Bruno");
        this.age = age;
        this.isMale = isMale;
        System.out.println("age: " + this.age);
        System.out.println("Gender: " + this.isMale);
    }

    Dogs1(String breed, String eyesColor, int numberOfPuppies) {
        this(2, true);
        this.eyesColor = eyesColor;
        this.breed = breed;
        this.numberOfPuppies = numberOfPuppies;
        System.out.println("Breed: " + this.breed);
        System.out.println("Eyes Color: " + this.eyesColor);
        System.out.println("No.of puppies: " + this.numberOfPuppies);

    }

    Dogs1(int numberOfEyes) {
        this("GermanShepherd", "Brown", 12);
        this.numberOfEyes = numberOfEyes;
        System.out.println("Number Of Eyes: " + this.numberOfEyes);
    }
}