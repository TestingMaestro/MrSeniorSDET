package ex_43_collections.comparable;

public class Employee implements Comparable<Employee>{

    private String name;
    private int id;
    private int age;

    Employee(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    // cant do multiple objects sorting because original class is modified
    // one sorting eiter id or name not both
//    @Override
//    public int compareTo(Employee o) {
//        return this.id - o.id;
//    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

}
