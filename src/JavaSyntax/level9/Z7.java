package level9;/*
Введи с клавиатуры три целых числа. Выведи на экран количество положительных чисел среди этих трех.
 */

import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int count=0;
        int count2=0;


        if (b > 0 && b!=0) {
            count++;
        }else if (b < 0 && b!=0){
            count2++;
        }
        if (c > 0 && b!=0) {
            count++;
        } else if (c < 0 && c!=0) {
            count2++;
        }
        if (d > 0 && d!=0) {
            count++;
        } else if (d < 0 && d!=0){
            count2++;
        }
        System.out.println("количество отрицательных чисел: " + count2);
        System.out.println("количество положительных чисел: " + count);
    }
}