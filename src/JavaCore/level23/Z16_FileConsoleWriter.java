package JavaCore.level23;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

/*
Свой FileWriter
Реализуй логику FileConsoleWriter.
Класс FileConsoleWriter должен содержать приватное поле FileWriter fileWriter.
Класс FileConsoleWriter должен содержать все конструкторы, которые инициализируют fileWriter для записи.
Класс FileConsoleWriter должен содержать пять методов write и один метод close:

public void write(char[] cbuf, int off, int len) throws IOException
public void write(int c) throws IOException
public void write(String str) throws IOException
public void write(String str, int off, int len) throws IOException
public void write(char[] cbuf) throws IOException
public void close() throws IOException
При записи данных в файл, должен дублировать эти данные на консоль.

Важно: нужно использовать 8-й уровень языка (java language level)!

Requirements:
1. Класс FileConsoleWriter должен содержать приватное поле FileWriter fileWriter, которое не должно быть сразу проинициализировано.
2. Класс FileConsoleWriter должен иметь пять конструкторов которые инициализируют fileWriter для записи.
3. Класс FileConsoleWriter должен содержать метод write(char[] cbuf, int off, int len) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
4. Класс FileConsoleWriter должен содержать метод write(int c) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
5. Класс FileConsoleWriter должен содержать метод write(String str) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
6. Класс FileConsoleWriter должен содержать метод write(String str, int off, int len) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
7. Класс FileConsoleWriter должен содержать метод write(char[] cbuf) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
8. Класс FileConsoleWriter должен содержать метод close() throws IOException, в котором должен вызываться такой же метод поля fileWriter.
 */

public class Z16_FileConsoleWriter {
    //необходимо было перечислить все конструкторы которые есть у класса FileWriter
    private FileWriter fileWriter;

    public Z16_FileConsoleWriter(String fileName) throws IOException {
        fileWriter =  new FileWriter(fileName);
    }
    public Z16_FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }
    public Z16_FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }
    public Z16_FileConsoleWriter(FileDescriptor fd) {
        fileWriter = new FileWriter(fd);
    }
    public Z16_FileConsoleWriter(String fileName, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, append);
    }

    //надо было, чтобы данные на консоль имели такую же логику как и при вызове метода FileWriter
    public void write(char[] cbuf, int off, int len) throws IOException {
        /*
        cbuf - Массив символов
        off - Смещение, с которого следует начинать чтение символов
        len - Количество символов для записи
         */
        //substring вторым параметром в отличие от write принимает до какого индекса обрезать, а не кол-во символов для записи
        fileWriter.write(cbuf, off, len);
        System.out.println(new String(cbuf).substring(off, off + len));
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println((char) c);
    }

    public void write(String str) throws IOException{
        fileWriter.write(str);
        System.out.println(str);
    }

    public void write(String str, int off, int len) throws IOException {
        /*
        str - Строка
        off - Смещение, с которого можно начинать писать символы
        len - Количество символов для записи
         */
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, len + off));
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(new String(cbuf));
    }

    public void close() throws IOException {
        fileWriter.close();
    }

    public static void main(String[] args) {

    }

}

