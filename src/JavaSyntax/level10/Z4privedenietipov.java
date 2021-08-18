package level10;

//Убери ненужные операторы приведения типа, чтобы получился ответ: result: 1000.0.

public class Z4privedenietipov {
    public static void main(String[] args) {
        //было
        /*
        double d = (short) 2.50256e2d;
        char c = (short) 'd';
        short s = (short) 2.22;
        int i = (short) 150000;
        float f = (short) 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
         */

        //стало
        double d = (short) 2.50256e2d;
        char c = (short) 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
}