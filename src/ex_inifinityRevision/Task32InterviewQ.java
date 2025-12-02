package ex_inifinityRevision;

public class Task32InterviewQ
{
    static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = a;
        b[1] = 99;
        System.out.println(a[1]);
    }
}
