package level9;

//В классе ConsoleReader реализуй четыре статических метода:
//String readString() – читает с клавиатуры строку;
//int readInt() – читает с клавиатуры число;
//double readDouble() – читает с клавиатуры дробное число;
//boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает
// соответствующую логическую переменную — true или false.
//Внимание: создавай переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.

import java.util.Scanner;

public class Z79scanner {
    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        return a;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        return b;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();
        return c;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean d = scanner.nextBoolean();
        return d;
    }

    public static void main(String[] args) throws Exception {

    }
}
