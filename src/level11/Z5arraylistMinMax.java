package level11;

//Проинициализируй поле strings в методе main.
//Добавь в список strings 10 строчек с клавиатуры.
//Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.
//Выведи на экран строку из п.3. Должна быть выведена одна строка.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Z5arraylistMinMax {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        //min
        int min = strings.get(0).length();
        int current;
        for (String string : strings) {
            current = string.length();
            if (current <= min) {
                min = current;
            }
        }

        //max
        int max = strings.get(0).length();
        for (String string : strings) {
            current = string.length();
            if (current >= max) {
                max = current;
            }
        }

        for (int i = 0; i < strings.size() - 1; i++) {
            if (strings.get(i).length() == min) {
                System.out.println(strings.get(i));
                break;
            } else if (strings.get(i).length() == max) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
