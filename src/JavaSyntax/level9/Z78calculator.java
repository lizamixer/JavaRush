package level9;//В классе Calculator реализуй пять статических методов:
//int plus(int a, int b) – возвращает сумму чисел a и b;
//int minus(int a, int b) – возвращает разницу чисел a и b;
//int multiply(int a, int b) – возвращает результат умножения числа a на число b;
//double division(int a, int b) – возвращает результат деления числа a на число b;
//double percent(int a, int b) – возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4).

public class Z78calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a+b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a-b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a*b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double) a/b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (double) (a*b)/100;
    }

    public static void main(String[] args) {
        //System.out.println(percent(4,20));
    }
}