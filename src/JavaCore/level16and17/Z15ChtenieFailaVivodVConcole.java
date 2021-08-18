package level16and17Core;

import java.io.*;

//В этой задаче тебе нужно:
//Считать с консоли имя файла.
//Вывести в консоли (на экран) содержимое файла.
//Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
//Requirements:
//1. Программа должна считывать c консоли имя файла.
//2. Программа должна выводить на экран содержимое файла.
//3. Поток чтения из файла (FileInputStream) должен быть закрыт.
//4. BufferedReader также должен быть закрыт.

public class Z15ChtenieFailaVivodVConcole {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        InputStream fr = new FileInputStream(line);
        StringBuilder sb = new StringBuilder();
        int code = -1;

        while ((code = fr.read()) != -1)
        {
            sb.append(Character.toChars(code));
        }
        System.out.println(sb.toString());
        fr.close(); //закрываем потоки
        reader.close(); //закрыли баферидер
    }
}
/* другой вариант решения
        try (FileReader fr = new FileReader(line)) { // /Users/elizavetaandryushina/Desktop/Liza.txt
            // Переменная для хранения строки
            StringBuilder sb = new StringBuilder();
            int code = -1;
            // Читаем посимвольно пока код считанного символа не станет равным -1
            while ((code = fr.read()) != -1) {
                // Вызов Character.toChars() преобразует int в char
                sb.append(Character.toChars(code));
            }
            System.out.println(sb.toString());

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
 */