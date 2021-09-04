package level9;

//Выведи на экран квадрат из 10х10 букв S, используя цикл while. Буквы в каждой строке не разделяй пробелами.

public class Z11 {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 0;
        int b = 0;

        while (a++ < 10){
            while (b++ < 9) {
                    System.out.print("S");
                }
            System.out.println("S");
            b=0;
        }
    }
}

