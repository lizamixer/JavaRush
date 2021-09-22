package JavaCore.level22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/*
Прайсы
CRUD для таблицы внутри файла.
Напиши программу, которая считывает с консоли путь к файлу для операций CRUD и при запуске со следующим набором параметров:
-c productName price quantity
добавляет товар с заданными параметрами в конец файла, генерируя id (8 символов) самостоятельно
путем инкремента максимального id, найденного в файле.
Значения параметров:
-c - флаг, который означает добавления товара.
productName - название товара, 30 символов.
price - цена, 8 символов.
quantity - количество, 4 символа.
В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины.
Для чтения и записи файла нужно использовать FileReader и FileWriter соответственно.

Пример содержимого файла:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234

Requirements:
1. Программа должна считать имя файла для операций CRUD с консоли.
2. В классе Solution не должны быть использованы статические переменные.
3. При запуске программы без параметров список товаров должен остаться неизменным.
4. При запуске программы с параметрами "-c productName price quantity" в конец файла должна добавится новая строка с товаром.
5. Товар должен иметь следующий id, после максимального, найденного в файле.
6. Форматирование новой строки товара должно четко совпадать с указанным в задании.
7. Созданные для файлов потоки должны быть закрыты.
 */

public class Z18_ARGSReaderWriterSearchInAFile {
    public static void main(String[] args) throws Exception {

        if (args.length == 4) {
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String file = console.readLine();
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            //чтение строк с поиском наибольшего айдишника
            String lastLine = null;
            String number = null;
            int id1 = 0;
            int id2 = 0;
            String line = reader.readLine();
            while (line != null) {

                number = line.substring(0, 8).trim(); //поиск айдишника
                id2 = Integer.parseInt(number);
                if (id1 < id2) id1 = id2;

                line = reader.readLine();
                if (line != null) lastLine = line;
            }

            StringBuilder id = new StringBuilder(Integer.toString(++id1));
            while (id.length() < 8) {
                id.append(" ");
            }

            //создаем название товара
            StringBuilder productName = new StringBuilder(args[1]);
            if (productName.length() > 30) {
                productName.delete(30, productName.length());
            } else if (productName.length() < 30) {
                while (productName.length() < 30) {
                    productName.append(" ");
                }
            }

            //создаем цену
            StringBuilder price = new StringBuilder(args[2]);
            if (price.length() > 8) {
                price.delete(8, price.length());
            } else if (price.length() < 8) {
                while (price.length() < 8) {
                    price.append(" ");
                }
            }

            //создаем кол-во товара
            StringBuilder quantity = new StringBuilder(args[3]);
            if (quantity.length() > 4) {
                quantity.delete(4, quantity.length());
            } else if (quantity.length() < 4) {
                while (quantity.length() < 4) {
                    quantity.append(" ");
                }
            }

            StringBuilder sb = new StringBuilder();
            String stroka = sb.append("\n" + id).append(productName).append(price).append(quantity).toString();

            //если поставить FileWriter в начало, то он опустошит файл
            FileWriter fw = new FileWriter(file, true);
            for (int i = 0; i < stroka.length(); i++) {
                fw.write(stroka.charAt(i));
            }

            reader.close();
            fr.close();
            fw.close();
        }

    }
}

