package A0_revision.C_generics;

public class GenericsForClass<T> {

    // Generics is writing the code with some type of data. Once that type is selected same type is used through out the program
    /*
    * Why Generics?
    * 1. When the programs are not written in type safe manner
    * 2. Manual casting
    * 3. Readability wasn't good
    *
    * */
    Object n = "Yash";
    String s = (String) n;
    // Compile time it doesn't throw any error but at runtime it is difficult for JVM


    /*
    * So generic came into picture
    * <T> is a declaration
    * T is usage
    * */

}
