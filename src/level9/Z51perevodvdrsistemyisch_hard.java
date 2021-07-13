package level9;//Публичный статический метод toOctal(int) должен переводить целое число,
// полученное в качестве входящего параметра, из десятичной системы
// счисления в восьмеричную. А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
//Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
//Твоя задача — реализовать эти методы.

public class Z51perevodvdrsistemyisch_hard {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octalNumber = 0;
        if (decimalNumber > 0) {
            int i = 0;
            while (decimalNumber != 0) {
                octalNumber = octalNumber + (decimalNumber % 8) * (int) Math.pow(10, i);
                //Math.pow(10, i) это стeпень 10 в степени i
                // х = 0 + 21%8*10в0 = 0 + 5 * 1 = 5
                // х = 5 + 2%8 * 10в1 = 5+ 2 * 10 = 25
                decimalNumber = decimalNumber / 8;
                // у = 21/8=2
                // у = 2/8=0
                i++;
            }
            return octalNumber;
        } else {
            return 0;
        }
    }

    public static int toDecimal(int octalNumber) {
        int decimalNumber = 0;
        if (octalNumber > 0) {
            int i = 0;
            while (octalNumber != 0) {
                decimalNumber = decimalNumber + (octalNumber % 10) * (int) Math.pow(8, i);
                // x = 0 + 25%10 * 8в0 = 0+5*1= 5
                // х = 5 + 2%10 * 8в1 = 5+2*8 = 21
                octalNumber = octalNumber / 10;
                // у = 25/10 = 2
                // y = 2/10 = 0
                i++;
            }
            return decimalNumber;
        } else {
            return decimalNumber;
        }
    }
}