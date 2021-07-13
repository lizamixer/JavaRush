package level11;

//Ввести с клавиатуры 10 чисел и заполнить ими список.
//Вывести их в обратном порядке. Каждый элемент — с новой строки.
//Использовать только цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Z13arraylistIntstroknaoborot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int s = Integer.parseInt(reader.readLine());
            list.add(s);
        }
        for (int i = list.size() - 1; i >= 0; i--)
            System.out.println(list.get(i));
    }
}
