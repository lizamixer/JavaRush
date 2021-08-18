package level18Core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//Давай найдем наибольший общий делитель (НОД). Для этого:
//Введи с клавиатуры 2 целых положительных числа.
//Выведи в консоли наибольший общий делитель.
//Requirements:
//1. Программа должна считывать с клавиатуры 2 строки.
//2. Если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
//3. Программа должна выводить данные на экран.
//4. Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться.

public class Z27ExceptionNOD {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = Integer.valueOf(sc.nextLine());
        int y = Integer.valueOf(sc.nextLine());
        int nod = 0;

        try {
            if (x > 0 || y > 0) {
                while (x != 0 && y != 0) {
                    if (x > y) {
                        x = x % y;
                    } else {
                        y = y % x;
                    }
                    nod = x + y;
                }
            }
            System.out.println(nod);

        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }

}
/*
другое решение
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());

        System.out.println(getNOD(first, second));
    }

    private static int getNOD(int first, int second) {
        if (first < 1 || second < 1) {
            throw new IllegalArgumentException();
        }

        while (first != second) {
            if (first > second) {
                first -= second;
            }
            if (second > first) {
                second -= first;
            }
        }
        return first;
    }
}
 */