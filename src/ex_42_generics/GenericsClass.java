package ex_42_generics;

public class GenericsClass<T> {
    private T data;

    GenericsClass(T data) {

        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
