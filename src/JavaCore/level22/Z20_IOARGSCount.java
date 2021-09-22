package JavaCore.level22;

import java.io.FileInputStream;
import java.io.IOException;

/*
Английские буквы
В метод main первым параметром приходит путь к файлу.
Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
Вывести на экран число (количество символов).
Закрыть потоки.

Requirements:
1. Считывать с консоли ничего не нужно.
2. Создай поток чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать количество символов, которые соответствуют буквам английского алфавита, и вывести
это число в консоль.
4. Нужно учитывать заглавные и строчные буквы.
5. Поток чтения из файла должен быть закрыт.
 */

public class Z20_IOARGSCount {
    public static void main(String[] args) throws IOException {
        int count = 0;
        FileInputStream inputStream = new FileInputStream(args[0]);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > 64 && data < 123) count++;
        }
        System.out.println(count);
        inputStream.close();
    }
}
