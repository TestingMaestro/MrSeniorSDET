package ex_29_polymorphism.runtimepolymorph;

public class Lab249MainClass2 {

    // Solution 1 - not using static stimulator
    static void main(String[] args) {

        Shop s1 = new Hp();
        Shop s2 = new Dell();
        Shop s3 = new Lenovo();

/*        s1.laptops();
        s2.laptops();
        s3.laptops();*/

        // Solution 2: Using non static stimulator
        NonStaticStimulator s = new NonStaticStimulator();
        s.shopSimulator(s1);
        s.shopSimulator(s2);
        s.shopSimulator(s3);

    }
}
