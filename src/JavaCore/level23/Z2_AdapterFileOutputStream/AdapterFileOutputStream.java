package JavaCore.level23.Z2_AdapterFileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
Адаптер
Используй класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter.

Requirements:
1. AmigoStringWriter должен быть интерфейсом.
2. Класс AdapterFileOutputStream должен реализовывать интерфейс AmigoStringWriter.
3. Класс AdapterFileOutputStream должен содержать приватное поле fileOutputStream типа FileOutputStream.
4. Класс AdapterFileOutputStream должен содержать конструктор с параметром FileOutputStream.
5. Метод flush() класса AdapterFileOutputStream должен делегировать полномочие соответствующему методу fileOutputStream.
6. Метод writeString(String s) класса AdapterFileOutputStream должен делегировать полномочие соответствующему методу
write() объекта fileOutputStream.
7. Метод close() класса AdapterFileOutputStream должен делегировать полномочие соответствующему методу fileOutputStream.
 */

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream file) {
        this.fileOutputStream = file;
    }

    public static void main(String[] args) {
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }
}

/*
public class AdapterFileOutputStream implements AmigoStringWriter {

    public static void main(String[] args) {
    }

}
 */