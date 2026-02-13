package A0_revision.D_wrapperclass;

public class Wrapper1 {

    static void main(String[] args) {

        // Wrapper gets the Object usage -> gets attribute and behaviour
        // Usefull for Framework support
        // useful for collections
        /*
         * Autoboxing -> Converting from primitive to object
         * Un-boxing -> Converting from object to primitive --> attributes and behaviour are lost*/

        int a = 20;
        Integer conv = a;
        System.out.println(conv.intValue());
        Integer intt = 20;


        // unboxing
        Integer m = 90;
        int x = m;
        System.out.println(x);

        // Integer to String - Method 1

        Integer nnn = 45;
        String wrapper = String.valueOf(nnn);
        System.out.println(wrapper);

        // int to String
        int jj = 33;
        String sexy = String.valueOf(33);

        // Integer to String - Method 2
        String converted = nnn.toString();
        System.out.println(converted);


        //String to Integer

        String s1 = "20";
        Integer um = Integer.parseInt(s1);
        System.out.println(um);


        //char to int

        char gr = 'c';
        int mn = (int) gr;
        System.out.println("Char to int -> " + mn);

        // int to char

        int jk = 69;
        char cj = (char) jk;
        System.out.println("int to char -> " + cj);
    }
}
