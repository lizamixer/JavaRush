package level9;//Написать функцию, которая вычисляет минимум из трёх чисел.
//Подсказка:
//Нужно написать тело существующей функции min.

public class Z42metodmin {
    public static int min(int a, int b, int c) {
        int x = Math.min(a,b);
        return Math.min(x,c);
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
