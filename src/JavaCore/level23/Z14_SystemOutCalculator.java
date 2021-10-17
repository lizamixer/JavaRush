package JavaCore.level23;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Решаем пример
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.
Пример вывода:
3 + 6 = 9

Requirements:
1. Класс Solution должен содержать класс TestString.
2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
3. Класс TestString должен содержать публичный void метод printSomething().
4. Метод printSomething() класса TestString должен выводить на экран строку "3 + 6 = ".
5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром
конструктора ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно
заданию, и выводить её в консоль.
 */

public class Z14_SystemOutCalculator {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);
        String result = outputStream.toString();

        ArrayList<String> arrayList = new ArrayList();
        Pattern pat = Pattern.compile("\\d+|\\+|-|\\*");
        Matcher matcher = pat.matcher(result);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }

        int value = 0;
        switch (arrayList.get(1)) {
            case ("+"): value = Integer.parseInt(arrayList.get(0)) + Integer.parseInt(arrayList.get(2));
                break;
            case ("-"): value = Integer.parseInt(arrayList.get(0)) - Integer.parseInt(arrayList.get(2));
                break;
            case ("*"): value = Integer.parseInt(arrayList.get(0)) * Integer.parseInt(arrayList.get(2));
                break;
        }
        System.out.println(arrayList.get(0) + " " + arrayList.get(1) + " " + arrayList.get(2) + " = " + value);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


