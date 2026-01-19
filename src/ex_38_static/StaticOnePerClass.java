package ex_38_static;

public class StaticOnePerClass {

    static void main(String[] args) {

        ProofStatic s = new ProofStatic();
        s.proofMethod();
    }
}

class ProofStatic
{
    static Integer count = 0;

    ProofStatic()
    {
        count++;
        System.out.println(count);
    }
    void proofMethod()
    {
        for (int i = 0; i < 5; i++) {
            new ProofStatic();
        }
    }
}
