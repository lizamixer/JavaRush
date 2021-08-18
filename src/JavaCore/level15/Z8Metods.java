package level15;

//Напиши public static методы: int min(int, int), long min(long, long), double min(double, double).
//Каждый метод должен возвращать минимальное из двух переданных в него чисел.
//Requirements:
//1. Программа не должна выводить текст на экран.
//2. Класс Solution должен содержать четыре метода.
//3. Класс Solution должен содержать статический метод int min(int, int).
//4. Метод int min(int, int) должен возвращать минимальное из двух чисел типа int.
//5. Класс Solution должен содержать статический метод long min(long, long).
//6. Метод long min(long, long) должен возвращать минимальное из двух чисел типа long.
//7. Класс Solution должен содержать статический метод double min(double, double).
//8. Метод double min(double, double) должен возвращать минимальное из двух чисел типа double.

public class Z8Metods {
    public static void main(String[] args) {

    }

    public static int min(int q, int w) {
        if (q > w) {
            return w;
        } else
            return q;
    }

    public static long min(long e, long r) {
        if (e > r) {
            return r;
        } else
            return e;
    }

    public static double min(double t, double y) {
        if (t > y) {
            return y;
        } else
            return t;
    }
    //Напишите тут ваши методы
}
