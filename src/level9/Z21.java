package level9;

//Создать массив на 10 чисел.
//Ввести с клавиатуры 10 чисел и записать их в массив.
//Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

import java.util.Scanner;

public class Z21 {
    public static void main(String[] args) throws Exception {
        int[] list = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        for (int i = list.length - 1; i >= 0; i--)
            System.out.println(list[i]);
    }
}

