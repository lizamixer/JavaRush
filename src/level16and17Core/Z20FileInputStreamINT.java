package level16and17Core;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//В этой задаче тебе нужно:
//Ввести имя файла с консоли.
//Прочитать из него набор чисел.
//Вывести в консоли только четные, отсортированные по возрастанию.
//Requirements:
//1. Программа должна считывать данные с консоли.
//2. Программа должна создавать FileInputStream для введенной с консоли строки.
//3. Программа должна выводить данные на экран.
//4. Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
//5. Программа должна закрывать поток чтения из файла — FileInputStream.

public class Z20FileInputStreamINT {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        ArrayList<Integer> strings = new ArrayList<Integer>();
        ArrayList<Integer> strings2 = new ArrayList<Integer>();

        FileInputStream file = new FileInputStream(line);
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            strings.add(scan.nextInt());
        }
        file.close();

        for (Integer value : strings) {
            if (value % 2 == 0) {
                strings2.add(value);
            }
        }
        Collections.sort(strings2);
        for (Integer value : strings2) {
            System.out.print(value + "\n");
        }
    }

}


// /Users/elizavetaandryushina/Desktop/Liza.txt