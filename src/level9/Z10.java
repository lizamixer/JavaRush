package level9;//Введи с клавиатуры строку и число N больше 0.
//Выведи на экран строку N раз, используя цикл while. Каждое значение - с новой строки.
import java.util.Scanner;

public class Z10 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int i=0;
        String a = scanner.nextLine();
        int b = scanner.nextInt();

        while (i<b) {
            System.out.println(a);
            i++;
        }
    }
}