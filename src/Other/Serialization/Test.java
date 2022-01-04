package Other.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Запускаемый класс для теста
public class Test {
    public static void main(String[] arg) {
        try {
            FileOutputStream fos = new FileOutputStream("output.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Child c = new Child(2);
            c.changeNames();
            System.out.println(c);
            oos.writeObject(c);
            oos.writeObject(new Child2(3, 4));
            oos.close();
            System.out.println("Read objects:");
            FileInputStream fis = new FileInputStream("output.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
            ois.close();
        } catch (Exception e) { // упрощенная обработка для краткости
            e.printStackTrace();
        }
    }
}

/*
https://intuit.ru/studies/courses/16/16/lecture/27133?page=3

В этом примере объявлено 3 класса. Класс Parent не реализует Serializable и, следовательно, не может быть
сериализован. В нем объявлено 2 поля, которые при создании получают значения, содержащие слово "old" ("старый").
Кроме этого, объявлен метод, позволяющий модифицировать эти поля. Он выставляет им значения, содержащие слово
"new" ("новый’). Также переопределен метод toString(), чтобы дать возможность узнать значения этих полей.
Поскольку класс Parent имеет доступный конструктор по умолчанию, его наследник может реализовать интерфейс
Serializable. Обратите внимание, что у самого класса Child такого конструктора уже нет. Также объявлено поле
и модифицирован метод toString().
Наконец, класс Child2 наследуется от Child, а потому автоматически является допустимым для сериализации.
Аналогично, имеет новое поле, значение которого отображает toString().
Запускаемый класс Test сериализует в файл output.bin два объекта. Обратите внимание, что у первого из них
предварительно вызывается метод changeNames(), который модифицирует значения полей, унаследованных от класса Parent.
 */