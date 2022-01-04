package Other.Serialization2;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(2.0, 2.0);
        Point p3 = new Point(3.0, 3.0);
        Line line1 = new Line(p1, p2, 1);
        Line line2 = new Line(p2, p3, 2);
        System.out.println("line 1 = " + line1);
        System.out.println("line 2 = " + line2);
        String fileName = "d:\\file";
        try {
            // записываем объекты в файл
            FileOutputStream os = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(line1);
            oos.writeObject(line2);
            // меняем состояние line1 и записываем его еще раз
            line1.setIndex(3);
            //oos.reset();
            oos.writeObject(line1);
            // закрываем потоки
            // достаточно закрыть только поток-надстройку
            oos.close();
            // считываем объекты
            System.out.println("Read objects:");
            FileInputStream is = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(is);
            for (int i = 0; i < 3; i++) { // Считываем 3 объекта
                Line line = (Line) ois.readObject();
                line.printInfo();
            }
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
https://intuit.ru/studies/courses/16/16/lecture/27133?page=3

В этой программе работа идет с классом Line (линия), который имеет 2 поля типа Point (линия описывается двумя точками).
Запускаемый класс Main создает два объекта класса Line, причем, одна из точек у них общая. Кроме этого, линия имеет номер
(поле index ). Созданные линии (номера 1 и 2) записываются в поток, после чего одна из них получает новый номер (3) и вновь сериализуется.

Из примера видно, что после восстановления у линий сохраняется общая точка, описываемая одним и тем же объектом (хеш-код 386e ).
Третий записанный объект идентичен первому, причем, совпадают даже объектные ссылки. Несмотря на то, что при записи
третьего объекта значение index было изменено на 3, в десериализованном объекте оно осталось равным 1. Так произошло
потому, что объект, описывающий первую линию, уже был задействован в сериализации и, встретившись во второй раз, повторно записан не был.
Чтобы указать, что сеанс сериализации завершен, и получить возможность передавать измененные объекты, у
ObjectOutputStream нужно вызвать метод reset(). В рассматриваемом примере для этого достаточно убрать комментарий в строке
//oos.reset();
 */