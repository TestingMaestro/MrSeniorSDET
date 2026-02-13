package A0_revision.E_exception_handling;

public class Error2 {

    //OutOfMemoryError

    static void main(String[] args) {

        try {
            int[] arr = new int[2];
            arr[2] = 12;
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());        }
    }
}
