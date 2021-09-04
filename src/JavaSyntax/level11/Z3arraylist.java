package level11;

//Считай с клавиатуры 5 чисел и добавь в список integers.
//Найди максимальное число в списке.
//Выведи найденное число на экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Z3arraylist {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int s = scanner.nextInt();
            integers.add(s);
        }
        System.out.println(Collections.max(integers));
    }
}
