package level13;

//Релизовать метод, который возвращает результат – глубину его стек-трейса –
//количество методов в нем (количество элементов в списке).
//Это же число нужно в методе вывести на экран.

public class Z5StackTrace {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements.length);
        return elements.length;
    }
}

