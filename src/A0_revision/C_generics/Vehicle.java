package A0_revision.C_generics;

public interface Vehicle<T> {
    void make(T make);

    void manufactureYear(T year);
}

class Car<T> implements Vehicle<String> {

    @Override
    public void make(String make) {
        System.out.println("Car make: " + make);
    }

    @Override
    public void manufactureYear(String year) {
        System.out.println("year: " + year);
    }
}
class Bike<T> implements Vehicle<Integer> {

    @Override
    public void make(Integer make) {
        System.out.println("Bike Make: " + make);
    }

    @Override
    public void manufactureYear(Integer year) {
        System.out.println("year: " + year);
    }
}

class MainClasss {

    static void main(String[] args) {

        Vehicle<String> vehicle1 = new Car<>();
        Vehicle<Integer> vehicle2 = new Bike<>();
        vehicle1.make("G wagon");
        vehicle2.manufactureYear(2027);
    }
}
