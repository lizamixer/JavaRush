package level9;

import java.util.Scanner;
import java.io.IOException;
public class Z2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if(age < 18)
            System.out.println("Подрасти еще.");


    }
}
