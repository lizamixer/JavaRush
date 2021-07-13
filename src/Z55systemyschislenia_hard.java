//Публичный статический метод toHex(String) должен переводить строковое представление двоичного числа,
// полученное в качестве входящего параметра, из двоичной системы счисления в шестнадцатеричную и
// возвращать его строковое представление. А публичный статический метод toBinary(String) наоборот —
// из строкового представления шестнадцатеричного числа в строковое представление двоичного числа.
//Методы работают только с не пустыми строками.
//Если входящий параметр — пустая строка или null, то оба метода возвращают пустую строку.
//Если входящий параметр метода toHex(String) содержит любой символ, кроме 0 или 1, то метод возвращает пустую строку.
//Если входящий параметр метода toBinary(String) содержит любой символ, кроме цифр от 0 до 9 или
// латинскую букву от a до f (в нижнем регистре), то метод возвращает пустую строку.
//Твоя задача — реализовать эти методы.
//Один из алгоритмов перевода строкового представления двоичного числа в строковое представление
// шестнадцатеричного числа следующий:
//Проверяем длину строки, полученной входящим параметром. Она должна быть кратна 4.
//Если это не так, то добавляем нужное количество 0 в начало строки.
//Берем каждые четыре символа (бита) и проверяем, какому символу шестнадцатеричной кодировки он соответствует.
/*
public class Z55systemyschislenia_hard {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        } else if (binaryNumber = 0 || binaryNumber = 1) {
            while (binaryNumber.length() % 4 != 0)
                binaryNumber = "0" + binaryNumber;
        }
            return hexNumber;
        } else {
            return "";
        }
    }


    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        } else if (for (int i = 0; i <= 9; i++) || ){
            return "";
        }
        else{

            }
            return binaryNumber;
        }
    }
}

 */