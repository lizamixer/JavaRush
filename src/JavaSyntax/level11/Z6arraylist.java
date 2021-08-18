package level11;

//Создай список строк.
//Добавь в него 5 строк с клавиатуры.
//Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//Используя цикл, выведи содержимое результирующего списка на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Z6arraylist {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for(int i = 0 ; i<13; i++) {
            int x = list.size();
            String z  = list.get(list.size() - 1);
            list.add(0, z);
            list.remove(x);
        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}



