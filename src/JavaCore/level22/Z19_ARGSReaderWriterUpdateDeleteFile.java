package JavaCore.level22;

import java.io.*;
import java.util.ArrayList;

/*
Прайсы 2
CRUD для таблицы внутри файла.
Напиши программу, которая считывает с консоли путь к файлу для операций CRUD и при запуске в зависимости от флага, переданного в параметрах обновляет данные товара с заданным id или производит физическое удаление товара с заданным id (удаляет из файла все данные, которые относятся к переданному id).
-u id productName price quantity
-d id
Значения параметров:
-u - флаг, который означает обновление данных товара с заданным id
-d - флаг, который означает физическое удаление товара с заданным id (из файла удаляются все данные, которые относятся к переданному id)
id - id товара, 8 символов
productName - название товара, 30 символов
price - цена, 8 символов
quantity - количество, 4 символа
В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины.
Для чтения и записи файла нужно использовать FileReader и FileWriter соответственно.
Пример содержимого файла:
19847   Шорты пляжные синие           159.00  12
198479  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234

Requirements:
1. Программа должна считать имя файла для операций CRUD с консоли.
2. При запуске программы без параметров список товаров должен остаться неизменным.
3. При запуске программы с параметрами "-u id productName price quantity" должна обновится информация о товаре в файле.
4. При запуске программы с параметрами "-d id" строка товара с заданным id должна быть удалена из файла.
5. Созданные для файлов потоки должны быть закрыты.
 */

public class Z19_ARGSReaderWriterUpdateDeleteFile {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file = console.readLine();

        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        //нахожу нужную нам строку по айдишнику
        String number = null;
        int id = 0;
        String line = reader.readLine();

        while (line != null) {
            number = line.substring(0, 8).trim();
            id = Integer.parseInt(number);
            if (id != Integer.parseInt(args[1])) {
                line = reader.readLine();
            } else {
                break;
            }
        }
        fr.close();
        console.close();
        reader.close();

        if (args[0].equals("-u")) {
            StringBuilder newId = new StringBuilder(Integer.toString(id));
            while (newId.length() < 8) {
                newId.append(" ");
            }

            //создаю лист с данными из файла без измененной строки
            FileReader fr2 = new FileReader(file);
            BufferedReader reader2 = new BufferedReader(fr2);
            ArrayList<String> list = new ArrayList<>();
            int index = 0;
            int n = 0;
            String line2 = reader2.readLine();
            while (line2 != null) {
                if (line2.equals(line)) {
                    index = n;
                }
                n++;
                list.add(line2);
                line2 = reader2.readLine();
            }

            StringBuilder newLine = new StringBuilder();
            //создаем название товара
            StringBuilder productName = new StringBuilder(args[2]);
            if (productName.length() > 30) {
                productName.delete(30, productName.length());
            } else if (productName.length() < 30) {
                while (productName.length() < 30) {
                    productName.append(" ");
                }
            }

            //создаем цену
            StringBuilder price = new StringBuilder(args[3]);
            if (price.length() > 8) {
                price.delete(8, price.length());
            } else if (price.length() < 8) {
                while (price.length() < 8) {
                    price.append(" ");
                }
            }

            //создаем кол-во товара
            StringBuilder quantity = new StringBuilder(args[4]);
            if (quantity.length() > 4) {
                quantity.delete(4, quantity.length());
            } else if (quantity.length() < 4) {
                while (quantity.length() < 4) {
                    quantity.append(" ");
                }
            }

            newLine.append(newId).append(productName).append(price).append(quantity);
            list.set(index, newLine.toString());

            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < list.size(); i++) {
                fw.write(list.get(i) + "\n");
            }

            fr2.close();
            reader2.close();
            fw.close();

        } else if (args[0].equals("-d")) {
            FileReader fr3 = new FileReader(file);
            BufferedReader reader3 = new BufferedReader(fr3);
            ArrayList<String> list = new ArrayList<>();
            String line2 = reader3.readLine();
            while (line2 != null) {
                if (!line2.equals(line)) {
                    list.add(line2);
                }
                line2 = reader3.readLine();
            }

            FileWriter fw2 = new FileWriter(file);
            for (int i = 0; i < list.size(); i++) {
                fw2.write(list.get(i) + "\n");
            }

            fr3.close();
            reader3.close();
            fw2.close();
        }
    }
}
///Users/elizavetaandryushina/Desktop/Liza.txt
