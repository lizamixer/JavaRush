package level11;

//Создай список строк в методе main.
//Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//Используя цикл, выведи содержимое на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Z2arraylist {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(0, s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}