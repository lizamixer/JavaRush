package level9;

//Создать массив на 20 чисел.
//Ввести в него значения с клавиатуры.
//Создать два массива на 10 чисел каждый.
//Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

import java.util.Scanner;

public class Z22 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[20];
        int[] list2 = new int[10];
        int[] list3 = new int[10];
        int x = 0;
        int y = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
            if (i<10) {
                list2[x] = list[i];
                x++;
            }else {
                list3[y] = list[i];
                y++;
            }
        }
        for (int j = 0; j < list3.length; j++) {
            System.out.println(list3[j]);
        }
    }
}

