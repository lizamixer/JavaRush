package level9;//Введи с клавиатуры имя и, используя цикл for, 10 раз выведи: <имя> любит меня.
import java.util.Scanner;

public class Z17 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        for(int i = 0; i < 10; i++) {
            System.out.print(a + " любит меня.\n");
        }

    }
}

