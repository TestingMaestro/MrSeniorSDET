package ex_34_super_Keyword;

class God {
    void sound() {
        System.out.println("God Sound");
    }
}

public class Animal extends God{
    protected String color = "Black";

    void sound() {
        System.out.println("Animal Sound");
        super.sound();
    }
}

class Cat extends Animal {
    private String color = "White";

    void sound()
    {
        System.out.println("Cat sound");
    }
    void display() {
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}
class Dog extends Cat
{
    void display()
    {
        super.sound();
        super.display();
    }
}
