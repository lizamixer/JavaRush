package level11;

//Текущая версия программы: программа считывает строки с клавиатуры, пока не будет введена пустая строка.
//Все введенные строки конвертирует в верхний регистр и выводит их на экран.
//Например, если была введена строка "Мама" и потом пустая строка, то на экран будет выведено — "МАМА".
//Новая версия программы: программа считывает строки с клавиатуры, пока не будет введена пустая строка.
//Далее программа создает новый список строк по следующему алгоритму:
//Если в считанной строке чётное количество символов, строка удваивается и разделяется пробелом:
//Если нечётное — утраивается и разделяется пробелом:
//Программа выводит содержимое нового списка на экран.
//Пример ввода:
//Кот
//Коты
//Кот и коты.
//Пример вывода:
//Кот Кот Кот
//Коты Коты
//Кот и коты. Кот и коты. Кот и коты.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Z19arraylistSchitivanieYdvoenieVivod {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (s.length() % 2 == 0) {
                resultStrings.add(s + " " + s);
            }else if (s.length() % 2 == 1) {
                resultStrings.add(s + " " + s + " " + s);
            }
        }

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }
}
//было
//ArrayList<String> resultStrings = new ArrayList<String>();
//        for (String string : strings) {
//            resultStrings.add(string.toUpperCase());
//        }
//
//        for (String resultString : resultStrings) {
//            System.out.println(resultString);
//        }