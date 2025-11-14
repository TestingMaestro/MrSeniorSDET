package ex_19_strings;

public class Lab171InterviewQ {
    static void main(String[] args) {

        // Only one string named help is there String constant pool
        String s1 = "Help";
        String s5 = "Help";
        String s6 = "Help";

        /*Each new operator creates random memory space inside Heap area
         * So there are 3 strings name Yash present in Object Area*/
        String name1 = new String("Yash");
        String name2 = new String("Yash");
        String name3 = new String("Yash");
    }
}
