package level9;

//Создать массив на 10 строк.
//Ввести с клавиатуры 8 строк и сохранить их в массив.
//Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент — с новой строки.

import java.util.Scanner;

public class Z20massivVivodVObratnomPoryadke {
    public static void main(String[] args) throws Exception {
        String[] list = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            list[i] = scanner.nextLine();
        }
        for (int i = list.length - 1; i >= 0; i--)
            System.out.println(list[i]);
        }
    }


