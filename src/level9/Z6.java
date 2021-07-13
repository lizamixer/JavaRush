package level9;/*
Введи с клавиатуры три целых числа. Выведи на экран количество положительных чисел среди этих трех.
 */

import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int count=0;

        if (b > 0) {
            count++;
        } if (c > 0) {
            count++;
        } if (d > 0) {
            count++;
        }
        System.out.println(count);
    }
}