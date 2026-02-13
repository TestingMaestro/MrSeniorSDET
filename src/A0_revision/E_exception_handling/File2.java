package A0_revision.E_exception_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {

    static void main(String[] args) {

        File f1 = new File("C://Users//91914//Downloads//yash.txt");
        try {

            if (f1.exists()) {
                System.out.println("File exists");
                FileWriter fw = new FileWriter(f1);
                fw.write("Chinnani loves chinninani");
                fw.flush();
                fw.close();
            } else f1.createNewFile();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
