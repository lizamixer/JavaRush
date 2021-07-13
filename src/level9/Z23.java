package level9;

//Создать массив на 15 целых чисел.
//Ввести в него значения с клавиатуры.
//Пускай индекс элемента массива является номером дома, а значение — числом жителей, проживающих в доме.
//Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой.
// Выяснить, на какой стороне улицы проживает больше жителей.
//Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей."
// или "В домах с четными номерами проживает больше жителей."

import java.util.Scanner;

public class Z23 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[15];
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            if (i % 2 == 0) {
                sum += list[i];
            } else if (i == 0) {
                sum += list[i];
            } else {
                sum2 += list[i];
            }
        }

        if (sum2 > sum) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}