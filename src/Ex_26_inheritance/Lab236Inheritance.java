package Ex_26_inheritance;

public class Lab236Inheritance {
    static void main(String[] args) {

        Son s1 = new Son("Dominar", "3BHK", 31);
        System.out.println(s1.bikeFather);
        System.out.println(s1.houseBhkF);
        System.out.println(s1.bikeSon);
        System.out.println(s1.houseBhkS);
        s1.ridesMotorcycle();
        s1.ridingMotorcycle();

    }
}

class Father {
    String bikeFather;
    String houseBhkF;

    Father(String bikeFather, String houseBHK) {
        this.bikeFather = bikeFather;
        this.houseBhkF = houseBHK;
    }

    void ridesMotorcycle() {
        System.out.println("Father has " + houseBhkF + " house and Rides " + this.bikeFather);
    }
}

class Son extends Father {
    String bikeSon;
    String houseBhkS;
    int age;

    Son(String bikeFather, String houseBhk) {
        super(bikeFather, houseBhk);
    }

    Son(String bikeSon, String houseBhkS, int age) {
        super("TVS redeon", "2BHK");
        this.bikeSon = bikeSon;
        this.houseBhkS = houseBhkS;
        this.age = age;
    }

    void ridingMotorcycle() {
        System.out.println("Son has a " + houseBhkS + " and he rides " + this.bikeSon);
    }


}
