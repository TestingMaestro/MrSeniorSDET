package Z_practice_revision_others.ex_inifinityRevision;

import java.util.Date;

public class Task2StringFormatting {
    static void main(String[] args) {

        String name = "Yashodhar";

        System.out.printf("My Name is %s \n", name);

        //Date and Time

        Date date = new Date();
        System.out.println(String.format("Current Date and Time is %tD %tT \n", date, date));

        //other way
        System.out.printf("Current Date and Time is %tD %tT \n", date, date);

        // Float/Double Numbers
        System.out.println(Math.PI);
        System.out.println(String.format("%.2f", Math.PI));

    }
}