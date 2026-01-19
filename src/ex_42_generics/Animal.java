package ex_42_generics;

public interface Animal<T> {
    void sound(T sound);
    default void capabilities()
    {
        System.out.println("Meow");
    }
}

class Dog<T> implements Animal<String> {
    @Override
    public void sound(String sound) {

        System.out.println("Dog Sound: " + sound);
    }

    void display(String manga) {
        System.out.println(manga);
    }
}

class Lab173mainClass {

    static void main(String[] args) {

        Animal<String> an1 = new Dog();
        an1.sound("Bow Bow");
    }
}