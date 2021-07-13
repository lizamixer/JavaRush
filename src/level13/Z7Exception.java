package level13;

//Перехватить исключение, возникающее при выполнении кода:
//int a = 42 / 0;
//Вывести на экран тип перехваченного исключения.

public class Z7Exception {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}

