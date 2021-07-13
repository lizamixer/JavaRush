package level13;

//Есть четыре класса MyException, MyException2, MyException3, MyException4.
//Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.

import java.io.FileNotFoundException;
import java.net.SocketException;

public class Z18Exception2 {
    public static void main(String[] args) {
    }

    static class MyException extends NumberFormatException {
    }

    static class MyException2 extends ArithmeticException {
    }

    static class MyException3 extends SocketException {
    }

    static class MyException4 extends FileNotFoundException {
    }
}

