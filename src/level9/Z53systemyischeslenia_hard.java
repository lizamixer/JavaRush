package level9;

//Публичный статический метод toHex(int) должен переводить целое число,
// полученное в качестве входящего параметра, из десятичной системы
// счисления в шестнадцатеричную и возвращать его строковое представление.
// А публичный статический метод toDecimal(String) наоборот — из строкового
// представления шестнадцатеричного числа в десятичное число.
//Методы работают только с положительными числами и не пустыми строками.
// Если входящий параметр меньше или равен 0, метод toHex(int) возвращает пустую строку.
// Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
//Твоя задача реализовать эти методы.
//Также в классе Solution есть константа HEX, которая содержит в себе все символы, используемые в шестнадцатеричной системе.

public class Z53systemyischeslenia_hard {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        String hexNumber = "";
        //Метод split в Java разделяет строку на подстроки, используя разделитель,
        // который определяется с помощью регулярного выражения. Разделителем здесь является ничто
        if (decimalNumber > 0) {
            while (decimalNumber != 0){
                int index = decimalNumber % 16;
                // index = 8
                // index = 14
                // index = 4
                char x = HEX.charAt(index);//выводит значение по указанному индексу
                // x = 8
                // x = e
                // x = 4
                hexNumber = x + hexNumber;
                // hexNumber = 8
                // hexNumber = e8
                // hexNumber = 4e8
                decimalNumber = decimalNumber / 16;
                //decimalNumber = 78
                //decimalNumber = 4
                //decimalNumber = 0

            }
            return hexNumber;
        } else {
            return "";
        }
    }

    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        int decimalNumber = 0;
        if (hexNumber == null || hexNumber.isEmpty()) {
            return 0;
        }
        else {
            for (int i = 0; i < hexNumber.length(); i++) {
                int index = HEX.indexOf(hexNumber.charAt(i));
                //charAt(i) возвращает значение чар по указанному индексу
                //Метод int indexOf(int ch) возвращает индекс в данной строке первого вхождения указанного символа
                // index = 0
                decimalNumber = 16 * decimalNumber + index;
                //decimalNumber = 16 * 0 + 0;
                //decimalNumber = 16 * 1 + 1;
                //decimalNumber = 16 * decimalNumber + index;
                //decimalNumber = 16 * 274 + 3;
                //НЕПОНЯТНО
            }
            return decimalNumber;
        }
    }
}
