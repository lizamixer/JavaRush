package JavaCore.level22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
 */

public class Z3_DuplicateBytesMax {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        byte[] bytes = new byte[255];
        byte data;
        FileInputStream inputStream = new FileInputStream(line);
        while (inputStream.available() > 0) {
            data = (byte) inputStream.read();
            bytes[data]++; //в индекс массива кладем +1. если таких будет несколько то число будет увеличиваться
        }

        int maxValue = bytes[0];
        for (int i = 0; i < bytes.length; i++) {
            int value = (int) bytes[i];
            if (value > maxValue)
                maxValue = value;
        }

        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == maxValue) {
                System.out.print(i + " ");
            }
        }

        reader.close();
        inputStream.close();
    }
}
