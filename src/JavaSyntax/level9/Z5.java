package level9;/*
Введи с клавиатуры целое число в диапазоне 1 - 999. Выведи его строку-описание следующего вида:

«четное однозначное число» - если число четное и имеет одну цифру;
«нечетное однозначное число» - если число нечетное и имеет одну цифру;
«четное двузначное число» - если число четное и имеет две цифры;
«нечетное двузначное число» - если число нечетное и имеет две цифры;
«четное трехзначное число» - если число четное и имеет три цифры;
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, не нужно ничего выводить на экран.
 */
import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if (b > 0 && b < 10 && (b % 2) == 0) {
            System.out.println("четное однозначное число");
        } else if (b > 0 && b < 10 && (b % 2) != 0) {
            System.out.println("нечетное однозначное число");
        } else if (b > 9 && b < 100 && (b % 2) == 0) {
            System.out.println("четное двузначное число");
        } else if (b > 9 && b < 100 && (b % 2) != 0) {
            System.out.println("нечетное двузначное число");
        } else if (b > 99 && b < 1000 && (b % 2) == 0) {
            System.out.println("четное трехзначное число");
        } else if (b > 99 && b < 1000 && (b % 2) != 0) {
            System.out.println("нечетное трехзначное число");
        }
    }
}