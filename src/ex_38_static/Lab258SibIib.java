package ex_38_static;

public class Lab258SibIib
{
    static void main(String[] args) {

        //If you load the class multiple times. SIBs will be called ONLY ONCE
        System.out.println("Main Method");
        IibSib iib = new IibSib();
        IibSib iib3 = new IibSib();
    }
}
class IibSib
{
    static {
        System.out.println("My SQL DB connection");
    }
    static
    {
        System.out.println("Config properties file");
    }
    IibSib()
    {
        System.out.println("DC");
    }
    {
        System.out.println("IIB 1");
    }
    {
        System.out.println("IIB 2");
    }
    {
        System.out.println("IIB 3");
    }
    {
        System.out.println("IIB 4");
    }
}
