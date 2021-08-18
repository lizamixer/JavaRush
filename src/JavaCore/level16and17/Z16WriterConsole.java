package level16and17Core;

import java.io.*;
import java.util.ArrayList;

//В этой задаче тебе нужно:
//Прочесть с консоли имя файла.
//Считывать строки с консоли, пока пользователь не введет строку "exit".
//Вывести абсолютно все введенные строки в файл, каждую строчку — с новой строки.
//Requirements:
//1. Программа должна считывать c консоли имя файла.
//2. Создай и используй объект типа BufferedWriter.
//3. Программа не должна ничего считывать из файловой системы.
//4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
//5. Программа должна записать все введенные строки (включая "exit") в файл: каждую строчку — с новой строки.
//6. Метод main должен закрывать объект типа BufferedWriter после использования.
//7. Метод main не должен выводить данные на экран.

public class Z16WriterConsole {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        ArrayList<String> strings = new ArrayList<String>();


        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                strings.add(s);
                break;
            } else {
                strings.add(s);
            }
        }

        BufferedWriter writter = new BufferedWriter(new FileWriter(line));
        for (String value : strings) {
            writter.write(value + "\n");
        }
        reader.close();
        writter.close();
    }
}

// /Users/elizavetaandryushina/Desktop/Liza.txt