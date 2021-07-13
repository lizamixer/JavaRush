package level13;

//Реализовать метод log так, чтобы он выводил на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
//Имя класса, имя метода и сообщение разделить двоеточием с пробелом.
//
//Пример вывода:
//
//com.javarush.task.jdk13.task09.task0906.Solution: main: In method
//Получение имени класса из StackTraceElement:
//String className = element.getClassName();

public class Z6StackTrace {
    public static void main(String[] args) {
        log("In method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        String x = Thread.currentThread().getStackTrace()[2].getClassName();
        String y = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(x + ": " + y + ": " + text);
    }
}


