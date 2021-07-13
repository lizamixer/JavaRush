package level9;////задача на переменные класса и переменные локальные

public class Z47MathSqrt {
public static void main(String[] args) {
    int[] array = {15,64,9,51,42};
    printSqrt(array);
}

    public static void printSqrt(int[] array) {
        String elementSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elSqrt = Math.sqrt(element);
            System.out.println(elementSqrt + element + " равен " + elementSqrt);
        }
    }
}
