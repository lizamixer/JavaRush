package level9;

//Создать массив на 10 строк.
//Создать массив на 10 чисел.
//Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
// которой совпадает с текущим индексом из массива чисел.
// Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

import java.util.Scanner;

public class Z24 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] list = new String[10];
        int[] list2 = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextLine();
        }

        for (int i = 0; i < list.length; i++) {
              list2[i] = list[i].length();
        }

        for (int i = 0; i < list2.length; i++)
            System.out.println(list2[i]);
    }
}