package level10;

//При перемножении двух long чисел, результат может превысить размеры типа long.
//Если точность не важна, то одним из вариантов может быть сохранение результата в виде вещественного числа.
//Реализуй метод getSquare. Он должен возвращать квадрат входящего аргумента.

public class Z1privedenietipov {
    public static void main(String[] args) {
        System.out.println(getSquare(7)); // 49.0
        System.out.println(getSquare(100_000_001)); // 1.00000002E16
        System.out.println(getSquare(9_000_000_000_000_000_001L)); // 8.1E37
    }

    public static double getSquare(long number) {
        double n = (double) number*number;
        return n;
    }
}