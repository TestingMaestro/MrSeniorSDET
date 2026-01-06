package ex_34_super_Keyword;

class Vehicle {
    private int maxSpeed = 280;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Vehicle() {
        System.out.println("Default Constructor");
    }

    Vehicle(int a) {
        System.out.println("Parameterized Constructor");
    }

    //Method Overloading

    void test() {
        System.out.println("Test1");
    }

    void test(int m) {
        System.out.println("Test 2");
        int sum = m + m;
        System.out.println("Value is: " + sum);
    }

    void showMessage() {
        System.out.println("I'm Parent");
    }
}
