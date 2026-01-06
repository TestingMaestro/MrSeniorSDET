package ex_34_super_Keyword;

class Car extends Vehicle {
    int maxSpeed = 287;

    Car() {
        super();
    }

    Car(int a) {
        super(22);
    }

    @Override
    void showMessage() {
        System.out.println(this.maxSpeed);
        int max = getMaxSpeed();
        super.showMessage();
        super.test();
        super.test(22);
        System.out.println(max);
    }
}
