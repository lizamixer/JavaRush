package level18Core.Z24Constructor;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

//Заполни список exceptions десятью различными исключениями.
//Первое исключение уже реализовано в методе initExceptions.
//Requirements:
//1. Список exceptions должен содержать 10 элементов.
//2. Все элементы списка exceptions должны быть исключениями (потомками класса Throwable).
//3. Все элементы списка exceptions должны быть уникальны.
//4. Метод initExceptions должен быть статическим.

public class Z26Exception {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ClassNotFoundException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new FileNotFoundException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new InterruptedException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NoSuchFieldException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NoSuchMethodException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NumberFormatException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new StringIndexOutOfBoundsException();
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}

