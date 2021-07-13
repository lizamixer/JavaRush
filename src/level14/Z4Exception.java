package level14;

//Создай метод public static void divideByZero, в котором подели любое целое число на ноль и выведи на экран результат деления.
//Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения, используя метод exception.printStackTrace().

public class Z4Exception {
    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static void divideByZero() {
        System.out.println(4/0);
    }
}