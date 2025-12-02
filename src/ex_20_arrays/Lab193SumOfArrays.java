package ex_20_arrays;

public class Lab193SumOfArrays {
    static void main(String[] args) {

        int[] numbers = {12, 20, 100};


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }
        System.out.println(sum);

        for (int result : numbers) {
            // it iterates over values not indexes
            sum = sum + result;
            System.out.println(result);
        }
    }

}
