package ex_03_javaBasicsPart3;

public class Lab029StringFormatting {
    static void main(String[] args) {

        String name = "yash";

        System.out.printf("Name: %s \n", name);

        System.out.println(String.format("Name: %s", name));
    }
}
