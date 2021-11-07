package JavaCore.level23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/*
Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.
Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.
Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0

Requirements:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль каждое имя и сумму всех его значений, все данные должны быть отсортированы в
возрастающем порядке по имени.
 */

public class Z17_MapReplay {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> treeMap = new TreeMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(" ");
                if (treeMap.get(str[0]) == null) {
                    treeMap.put(str[0], Double.parseDouble(str[1]));
                } else {
                    double summ = treeMap.get(str[0]) + Double.parseDouble(str[1]);
                    treeMap.replace(str[0], summ);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        treeMap.forEach((a, b) -> System.out.println(a + " " + b));
    }
}
