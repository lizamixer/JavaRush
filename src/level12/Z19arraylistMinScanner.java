package level12;

//Ввести с клавиатуры число N.
//Считать N целых чисел и заполнить ими список — метод getIntegerList.
//Найти минимальное число среди элементов списка — метод getMinimum.

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Z19arraylistMinScanner {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        // Найти минимум тут
        int x = Collections.min(list);
        return x;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }
}
