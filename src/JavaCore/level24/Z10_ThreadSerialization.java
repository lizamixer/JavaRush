package JavaCore.level24;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
Переопределение сериализации
Сделайте (переопределите метод readObject) так, чтобы после инициализации объекта типа Solution посредством десериализации нить runner запускалась автоматически.
Ключевые слова объекта runner менять нельзя.
Подсказка: конструктор не вызывается при десериализации, только инициализируются все поля.

Requirements:
1. Класс Solution должен поддерживать интерфейс Serializable.
2. Класс Solution должен поддерживать интерфейс Runnable.
3. Поле runner в классе Solution должно быть объявлено с модификатором transient.
4. В методе readObject должен быть создан новый объект типа Thread с текущим объектом в качестве параметра.
5. В методе readObject должен быть вызван метод start у нового объекта типа Thread.
 */

public class Z10_ThreadSerialization implements Serializable, Runnable {
    transient private Thread runner;
    private int speed;

    public Z10_ThreadSerialization(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        // do something here, doesn't matter what
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        new Thread(this).start();
    }

    public static void main(String[] args) {

    }
}

/*
public class Solution implements {
    private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        // do something here, doesn't matter what
    }


private void writeObject(ObjectOutputStream out) throws IOException {
    out.defaultWriteObject();
}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

    public static void main(String[] args) {

    }
}
 */