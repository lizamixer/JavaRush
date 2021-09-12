package HerbertSchildt.Exercises;

//сортировка массива строк
public class Gl5_Z4 {
    public static void main(String[] args) {
        String[] stroki = {"я", "люблю", "есть", "кашу", "с", "маслом", "утром"};

//        Arrays.sort(stroki);
//        for (String s : stroki) {
//            System.out.print(s + " ");
//        }

        //пузырьковая сортировка массива
        int a, b;
        String t;

        for (a = 1; a < stroki.length; a++) {
            for (b = stroki.length - 1; b >= a; b--) {
                if (stroki[b - 1].compareTo(stroki[b]) > 0) {
                    t = stroki[b - 1];
                    stroki[b - 1] = stroki[b];
                    stroki[b] = t;
                }
            }
        }
        for (String s : stroki) {
            System.out.print(s + " ");
        }
        System.out.println("i love kasha".indexOf(5));
    }
}
/*
Метод compareTo в Java сравнивает вызывающий объект с объектом, переданным в качестве параметра,
и возвращает в результате выполнения сравнения целое число:

    -положительное, если вызывающий объект больше объекта, переданного в качестве параметра;
    -отрицательное, если вызывающий объект меньше объекта, переданного в качестве параметра;
    -нуль, если объекты равны.
 */
