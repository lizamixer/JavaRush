package JavaCore.level23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Перевертыши
1. Считать с консоли имя файла. Считать содержимое файла.
2. Для каждой строки в файле:
2.1. переставить все символы в обратном порядке.
2.2. вывести на экран.
3. Закрыть потоки.
Пример тела входного файла:
я - программист.
Амиго
Пример результата:
.тсиммаргорп - я
огимА

Requirements:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль все символы из файла в обратном порядке.
 */

public class Z19_SBReverse {
    public static void main(String[] args) {
        String line = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader(line)) {
            BufferedReader reader = new BufferedReader(fileReader);
            while ((line = reader.readLine()) != null) {
                StringBuilder sb = new StringBuilder(line);
                sb.reverse();
                System.out.println(sb);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
