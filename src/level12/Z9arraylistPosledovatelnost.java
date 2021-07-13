package level12;

//Создай список чисел.
//Добавь в список 10 чисел с клавиатуры.
//Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
//Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14
//B как потом оказалось должна принимать числа больше 127 ->
//Почему то если применять не equals а равенство, то не работает

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Z9arraylistPosledovatelnost {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(r.readLine()));
        }
        int count = 1, max = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                if (max < count)
                    max = count;
            } else
                count = 1;
        }
        System.out.println(max);
    }
}
/* мое решение
public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int current = 1, max = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i-1))  {
                current++;
                if (current > max) {
                    max = current;
                }
            } else current = 1;
        }
        System.out.println(max);
    }
}
 */