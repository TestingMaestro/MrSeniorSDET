package ex_41_exception_handling.unchecked_exception;

public class Lab267Exception4
{
    static void main(String[] args) {

        try {
            int []arr = new int[]{1,2,3,4};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
