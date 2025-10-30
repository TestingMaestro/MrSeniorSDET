package ex_09_OOPs;

public class Lab093_OOPsp2 {
    static void main(String[] args) {

        Dog gs = new Dog();
        gs.dogName = "German Shepherd";
        System.out.println(gs.dogName);
        String myDogName = gs.nameOftheDog("German Shepherd");
        System.out.println(myDogName);
        gs.bark();
        gs.sleep();
    }

}

class Dog {
    String dogName;
    byte dogAge;
    String dogBreed;
    String color;

    String nameOftheDog(String name) {
        return "Hello " + name + ", Welcome to the Dog Show";
    }

    String bark() {
        return this.dogName + " is barking";
    }

    void sleep() {
        System.out.println(this.dogName + " is Sleeping");
    }
}
