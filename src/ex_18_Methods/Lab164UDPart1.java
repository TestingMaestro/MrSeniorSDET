package ex_18_Methods;

public class Lab164UDPart1 {
    static void main(String[] args) {

        // 1. Without Parameter anf Without return type
        greet();
        // 2. With Parameters and without Return type
        greetWithDetails("Yash", 20, 300000);
        greetWithDetails("Sou", 25, 400000);
        greetWithFullName("Yashodhar", "Karki");
        greetWithFullName("Tejaswini", "K");

        // 3. Without Parameters and with Return type

        double areOfCircle = areOfCircle();
        System.out.println(String.format("%.2f", areOfCircle));
        // 4. With Parameters and with Return type
        int sum = sumOfTwoNos(3, 100);
        int sum3 = sumOfThreeNos(300, 200, 2);
        System.out.println(sum);
        System.out.println(sum3);

    }

    // 1. Without Parameter anf Without return type
    static void greet() {
        System.out.println("Hello Yash, How are you??");
    }

    // 2. With Parameters and without Return type
    static void greetWithDetails(String name, int age, double salary) {
        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + salary);

    }

    static void greetWithFullName(String fName, String nName) {
        System.out.println("First Name: " + fName);
        System.out.println("Second Name: " + nName);
    }


    // 3. Without Parameters and with Return type

    static double areOfCircle() {
        int r = 4;
        double radius = Math.pow(r, 2);
        return Math.PI * radius;
    }
    // 4. With Parameters and with Return type

    static int sumOfTwoNos(int a, int b) {
        return a + b;
    }

    static int sumOfThreeNos(int a, int b, int c) {
        return a + b + c;
    }

}
