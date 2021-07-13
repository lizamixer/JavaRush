package level9;

//Выведи на экран таблицу умножения 10х10, используя любой вид циклов.
//Числа раздели пробелами.

public class Z12_2 {
    public static void main(String[] args) {
        int n = 1;
        int a = 1;
        while (n<11){
            while (a<11){
                System.out.print(n*a+" ");
                a++;
            }
            System.out.println();
            n++;
            a=1;
        }

    }
}

