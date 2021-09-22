package JavaCore.level22;

import java.io.*;

/*
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.

Requirements:
1. Программа должна три раза считать имена файлов с консоли.
2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
3. Содержимое второго файла нужно переписать в первый файл.
4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
5. Созданные для файлов потоки должны быть закрыты.
 */

public class Z22_IO {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();
        String file3 = console.readLine();

        FileInputStream fis1 = new FileInputStream(file2);
        FileOutputStream fos = new FileOutputStream(file1);
        int data;
        while ((data = fis1.read()) != -1) {
            fos.write(data);
        }

        FileInputStream fis2 = new FileInputStream(file3);
        while ((data = fis2.read()) != -1) {
            fos.write(data);
        }

        console.close();
        fis1.close();
        fis2.close();
        fos.close();

    }
}
/*
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
             FileInputStream fileInputStream1 = new FileInputStream(fileName2);
             FileInputStream fileInputStream2 = new FileInputStream(fileName3)) {
                while (fileInputStream1.available() > 0) {
                fileOutputStream.write(fileInputStream1.read());
            }
                while (fileInputStream2.available() > 0) {
                fileOutputStream.write(fileInputStream2.read());
            }
 */