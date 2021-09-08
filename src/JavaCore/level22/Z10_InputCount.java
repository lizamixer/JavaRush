package JavaCore.level22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.

Requirements:
1. Программа должна считать имена файлов с консоли.
2. Для чтения из файлов используй поток FileInputStream.
3. Программа должна работать, пока введенный файл не окажется меньше 1000 байт.
4. Программа должна завершиться исключением DownloadException.
5. Поток FileInputStream должен быть закрыт.
 */

public class Z10_InputCount {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = null;

        try {
            while (true) {
                String file = reader.readLine();
                inputStream = new FileInputStream(file);
                if (inputStream.available() < 1000) {
                    throw new DownloadException();
                }
            }
        } finally {
            reader.close();
            inputStream.close();
        }
    }

    public static class DownloadException extends Exception {
    }
}
/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = null;

        try {
            while (true) {
                String file = reader.readLine();
                inputStream = new FileInputStream(file);
                byte[] buffer = new byte[inputStream.available()];

                if (inputStream.available() > 0) {
                    int count = inputStream.read(buffer);
                    if (count < 1000) {
                        throw new DownloadException();
                    }
                }
            }
        } finally {
            reader.close();
            inputStream.close();
        }
    }
 */
