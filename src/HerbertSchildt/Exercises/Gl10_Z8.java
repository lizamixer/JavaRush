package HerbertSchildt.Exercises;

import java.io.*;

public class Gl10_Z8 {
    public static void main(String[] args) {
        int i;

        if (args.length != 2) {
            System.out.println("Не введены файлы для считывания и записи");
            return;
        }

        try (FileReader fr = new FileReader(args[0]);
             FileWriter fw = new FileWriter(args[1])){
            while ((i = fr.read()) != -1) {
                if ((char) i == ' ') i = '-';
                fw.write(i);
            }
        } catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}

