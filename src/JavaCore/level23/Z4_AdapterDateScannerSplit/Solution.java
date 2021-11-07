package JavaCore.level23.Z4_AdapterDateScannerSplit;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner. Поле инициализировать в конструкторе с одним аргументом типа Scanner.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957
В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные только одного человека.

Requirements:
1. PersonScanner должен быть интерфейсом.
2. Класс PersonScannerAdapter должен реализовывать интерфейс PersonScanner.
3. Класс PersonScannerAdapter должен содержать приватное поле fileScanner типа Scanner.
4. Класс PersonScannerAdapter должен содержать конструктор с параметром Scanner.
5. Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
6. Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.
 */

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        PersonScanner ps = new PersonScannerAdapter(new Scanner(new File("/Users/elizavetaandryushina/Desktop/Liza.txt")));
        Person person = ps.read();
        System.out.println(person);
        ps.close();

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String line = fileScanner.nextLine();
            String[] arr = line.split(" ", 4);

            String date = arr[3];
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date newDate = formatter.parse(date);

            return new Person(arr[1], arr[2], arr[0], newDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }

    }
}

