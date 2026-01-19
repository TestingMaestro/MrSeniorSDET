package ex_40wrapper;

public interface SimCard {
    void enterCard();

    default void sim() {
        System.out.println("Every mobile should have sim card");
    }
}
