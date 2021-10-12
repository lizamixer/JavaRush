package JavaCore.level23;

import java.io.*;
import java.util.ArrayList;

/*
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).
Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод

Requirements:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна записывать во второй файл все символы из первого файла с четным порядковым номером (используй FileWriter).
6. Поток записи в файл (FileWriter) должен быть закрыт.
 */

public class Z6_FileReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(file1);

        ArrayList<Character> arr = new ArrayList<>();
        while (fileReader.ready()) {
            int data = fileReader.read();
            arr.add((char) data);
        }

        fileReader.close();

        FileWriter fileWriter = new FileWriter(file2);
        for (int i = 1; i < arr.size(); i = i + 2) {
            fileWriter.write(arr.get(i));
        }
        fileWriter.close();
    }
}
