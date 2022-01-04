package HerbertSchildt.Exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Gl10_Z7 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2){
            System.out.println("Не введены файлы для считывания и записи");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) {
                    if ((char) i == ' ') i = '-';
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии входного файла");
            }

            try {
                if (fout != null) fout.close();

            } catch (IOException e) {
                System.out.println("Ошибка при закрытии выходного файла");
            }
        }
    }
}
