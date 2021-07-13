package level15;

//Реализуй два метода: print(int) и print(Integer).
//Напиши такой код в методе main(), чтобы вызвались оба.
//Requirements:
//1. Класс Solution должен содержать статический метод main().
//2. Класс Solution должен содержать статический void метод print() с параметром типа int.
//3. Класс Solution должен содержать статический void метод print() с параметром типа Integer.
//4. Метод main() должен вызывать метод print() с параметром типа int.
//5. Метод main() должен вызывать метод print() с параметром типа Integer.

public class Z7Metods {
    public static void main(String[] args) {
        int o = 6;
        Integer a = 8;
        print(o);
        print(a);
    }

    public static void print(int o) {
        System.out.println(o);
    }

    public static void print(Integer a) {
        System.out.println(a);
    }
    //Напишите тут ваши методы
}
