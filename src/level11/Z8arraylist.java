package level11;

//Введи с клавиатуры 20 чисел, сохрани их в список numbers и рассортируй по трём другим спискам:
//число нацело делится на 3 (x%3==0) — попадает в список divBy3,
//нацело делится на 2 (x%2==0) — попадает в divBy2,
//и все остальные — попадают в others,
//нацело делится на 3 и на 2 одновременно, например, 6, — попадает и в divBy3, и в divBy2.
//Статические переменные списков уже созданны и инициализированы.
//Метод printList() должен выводить на экран все элементы списка с новой строки.
//Используя метод printList(), выведи экран: сначала список divBy3, потом divBy2, потом others.

import java.util.ArrayList;
import java.util.Scanner;

public class Z8arraylist {
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            int s = scanner.nextInt();
            numbers.add(s);
        }
        for (int i = 0; i < numbers.size(); i++) {
            Integer y = numbers.get(i);
            if (y % 2 == 0) {
                divBy2.add(y);
            }
            if (y % 3 == 0) {
                divBy3.add(y);
            }
            if (y % 3 != 0 && y % 2 != 0) {
                others.add(y);
            }
        }
        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
