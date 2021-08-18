package level9;//Публичный статический метод toBinary(int) должен переводить целое число,
// полученное в качестве входящего параметра, из десятичной системы счисления
// в двоичную и возвращать его строковое представление. А публичный статический
// метод toDecimal(String) наоборот — из строкового представления двоичного числа в десятичное число.
//Методы работают только с положительными числами и не пустыми строками.
// Если входящий параметр меньше или равен 0, метод toBinary(int) возвращает
// пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
//Твоя задача — реализовать эти методы.

public class Z52_SS {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        //Поле MAX_VALUE — это константа, которая содержит максимальное значение примитива int: (2^31-1 = 2147483647).
        //Класс Class<Integer> TYPE — это экземпляр класса, который представляет тип int.
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        if (decimalNumber > 0) {
            while (decimalNumber != 0) {
                binaryNumber = decimalNumber % 2 + binaryNumber;
                decimalNumber = decimalNumber / 2;
            }
            return binaryNumber;
        } else {
            return "";
        }
    }

    public static int toDecimal(String binaryNumber) {
        int decimalNumber = 0;
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            //isEmpty проверка на пустое поле
            return 0;
        }
        else {
            for (int i = 0; i < binaryNumber.length(); i++) {
                int y = Character.getNumericValue(binaryNumber.charAt(binaryNumber.length() - 1 - i));
                // Character.getNumericValue - Иногда возникают ситуации, когда имея величину какого-либо
                // определенного типа, необходимо присвоить ее переменной другого типа

                // binaryNumber.charAt - char charAt(int index) возвращает значение char
                // по указанному индексу. Индекс колеблется от 0 до length()-1

                //все равно не ясно почему нам надо переводить инт в чар а потом в итоге все равно это записывать в инт у
                //зачем нам вообще делать этот getNumericValue когда там и так 0 1 1 1 0
                decimalNumber = decimalNumber + y * (int) Math.pow(2, i);
                // x = 0+0+1(допустим или может быть 0)*2в0=
            }
            return decimalNumber;
        }
    }
}

