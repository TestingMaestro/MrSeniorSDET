package A0_revision.C_generics;

public class GenericsForClass1 {

    static void main(String[] args) {

        Student1<String> student1 = new Student1<>("Yash");
        Student1<Integer> student2 = new Student1<>(12);
        Student1<Float> student3 = new Student1<>(12.2f);

        System.out.println(student1.getName());
    }


}

class Student1<T> {

    private T name;

    public Student1(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

}
