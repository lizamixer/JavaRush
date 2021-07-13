package level13;

//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:

public class Z8Exception {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}
