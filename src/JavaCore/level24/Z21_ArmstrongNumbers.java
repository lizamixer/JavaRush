package JavaCore.level24;


/*
Алгоритмы-числа
Число S состоит из M цифр, например, S=370 и M (количество цифр) = 3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень.
getNumbers должен возвращать все такие числа в порядке возрастания.

Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8
На выполнение дается 10 секунд и 50 МБ памяти.
Метод main не участвует в тестировании.

Requirements:
1. В классе Solution должен присутствовать метод public static long[] getNumbers(long N)
2. В методе getNumbers не должно возникать исключений, при любых входных данных.
3. Все найденные числа должны быть строго меньше N.
4. Метод getNumbers должен возвращать массив чисел удовлетворяющих условию задачи.
 */

import java.util.Arrays;

public class Z21_ArmstrongNumbers {
    public static long[] getNumbers(long N) {
        long[] result = null;

        int numberCount = 0;
        long number = N;
        while (number > 0) {
            number /= 10;
            numberCount++;
        }
        number = N;
        long[] numbers = new long[numberCount];
        for (int i = 0; i < numberCount; i++) {
            while (number > 0) {
                number /= 10;
                System.out.println(number);
            }
            numbers[i] = number;
        }

        long[][] powers = new long[9][numberCount];
        for (int i = 0; i < powers.length; i++) {
            for (int j = 0; j < numberCount; j++) {
                if (j == 0) powers[i][j] = i + 1;
                else powers[i][j] = powers[i][j - 1] * powers[i][0];
                System.out.print(powers[i][j] + " ");
            }
            System.out.println();
        }


        return result;
    }

    public static void main(String[] args) {
        //long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
//        long b = System.currentTimeMillis();
//        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
//        System.out.println("time = " + (b - a) / 1000);
//
//        a = System.currentTimeMillis();
//        System.out.println(Arrays.toString(getNumbers(1000000)));
//        b = System.currentTimeMillis();
//        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
//        System.out.println("time = " + (b - a) / 1000);
    }
}

