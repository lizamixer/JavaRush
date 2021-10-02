package JavaCore.level22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Поиск данных внутри файла
Считать с консоли имя файла.
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int).
Закрыть потоки.
В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity
где id - int.
productName - название товара, может содержать пробелы, String.
price - цена, double.
quantity - количество, int.
Информация по каждому товару хранится в отдельной строке.
Пример содержимого файла:
194 хлеб 12.6 25
195 масло сливочное 52.2 12
196 молоко 22.9 19
Пример вывода для id = 195:
195 масло сливочное 52.2 12

Requirements:
1. Программа должна считать имя файла с консоли.
2. Создай для файла поток для чтения.
3. Программа должна найти в файле и вывести информацию о id, который передается первым параметром.
4. Поток для чтения из файла должен быть закрыт.
 */

public class Z29_ARGSIO {
    public static void main(String args[]) throws IOException {
        int index = Integer.parseInt(args[0]);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file = console.readLine();

        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        StringBuilder stringBuilder = null;
        String line = reader.readLine();
        while (line != null) {
            stringBuilder = new StringBuilder(line);
            stringBuilder.delete(line.indexOf(" "), line.length());
            if (Integer.parseInt(stringBuilder.toString()) == index) {
                System.out.println(line);
                break;
            } else line = reader.readLine();
        }

        console.close();
        reader.close();
        fr.close();
    }
}
