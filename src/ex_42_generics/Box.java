package ex_42_generics;

public class Box<T>
{
    private T boxName;
    private T boxCount;

    public T getBoxName() {
        return boxName;
    }

    public void setBoxName(T boxName) {
        this.boxName = boxName;
    }

    public T getBoxCount() {
        return boxCount;
    }

    public void setBoxCount(T boxCount) {
        this.boxCount = boxCount;
    }

    public void display()
    {
        System.out.println(getBoxName());
        System.out.println(getBoxCount());
    }
}
