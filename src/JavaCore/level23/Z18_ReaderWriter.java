package JavaCore.level23;

import java.io.*;

/*
Длинные слова
В метод main первым параметром приходит путь к файлу1, вторым - путь к файлу2.
Файл1 содержит слова, разделенные пробелом или переводом строки (в файле может быть несколько строк).
Все, что не относится к пробелу или переводу строки, разделителем не считать.
Записать в одну строку через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.
Пример выходных данных в файл2:
длинное,короткое,аббревиатура

Requirements:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна записывать через запятую во второй файл все слова из первого файла длина которых строго больше 6(используй FileWriter).
5. Поток записи в файл (FileWriter) должен быть закрыт.
 */

public class Z18_ReaderWriter {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(args[0]);
             FileWriter fileWriter = new FileWriter(args[1])) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                String words[] = line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    if (words[i].length() > 6) {
                        sb.append(words[i] + ",");
                    }
                }
            }
            sb.delete(sb.length()-1, sb.length());
            fileWriter.write(String.valueOf(sb));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
