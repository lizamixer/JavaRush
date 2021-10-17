package JavaCore.level23;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Выделяем числа
Считать с консоли 2 пути к файлам.
Вывести во второй файл все целые числа, которые есть в первом файле (54у не является числом).
Числа выводить через пробел.
Закрыть потоки.
Пример тела файла:
12 text var2 14 8ю 1
Результат:
12 14 1

Requirements:
1. Программа должна считывать пути к файлам с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором принимающим FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
 */

public class Z8_BuffReaderBuffWriterRegex {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        Pattern pattern = Pattern.compile("(\\b\\d+\\b)");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //поиск в строке по паттерну
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    bufferedWriter.write(matcher.group() + " ");
                }
//                String[] fields = pattern.split(line);
//                for (int i = 0; i < fields.length; i++) {
//                    System.out.print(fields[i] + " ");
//                }
            }
        }


    }
}

