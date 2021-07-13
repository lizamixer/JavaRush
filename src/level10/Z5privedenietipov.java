package level10;

public class Z5privedenietipov {
    //было
    /*
    int a = 50;
    int b = 17;
    double d = a / b;
        System.out.println(d);
     */

    //cтало
    public static void main(String[] args) {
        int a = 50;
        int b = 17;
        double d = (double) a / b;
        System.out.println(d);
    }
}
