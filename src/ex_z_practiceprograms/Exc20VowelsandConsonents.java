package ex_z_practiceprograms;

public class Exc20VowelsandConsonents
{
    static void main(String[] args) {

        String [] arr = {"a", "e", "i","o","u"};
        String enteredString = "p";
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if(enteredString.equals(arr[i]))
            {
                flag =false;
                break;
            }
        }
        if (!flag)
        {
            System.out.println("Vowel");
        }
        else System.out.println("consonant");
    }
}
