package ex_18_Methods;

public class Lab165InterviewQ {
    static void main(String[] args) {
        System.out.println("Jvm Calls me");
    }

    static void main(int args) {
        System.out.println("Jvm Calls me");
    }

    static int main(float args) {
        System.out.println("Jvm Calls me");
        return 2;
    }

    static void main(boolean args) {
        System.out.println("Jvm Calls me");
    }
}
