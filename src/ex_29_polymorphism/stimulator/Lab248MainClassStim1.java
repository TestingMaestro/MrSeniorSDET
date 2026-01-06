package ex_29_polymorphism.stimulator;

public class Lab248MainClassStim1 {
    static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();
        Snake s = new Snake();

        Stimulator1.animalStimulator(d);
        Stimulator1.animalStimulator(c);
        Stimulator1.animalStimulator(s);
    }
}
