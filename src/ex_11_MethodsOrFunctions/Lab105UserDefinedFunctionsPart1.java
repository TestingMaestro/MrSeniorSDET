package ex_11_MethodsOrFunctions;

public class Lab105UserDefinedFunctionsPart1 {

    static int a = 10;
    static int b = 20;

    // 1. Function without parameters/arguments and Without return type
    static void display() {
        System.out.println("No Arg - No Return Type");
    }

    // 2. No Parameter with return Type
    static int sum() {
        return a + b;
    }

    // 3. with parameter and no return type
    static void name(String myName) {
        System.out.println("Hello " + myName + ", welcome to the world of java");
    }

    static void greetWithFullName(String fname, String lName) {
        System.out.println("First name: " + fname + "\nLast Name: " + lName);
    }

    // 4. with parameter and with return type
    static String disp(String name, String age) {
        return "Name: " + name + " :: Age: " + age;
    }

    static int sumOfTwoNumbers(int x, int y) {
        return x + y;
    }

    static int sumOfThreeNumbers(int x, int y, int z) {
        return x + y + z;
    }

    static void main(String[] args) {

        // 1. Function without parameters/arguments and Without return type
        display();


        // 2. No Parameter with return Type
        int sum = sum();
        System.out.println(sum);


        // 3. with parameter and no return type
        name("Yash");
        name("Bebo");
        greetWithFullName("Yashodhar", "Karki");


        // 4. with parameter and with return type
        String name1 = disp("Yash", "30");
        String name2 = disp("Minni", "27");
        System.out.println(name1);
        System.out.println(name2);

        int sumTwo = sumOfTwoNumbers(10, 20);
        System.out.println(sumTwo);
        int sumThree = sumOfThreeNumbers(20, 90, -15);
        System.out.println(sumThree);
    }
}
