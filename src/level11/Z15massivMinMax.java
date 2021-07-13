package level11;

//Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
//Вывести на экран максимальное и минимальное числа через пробел.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Z15massivMinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = Arrays.stream(array).max().getAsInt();
        int minimum = Arrays.stream(array).min().getAsInt();


        System.out.print(maximum + " " + minimum);
    }
}