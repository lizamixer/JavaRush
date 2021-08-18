package level9;//Написать функцию, которая возвращает минимум из двух чисел.
//Подсказка:
//Нужно написать тело существующей функции min.

public class Z41_MethodMin {
    public static int min(int a, int b) {
        return Math.min(a,b);
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
