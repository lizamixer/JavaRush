package JavaCore.level24;

import java.io.*;

/*
Найти ошибки
Почему-то при сериализации/десериализации объекта класса B возникают ошибки.
Найди проблему и исправь ее.
Класс A не должен реализовывать интерфейсы Serializable и Externalizable.
В сигнатуре класса В ошибки нет :).
В методе main ошибок нет.

Requirements:
1. Класс B должен быть потомком класса A.
2. Класс B должен поддерживать интерфейс Serializable.
3. Класс A не должен поддерживать интерфейс Serializable.
4. Класс A не должен поддерживать интерфейс Externalizable.
5. Программа должна выполняться без ошибок.
6. При десериализации должны корректно восстанавливаться значение полей nameA и nameB.
 */

public class Z13_SerializationExtends implements Serializable { //добавила интерфейс

    public static class A {
        protected String nameA = "A";

        public A(String nameA) {
            this.nameA += nameA;
        }
        //Класс A не поддерживает сериализацию, поэтому для инициализации его переменных будет вызываться
        //конструктор по умолчанию. Поэтому конструктор нужно прописать ручками. Если бы класс A поддерживал
        //сериализацию, городить пустой конструктор не пришлось бы, java бы знала, что у него есть конструктор
        //с параметром и вызвала бы его.
        public A () {
        }
    }

    public class B extends A implements Serializable {
        private String nameB;

        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }

        //добавила эти 2 метода
        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            out.writeObject(nameA);
            out.writeObject(nameB);
        }
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            in.defaultReadObject();
            nameA = (String) in.readObject();
            nameB = (String) in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        Z13_SerializationExtends solution = new Z13_SerializationExtends();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B) ois.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }
}

/* было
public class Solution {
    public static class A {

        protected String nameA = "A";

        public A(String nameA) {
            this.nameA += nameA;
        }
    }

    public class B extends A implements Serializable {

        private String nameB;

        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        Solution solution = new Solution();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B) ois.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }
}
 */
