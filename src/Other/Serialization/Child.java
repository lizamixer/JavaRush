package Other.Serialization;

import java.io.Serializable;

// Класс Child, впервые реализовавший Serializable
public class Child extends Parent implements Serializable {
    private int age;
    public Child(int age) {
        System.out.println("Create Child");
        this.age=age;
    }
    public String toString() {
        return super.toString()+",age="+age;
    }
}
