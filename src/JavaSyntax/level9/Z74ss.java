package level9;//Поскольку компьютеры оперируют только цифрами 1 (есть электричество) и 0 (электричества нет),
// есть необходимость переводить данные, понятные человеку, в данные, понятные машине.
// Цифры, символы и спецсимволы имеют свой номер (десятичное число) в таблице Unicode.
//Реализуй метод toBinary(int), который переводит десятичное число, полученное на вход, в двоичное,
//и возвращает его строковое представление.
//К примеру, строка JavaRush имеет следующее представление в двоичном виде (каждый символ с новой строки):
//J - 1001010
//a - 1100001
//v - 1110110
//a - 1100001
//R - 1010010
//u - 1110101
//s - 1110011
//h - 1101000

public class Z74ss {
    public static void main(String[] args) {
        String string = "JavaRush";
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            print(charArray[i]);
        }
    }

    private static void print(int number) {
        String result = String.format("Номер символа %s в таблице Unicode - %d, а в двоичной системе - %s", (char) number, number, toBinary(number));
        System.out.println(result);
    }

    public static String toBinary(int number) {
        String binaryNumber = "";
        if (number > 0) {
            while (number != 0) {
                binaryNumber = number % 2 + binaryNumber;
                number = number / 2;
            }
            return binaryNumber;
        } else {
            return "";
        }
    }
}
