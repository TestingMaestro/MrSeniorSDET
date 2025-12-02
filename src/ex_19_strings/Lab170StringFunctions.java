package ex_19_strings;

public class Lab170StringFunctions {
    static void main(String[] args) {

        String s1 = "            Yashodhar Karki";
        char [] ch = {'a'};

        s1 = s1.concat("-> Automation Expert              ");
        System.out.println(s1);

        int len = s1.length();
        System.out.println("Length" + len);

        System.out.println(s1.toUpperCase());

        System.out.println(s1.toLowerCase());

        System.out.println(s1.charAt(3)); // index starts from 0

        System.out.println(s1.indexOf('-'));

        System.out.println(s1.lastIndexOf('a'));

        System.out.println(s1.startsWith("Yash"));

        System.out.println(s1.endsWith("dhar"));

        System.out.println(s1.substring(2)); // start index is considered

        System.out.println(s1.substring(3, 10));// End index is not considered

        System.out.println(s1.trim()); // leading and trailing spaces are removed

        System.out.println(s1.replace("a", "A"));

        System.out.println(s1.compareTo("Yash"));

        String s2 = "yash@karki@gmail@.com";
        String[] arr = s2.split("@");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Split

        String fruits = "Pomegranate,Apple,Banana,Cherry";
        String[] strArray = fruits.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        for (String fruit : strArray) {
            System.out.println(fruit);
        }

        String l1 = "Hello ";
        String l2 = "World ";
        String l3 = "Yash";
        String l4 = l1 + l2 + l3;
        System.out.println(l4);

    }
}
