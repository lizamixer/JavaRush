package JavaCore.level23;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Замена чисел
1. В статическом блоке инициализировать словарь map парами [число-слово] от 0 до 12 включительно.
Например, 0 - "ноль", 1 - "один", 2 - "два"
2. Считать с консоли имя файла, считать содержимое файла.
3. Заменить все числа на слова используя словарь map.
4. Результат вывести на экран.
5. Закрыть потоки.
Пример данных в файле:
Это стоит 1 бакс, а вот это - 12.
Переменная имеет имя file1.
110 - это число.
Пример вывода в консоль:
Это стоит один бакс, а вот это - двенадцать.
Переменная имеет имя file1.
110 - это число.

Requirements:
1. Класс Solution должен содержать публичное статическое поле map типа Map<Integer, String>, которое должно быть сразу проинициализировано.
2. Программа должна считывать имя файла с консоли (используй BufferedReader).
3. BufferedReader для считывания данных с консоли должен быть закрыт.
4. Программа должна считывать содержимое файла (используй FileReader).
5. Поток чтения из файла (FileReader) должен быть закрыт.
6. Программа должна выводить в консоль все строки из файла, но числа должны быть заменены на слова из словаря map.
7. Класс Solution должен содержать статический блок, в котором добавляются в map тринадцать пар.
 */

public class Z25_RegexReplaceString {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader2 = new BufferedReader(new FileReader(reader.readLine()))) {

            String line;
            while ((line = reader2.readLine()) != null) {

                //другой вариант решения, который более затратный, если мапа будет большой
//                for (Map.Entry<Integer, String> entry : map.entrySet()) {
//                    line  = line.replaceAll("\\b" + entry.getKey()+ "\\b", entry.getValue());
//                }
                /*
                перед единицей стоит оператор ИЛИ
                ИЛИ число состоящее из любой одной цифры \\d от 0 до 9
                или если оно двузначное то начинается СТРОГО на ЕДИНИЦУ но после нее может быть только 0, 1 или 2 что
                соответствует числам 10, 11 и 12 как и в условии задачи
                _____
                обычный паттерн \\b\\d+\\b не работает
                 */
                Pattern pattern = Pattern.compile("\\b(\\d|1[0-2])\\b");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String match = matcher.group();
                    line = line.replaceAll("\\b" + match + "\\b", map.get(Integer.parseInt(match)));
                }

                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
