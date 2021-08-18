package level19Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Парсер реквестов
//Для решения этой задачи тебе нужно:
//Считать с консоли URL-ссылку.
//Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
//URL содержит минимум 1 параметр.
//Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
//Если присутствует параметр obj, то передать его значение в нужный метод alert():
//alert(double value) - для чисел (не забывай о том, что число может быть дробным);
//alert(String value) - для строк.
//Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
//Пример 1
//Ввод:
//http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
//Вывод:
//lvl view name
//Пример 2
//Ввод:
//http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
//Вывод:
//obj name
//double: 3.14
//Requirements:
//1. Программа должна считывать с клавиатуры только одну строку.
//2. Класс Solution не должен содержать статические поля.
//3. Программа должна выводить данные на экран в соответствии с условием.
//4. Программа должна вызывать метод alert() с параметром double, если значение параметра obj можно
// корректно преобразовать в число типа double.
//5. Программа должна вызывать метод alert() с параметром String, если значение параметра obj нельзя
// корректно преобразовать в число типа double.

public class Z25_IndexofBuffSplitMassivExceptionSubstring {
    public static void main(String[] args) throws IOException {
        //add your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        ArrayList<String> list = new ArrayList<String>();

        int index = line.indexOf("?");
        String first = line.substring(index + 1);
        String[] words = first.split("&");

        for (String s : words) {
            String[] words2 = s.split("=");
            list.add(words2[0]);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (String s : words) {
            if (s.startsWith("obj")) {
                String[] words2 = s.split("=");
                list.add(words2[0]);
                try {
                    double d = Double.parseDouble(words2[1]);
                    alert(d);
                } catch (NumberFormatException e) {
                    alert(words2[1]);
                }
            } else {
                String[] words2 = s.split("=");
                list.add(words2[0]);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

/*
public class Solution {
    public static void main(String[] args) {
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
 */