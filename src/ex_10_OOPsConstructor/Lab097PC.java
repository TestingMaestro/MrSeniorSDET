package ex_10_OOPsConstructor;

public class Lab097PC {
    static void main(String[] args) {
        Cars1 c1 = new Cars1();
        Cars1 c2 = new Cars1();
        System.out.println(c1.name);
        System.out.println(c2.name);

        Cars1 c3 = new Cars1("BMW", "m3 GTR", 2010);
        Cars1 c4 = new Cars1("Mercedes", "Maybach", 2011);
        Cars1 c5 = new Cars1("Audi", "R8", 2012);

        System.out.println(c3.name + " " + c3.model + " " + c3.year);
        System.out.println(c4.name + " " + c4.model + " " + c4.year);
        System.out.println(c5.name + " " + c5.model + " " + c5.year);

        c1.eat();

    }
}

class Cars {
    String name;
    String model;
    int year;

    // DC
    Cars() {
        name = "Mercedes";
        model = "G-Wagon";
        year = 2015;
    }

    // Parameterized Constructor

    Cars(String nameCars, String modelCars, int yearCars) {
        this.name = nameCars;
        this.model = modelCars;
        this.year = yearCars;
    }

    void eat() {
        System.out.println(this.name);
    }
}

