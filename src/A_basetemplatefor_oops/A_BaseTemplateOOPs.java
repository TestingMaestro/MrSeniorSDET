package A_basetemplatefor_oops;

// 5️⃣ POLYMORPHISM (Runtime decision)
public class A_BaseTemplateOOPs {
    public static void main(String[] args) {
        BaseEntity entity;
        entity = new TypeA("A101");
        entity.log();
        entity.execute();
        entity = new TypeB("B202");
        entity.log();
        entity.execute();
    }

}
// 1️⃣ INTERFACE (A_basetemplatefor_oops.Capability / Rule)
interface Capability {
    void perform();
}

// 2️⃣ ABSTRACT CLASS (Base Template)
abstract class BaseEntity {
    // 4️⃣ ENCAPSULATION (Hidden data)
    private String id;
    public BaseEntity(String id) {
        this.id = id;
    }
    // Controlled access
    public String getId() {
        return id;
    }
    // 3️⃣ ABSTRACTION (What must be implemented)
    public abstract void execute();
    // Common behavior
    public void log() {
        System.out.println("Executing entity with ID: " + id);
    }
}

// 3️⃣ CONCRETE CLASS 1
class TypeA extends BaseEntity implements Capability {
    public TypeA(String id) {
        super(id);
    }
    @Override
    public void execute() {
        System.out.println("A_basetemplatefor_oops.TypeA specific execution");
    }
    @Override
    public void perform() {
        System.out.println("A_basetemplatefor_oops.TypeA performing capability");
    }
}

// 3️⃣ CONCRETE CLASS 2
class TypeB extends BaseEntity implements Capability {
    public TypeB(String id) {
        super(id);
    }
    @Override
    public void execute() {
        System.out.println("A_basetemplatefor_oops.TypeB specific execution");
    }
    @Override
    public void perform() {
        System.out.println("A_basetemplatefor_oops.TypeB performing capability");
    }
}


