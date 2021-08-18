package level9;

//Двумерный массив — это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив.
// Но гораздо проще его представить в виде таблицы, у которой задано количество строк (первое измерение)
// и количество столбцов (второе измерение). В этой задаче мы будем создавать такой массив.
//Для этого реализуй метод main(String[]), который:
//Считывает из консоли число N — количество строк массива. Число должно быть больше 0.
//Потом считывает N чисел из консоли (любые числа больше 0).
//Затем инициализирует двумерный массив multiArray:
//количеством строк N;
//строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).

import java.util.Scanner;

public class Z29 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiArray = new int[n][];

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[sc.nextInt()];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}


