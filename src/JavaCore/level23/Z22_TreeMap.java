package JavaCore.level23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/*
Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров

Requirements:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль имена, у которых максимальная сумма.
 */

public class Z22_TreeMap {
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

        double maxSumm = 0;
        for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
            double value = entry.getValue();
            if (value > maxSumm) {
                maxSumm = value;
            }
        }

        for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if (value == maxSumm) {
                System.out.println(key);
            }
        }
    }
}
