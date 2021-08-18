package level19Core;

import java.util.Scanner;

//В этой задаче тебе нужно:
//В статическом блоке считать с консоли А и В — две переменные с типом int.
//Обработать IOException в блоке catch.
//Закрыть поток ввода методом close().
//Requirements:
//1. Поле A должно быть публичным и статическим.
//2. Поле B должно быть публичным и статическим.
//3. Программа должна считывать данные с клавиатуры в статическом блоке.
//4. Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
//5. Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.

public class Z11_ExceptionCloseStatic {
    public static int A;
    public static int B;

    static {
        Scanner scanner = new Scanner(System.in);
        try {
            A = scanner.nextInt();
            B = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

}
/*
public class Solution {
    public static int A;
    public static int B;

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
 */