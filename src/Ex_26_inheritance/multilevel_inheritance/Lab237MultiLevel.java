package Ex_26_inheritance.multilevel_inheritance;

public class Lab237MultiLevel {
    static void main(String[] args) {
        Son s1 = new Son();
        s1.f();
        s1.gf();
        s1.s();

        // i need a father's home

        GrandFather gf1 = new Son(); // Dynamic Dispatch
        gf1.home();

    }
}
