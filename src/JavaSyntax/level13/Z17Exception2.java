package level13;

//Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
//В методе handleExceptions вызови метод BEAN.methodThrowExceptions и обработай исключения:
//2.1. Если возникло исключение FileSystemException, то логируй его (вызови метод BEAN.log) и пробрось дальше,
//2.2. Если возникло исключение CharConversionException или любое другое IOException, то только логируй его (вызови метод BEAN.log).
//Добавь в объявление метода handleExceptions класс исключения, которое ты пробрасываешь в п.2.1.
//В методе main обработай оставшееся исключение — логируй его (вызови метод BEAN.log). Используй try..catch.
//Подсказка:
//Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
//catch (MyException e) {
//throw e;}

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Z17Exception2 {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            handleExceptions();
        }
        catch (FileSystemException e) {
            BEAN.log(e);
        }
    }

    public static void handleExceptions() throws FileSystemException{
        try {
            BEAN.methodThrowExceptions();
        }
        catch (FileSystemException e) {
            BEAN.log(e);
            throw e;
        }
        catch (CharConversionException e) {
            BEAN.log(e);
        }
        catch (IOException e) {
            BEAN.log(e);
        }
    }

    public static class StatelessBean {

        public int i = (int) (Math.random() * 3);

        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
