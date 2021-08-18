package level11;

//Введи с клавиатуры 10 слов в список строк.
//Метод doubleValues должен удваивать слова по принципу "альфа", "бета", "гамма" ->
//"альфа", "альфа", "бета", "бета", "гамма", "гамма".
//Выведи результат на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Z11arraylistYdvoenieSlov {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            list.add(i + 1, s);
            i++;
        }
        return list;
    }
}