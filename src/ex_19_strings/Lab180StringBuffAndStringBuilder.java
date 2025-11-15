package ex_19_strings;

public class Lab180StringBuffAndStringBuilder {
    static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Momo and Bebo");
        stringBuilder.append(" are happily married, and they are the world’s richest trillionaires");
        System.out.println("\n" + stringBuilder);

//        stringBuilder.delete(1, 6);
//        System.out.println(stringBuilder);

//        stringBuilder.reverse();
//        System.out.println(stringBuilder);

//        int a = stringBuilder.indexOf("odhar", 4);
//        System.out.println(a);
//
//        stringBuilder.insert(9,"MOMO");
//        System.out.println(stringBuilder);
    }
}
