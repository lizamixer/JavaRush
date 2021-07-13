package level9;

//Введи с клавиатуры два числа - m и n.
//Используя цикл for, выведи на экран прямоугольник размером m на n из восьмёрок.

import java.util.Scanner;

public class Z14 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int m1=m; m1!=0; m1--) {
            for (int n1=n; n1!=0; n1--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
