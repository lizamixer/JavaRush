package level9;//Напиши функцию, которая вычисляет минимум из четырёх чисел.
//Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b).
//Подсказка: нужно написать тело двух существующих функций min

public class Z43metodmin {
    public static int min(int a, int b, int c, int d) {
    //напишите тут ваш код
        int x = min(a,b);
        int y = min(c,d);
        return min(x,y);
}

    public static int min(int a, int b) {
        //напишите тут ваш код
        return Math.min(a,b);
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
