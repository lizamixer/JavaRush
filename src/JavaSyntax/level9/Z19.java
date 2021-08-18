package level9;

//Давай напишем программу, в которой нужно будет вводить числа с клавиатуры,
//и как только будет введено -1, вывести на экран сумму всех чисел и завершить программу.
//-1 должно учитываться в сумме.

import java.util.Scanner;

public class Z19 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            sum += number;
            if (number == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
}


