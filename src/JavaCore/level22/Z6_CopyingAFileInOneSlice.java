package JavaCore.level22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Исправить ошибки
Исправить функциональность в соответствии с требованиями.
Программа должна:
1. Переписать все байты одного файла в другой одним куском.
2. Закрывать потоки ввода-вывода.
Подсказка:
4 ошибки.

Requirements:
1. Программа должна использовать классы FileInputStream и FileOutputStream.
2. Программа должна переписать все байты одного файла в другой одним куском.
3. Потоки FileInputStream и FileOutputStream должны быть закрыты.
4. Нужно исправить 4 ошибки.
 */

public class Z6_CopyingAFileInOneSlice {
    public static void main(String[] args) throws IOException {
        //FileInputStream inputStream = new FileInputStream("/Users/elizavetaandryushina/Desktop/Liza.txt");
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл

        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");
        //FileOutputStream outputStream = new FileOutputStream("/Users/elizavetaandryushina/Desktop/Liza2.txt");

        byte[] buffer = new byte[inputStream.available()];
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
/*
было
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        if (inputStream.read() >= 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.reset();
        outputStream.flush();
    }
}
 */