package ex_29_polymorphism.runtimepolymorph;

public class NonStaticStimulator {
    void shopSimulator(Shop s)
    {
        if(s != null)
        {
            s.act();
        }

    }
}
