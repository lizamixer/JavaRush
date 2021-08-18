package level9;

//Используя цикл for, выведи на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

public class Z15 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for(int i = 1; i < 11; i++) {
            for(int k = 0; k<i; k++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
