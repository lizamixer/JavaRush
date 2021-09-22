package JavaCore.level22;

import java.io.FileInputStream;
import java.io.IOException;

/*
Пробелы
В метод main первым параметром приходит путь к файлу.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, отбросив дробную часть далее 2 знаков после запятой.
4. Закрыть потоки.

Requirements:
1. Считывать с консоли ничего не нужно.
2. Создай поток чтения из файла, который приходит первым параметром в main.
3. Посчитай отношение пробелов ко всем символам в файле и выведи в консоль это число.
4. Выведенное значение необходимо округлить в меньшую сторону до 2 знаков после запятой.
5. Поток чтения из файла должен быть закрыт.
 */

public class Z21_InputStringFormat {
    public static void main(String[] args) throws IOException {
        int ch = 0;
        int whiteSpace = 0;

        FileInputStream inputStream = new FileInputStream(args[0]);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data != 32) ch++;
            else whiteSpace++;
        }
        int summ = whiteSpace + ch;

        float f = ((float) whiteSpace / (float) summ) * 100;
        String result = String.format("%.2f",f);

        System.out.println(result);
        inputStream.close();
    }
}
