package level9;//Реализуй статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
//Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.
//Расстояние между точками рассчитывается по формуле:

public class Z80calc {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double xx = (x2-x1)*(x2-x1);
        double yy = (y2-y1)*(y2-y1);
        return Math.sqrt(xx+yy);
    }

    public static void main(String[] args) {
        //System.out.println(getDistance(4,5,7,10));
    }
}