package level14;

//Программа считывает с консоли строку и выводит ее на экран в верхнем регистре.
//Но оказывается, она не будет работать на старых версиях Java (ниже 7й версии).
//Не меняя функциональности программы, перепиши блок try-with-resources на обычный try-catch.
//Не забудь о вызове метода close() для объектов с внешними ресурсами.

import java.util.Scanner;
//стало
public class Z2tryWithResources {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
        finally
        {
            scanner.close();
        }
    }
}
/*было
public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
 */