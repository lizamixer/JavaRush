package level9;

//Давай создадим программу для генерации квадратных шахматных досок с заданной размерностью.
// В классе Solution дан двумерный массив символов (поле array). Необходимо:
//считать число с клавиатуры — это и будет размерность нашей будущей доски (длина стороны);
//инициализировать массив array соответствующим значением;
//"закрасить" массив так, чтобы получилась шахматная доска (черные клетки — '#', белые — '').
// Начинаем заполнять массив с '#' с верхнего левого угла;
//вывести массив на экран в таком виде, как в примере (каждую строку отдельно).

import java.io.IOException;
import java.util.Scanner;

public class Z27 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new char[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}