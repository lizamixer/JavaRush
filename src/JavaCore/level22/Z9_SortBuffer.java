package JavaCore.level22;

import java.io.*;

/*
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.

Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */

public class Z9_SortBuffer {
    /*
    public static void reverseArray(byte[] array) {
    for (byte i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - i - 1] = (byte) temp;
    }
}
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available() > 0) {
            int count = inputStream.read(buffer);
            for (byte i = 0; i < buffer.length / 2; i++) {
                int temp = buffer[i];
                buffer[i] = buffer[buffer.length - i - 1];
                buffer[buffer.length - i - 1] = (byte) temp;
            }
            outputStream.write(buffer, 0, count);
        }

        reader.close();
        inputStream.close();
        outputStream.close();
    }
}

