package ex_40wrapper;

public class Lab262Wrapper2
{
    static void main(String[] args) {
        Mobile ph1 = new Mobile(1,"S 24 ULTRA",80000.00);
        Mobile ph2 = new Mobile(2,"Vivo X 300 Pro",140000.00);

        ph1.setPrice(100000.00);
        System.out.println(ph1.getPrice());

        System.out.println(ph1.getPhoneName());
        System.out.println(ph1.getPhoneNo());

    }
}

