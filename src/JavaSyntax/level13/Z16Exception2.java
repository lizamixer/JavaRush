package level13;

//В методе handleExceptions обработайте все unchecked исключения.
//Нужно вывести стек-трейс возникшего исключения, используя метод printStack.
//Можно использовать только один блок try..catch.

public class Z16Exception2 {
    public static void main(String[] args) {
        handleExceptions(new Z16Exception2());
    }

    public static void handleExceptions(Z16Exception2 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (RuntimeException e) {
            printStack(e);
        }
        catch (Error e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}


