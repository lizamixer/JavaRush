package level9;

//Используя цикл for, выведи на экран чётные числа от 1 до 100 включительно.
//Каждое значение выведи с новой строки.

public class Z13 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 2 <= 0) {
                System.out.println(i);
            }
        }
    }
}

