package level9;/*
Введи с клавиатуры два целых числа, которые будут координатами точки, не лежащей на осях OX и OY.
Выведи на экран номер координатной четверти, в которой находится данная точка.

Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:

для первой четверти - a>0 и b>0;
для второй четверти - a<0 и b>0;
для третьей четверти - a<0 и b<0;
для четвертой четверти - a>0 и b<0.
 */
import java.util.Scanner;

/*
Координатные четверти
*/

public class Z3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a>0 && b>0){
            System.out.println("1");
        }else if (a<0 && b>0){
            System.out.println("2");
        }else if (a<0 && b<0){
            System.out.println("3");
        }else if (a>0 && b<0){
            System.out.println("4");
        }
    }
}
