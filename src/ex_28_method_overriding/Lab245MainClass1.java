package ex_28_method_overriding;

public class Lab245MainClass1 {
    static void main(String[] args) {

        Studentt1 s1 = new Studentt1();
        s1.conductsExam();
        Studentt2 s2 = new Studentt2();
        s1.conductsExam();

        Teacher t1 = new Studentt1(); //dynamic method dispatch
        t1.conductsExam();// if there is nothing found in student class, object checks for parent properties
    }
}
