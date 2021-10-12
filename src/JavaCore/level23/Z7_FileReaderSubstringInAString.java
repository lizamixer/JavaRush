package JavaCore.level23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.

Requirements:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
 */

public class Z7_FileReaderSubstringInAString {
    public static void main(String[] args) throws IOException {
        String file;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file = reader.readLine();
        }

        StringBuilder stringBuilder = new StringBuilder();
        char buff;
        try (FileReader fileReader = new FileReader(file)) {
            while (fileReader.ready()) {
                buff = (char) fileReader.read();
                stringBuilder.append(buff);
            }
        }

        //1 вариант
        int counter = 0;
        String replacedString = stringBuilder.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
        for (String x : replacedString.split(" ")) {
            if (x.equals("world")) {
                counter++;
            }
        }

        System.out.println(counter);

//        2 вариант
//        int count = 0;
//        for (int index = stringBuilder.indexOf("world"); index >= 0; index = stringBuilder.indexOf("world", index + 1)) count++;
//        System.out.println(count);

        //3 вариант
        //System.out.println((stringBuilder.length() - stringBuilder.toString().replace("world", "").length()) / "world".length());

        //3 вариант
        //System.out.println((stringBuilder + "\0").split("world").length - 1);
    }
}
