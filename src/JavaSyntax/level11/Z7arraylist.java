package level11;

//Введи с клавиатуры 5 слов в список строк. Удали 3-й элемент списка и выведи оставшиеся элементы в обратном порядке.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Z7arraylist {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> integers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            integers.add(s);
        }
        integers.remove(2);
        for (int i = 0; i < integers.size(); i++)
        {
            int j = integers.size() - i - 1;
            System.out.println(integers.get(j));
        }
    }
}