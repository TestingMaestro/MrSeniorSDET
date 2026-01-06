package Z_practice_revision_others.ex_inifinityRevision;

import java.util.Random;

public class Task27UsingRandomFunctions {
    static void main(String[] args) {

        Random random = new Random();
        int randomNo = random.nextInt(2000) + 1;

        String result = "username" + randomNo + "@aurigo.com";
        System.out.println(result);
    }
}
