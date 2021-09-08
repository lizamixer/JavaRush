package JavaCore.level22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.
Подсказка:
нужно сравнивать с ascii-кодом символа ','.

Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должно выводится число запятых в считанном файле.
4. Поток чтения из файла должен быть закрыт.
 */

public class Z7_InputCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        int count = 0;
        FileInputStream inputStream = new FileInputStream(line);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == 44) count++;
        }
        System.out.println(count);
        reader.close();
        inputStream.close();
    }
}

