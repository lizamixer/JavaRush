package JavaCore.level22;

/*
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.
Пример байт входного файла:
44 83 44
Пример вывода:
44 83

Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Z5_DeleteDuplicateBytesSortMassiv {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        byte[] bytes = new byte[100];
        byte data;
        int k = 0;
        FileInputStream inputStream = new FileInputStream(line);
        while (inputStream.available() > 0) {
            data = (byte) inputStream.read();
            bytes[k] = data;
            k++;
        }

        Arrays.sort(bytes);
        for (int i = 0; i < bytes.length - 1; i++) {
            if (bytes[i] == bytes[i + 1]) {
                bytes[i] = 0;
            }
        }

        for (byte b : bytes) {
            if (b != 0) {
                System.out.print(b + " ");
            }
        }
        reader.close();
        inputStream.close();
    }
}

/* решение через HashSet
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        HashSet<Byte> bytes = new HashSet<Byte>();
        byte data;
        int i = 0;
        FileInputStream inputStream = new FileInputStream(line);
        while (inputStream.available() > 0) {
            data = (byte) inputStream.read();
            bytes.add(data);
            i++;
        }

        List<Byte> sortedSet = new ArrayList<Byte>(bytes);
        Collections.sort(sortedSet);

        for (Byte b : bytes) {
            if (b != 0) {
                System.out.print((byte) b + " ");
            }
        }

        reader.close();
        inputStream.close();
    }
}
 */

