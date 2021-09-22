package JavaCore.level22;

import java.io.*;

/*
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.

Requirements:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */

public class Z8_IOHalfOfTheFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);

        byte[] buffer = new byte[inputStream.available()];
        int size = inputStream.read(buffer);

        if (size % 2 == 0) {
            outputStream1.write(buffer, 0, size / 2);
            outputStream2.write(buffer, size / 2, size - (size / 2));//третий параметр  - это количество байт, которое будет записано из массива, а не индекс массива, до которого будут записываться данные.
        } else {
            outputStream1.write(buffer, 0, size / 2 + 1);
            outputStream2.write(buffer, size / 2 + 1, size / 2);
        }

        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
/*
        int halfOfFile = (inputStream.available() + 1) / 2;
        int numberOfByte = 0;
        while (inputStream.available() > 0) {
            if (numberOfByte < halfOfFile) {
                outputStream1.write(inputStream.read());
                numberOfByte++;
            } else outputStream2.write(inputStream.read());
        }
    }
}
 */