package JavaCore.level22;

import java.io.*;

/*
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.

Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Не используй в программе статические переменные.
3. Для первого файла создай поток для чтения и считай его содержимое.
4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
5. Содержимое первого и второго файла нужно объединить в первом файле.
6. Сначала должно идти содержимое второго файла, затем содержимое первого.
7. Созданные для файлов потоки должны быть закрыты.
 */
public class Z23_IOTheBeginningOfTheFile {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();

        FileInputStream inputStream = new FileInputStream(file2);
        FileInputStream inputStream2 = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file1);

        byte[] buffer = new byte[inputStream.available()];
        byte[] buffer2 = new byte[inputStream2.available()];
        inputStream.read(buffer);
        inputStream2.read(buffer2);

        outputStream.write(buffer);
        outputStream.write(buffer2);

        console.close();
        inputStream.close();
        inputStream2.close();
        outputStream.close();
    }
}
/*
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream fileInputStream1 = new FileInputStream(fileName1);
             FileInputStream fileInputStream2 = new FileInputStream(fileName2)) {

            while (fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
 */
