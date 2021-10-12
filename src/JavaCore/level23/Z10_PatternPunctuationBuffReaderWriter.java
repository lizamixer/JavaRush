package JavaCore.level23;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.
Результат вывести во второй файл.
Закрыть потоки.

Requirements:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл содержимое первого файла, где удалены все знаки пунктуации, включая символы новой строки (Для записи в файл используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
 */

public class Z10_PatternPunctuationBuffReaderWriter {
    public static void main(String[] args) throws IOException {
        String file1;
        String file2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        }

        Pattern pattern = Pattern.compile("\\p{P}");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String line2 = line.replaceAll("\\p{P}", "");
                    bufferedWriter.write(line2);
                }
            }
        }
    }
}

