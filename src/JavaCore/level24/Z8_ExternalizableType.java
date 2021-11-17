package JavaCore.level24;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.List;

/*
Externalizable Person
Класс Person должен сериализовываться с помощью интерфейса Externalizable.
Исправь ошибку сериализации.
Сигнатуры методов менять нельзя.

Requirements:
1. В классе Solution.Person должен быть создан публичный конструктор без параметров.
2. В классе Solution.Person должен быть создан конструктор с тремя параметрами (String firstName, String lastName, int age).
3. Класс Solution.Person должен поддерживать интерфейс Externalizable.
4. Методы readExternal и writeExternal должны позволять корректно сериализовывать и десериализовывать объекты типа Person.
 */

public class Z8_ExternalizableType {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(mother);
            out.writeObject(lastName);
            out.writeObject(father);
            out.writeObject(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readObject();
            mother = (Person) in.readObject();
            lastName = (String) in.readObject();
            father = (Person) in.readObject();
            age = (int) in.readObject();
            children = (List<Person>) in.readObject();
        }

        public Person() {

        }
    }

    public static void main(String[] args) {

    }
}

/*
было
public class Solution {
    public static class Person {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeChars(firstName);
            out.writeChars(lastName);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = in.readLine();
            lastName = in.readLine();
            father = (Person) in.readObject();
            mother = (Person) in.readObject();
            age = in.readInt();
            children = (List) in.readObject();
        }
    }

    public static void main(String[] args) {

    }
}
 */