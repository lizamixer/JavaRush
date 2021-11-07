package JavaCore.level23;

/*
Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со словами, разделенными пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
Закрыть потоки.

Requirements:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна записывать во второй файл все слова из первого файла которые содержат цифры (используй FileWriter).
5. Поток записи в файл (FileWriter) должен быть закрыт.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Z23_Regex {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(args[0]);
             FileWriter fileWriter = new FileWriter(args[1])) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] str = line.split(" ");
                Pattern p = Pattern.compile(".*[0-9].*");
                for (String s: str) {
                    Matcher m = p.matcher(s);
                    while (m.find()) {
                        fileWriter.write(m.group() + " ");
                    }
                }

            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
