package JavaCollections.level27;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;


/*
Используем RandomAccessFile
В метод main приходят три параметра:
1) fileName - путь к файлу;
2) number - число, позиция в файле;
3) text - текст.

Считать текст с файла начиная с позиции number, длиной такой же как и длина переданного текста в третьем параметре.
Если считанный текст такой же как и text, то записать в конец файла строку 'true', иначе записать 'false'.
Используй RandomAccessFile и его методы seek(long pos), read(byte[] b, int off, int len), write(byte[] b).
Используй один из конструкторов класса String для конвертации считанной строчки в текст.

Requirements:
1. В методе main класса Solution необходимо использовать RandomAccessFile, который должен использовать файл, который приходит первым параметром.
2. В методе main класса Solution программа должна устанавливать позицию в файле, которая передана во втором параметре.
3. В методе main класса Solution программа должна считывать данные с файла при помощи метода read(byte[] b, int off, int len).
4. Запись должна происходить в конец файла.
5. Если считанный текст такой же как и text, то программа должна записать в конец переданного файла строку 'true'.
6. Если считанный текст НЕ такой же как и text, то программа должна записать в конец переданного файла строку 'false'.
 */

public class Ex2_RandomAccessFile {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];
        int lenght = text.length();
        byte[] buffer = new byte[lenght];

        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        raf.seek(number);
        raf.read(buffer, 0, lenght); //off-смещение символов

        raf.seek(raf.length());
        String s = new String(buffer, StandardCharsets.UTF_8);
        if (s.equals(text)) { raf.write("true".getBytes(StandardCharsets.UTF_8));
        } else raf.write("false".getBytes(StandardCharsets.UTF_8));

        raf.close();
    }
}
