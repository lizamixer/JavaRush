package JavaCore.level22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться минимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
 */

public class Z2_MinByte {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        int x = Character.MAX_VALUE;
        FileInputStream inputStream = new FileInputStream(line);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (x > data) {
                x = data;
            }
        }

        reader.close();
        inputStream.close();
        System.out.println((byte) x);
    }
}