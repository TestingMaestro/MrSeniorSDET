package ex_inifinityRevision;

import java.util.Scanner;

public class Task20TradSwitchWithMultipleCases {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day");
        String days = sc.nextLine();
        days = days.toLowerCase();
        String result = switch (days) {

            case "day1", "day2", "day3" -> "Monday, Tuesday, Wednesday";
            case "day4" -> "Thrsday";
            default -> "Loveday";
        };
        System.out.println(result);
    }
}
