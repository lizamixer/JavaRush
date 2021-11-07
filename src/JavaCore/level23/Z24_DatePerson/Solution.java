package JavaCore.level23.Z24_DatePerson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами.

Заполнить список PEOPLE используя данные из файла.
Закрыть потоки.

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013

Requirements:
1. Класс Solution должен содержать публичную константу PEOPLE типа List<Person>, которая должна быть сразу проинициализирована.
2. Программа НЕ должна считывать данные с консоли.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна заполнить список PEOPLE данными из файла.
6. Программа должна правильно работать с двойными именами, например Анна-Надежда.
 */

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String date = null;

                Pattern pat = Pattern.compile("\\d{2}\\s\\d+\\s\\d{4}");
                Matcher matcher = pat.matcher(line);
                while (matcher.find()) {
                    date = matcher.group();
                }

                String[] name = line.split(date);
                String newName = name[0].trim();
                DateFormat format = new SimpleDateFormat("dd MM yyyy");
                Date newDate = format.parse(date);


                PEOPLE.add(new Person(newName, newDate));

            }
//            for (Person s : PEOPLE) {
//                System.out.println(s);
//            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
