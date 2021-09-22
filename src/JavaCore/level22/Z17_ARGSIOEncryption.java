package JavaCore.level22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Шифровка
Придумать механизм шифровки/дешифровки.
Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где:
fileName - имя файла, который необходимо зашифровать/расшифровать.
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
-e - ключ указывает, что необходимо зашифровать данные.
-d - ключ указывает, что необходимо расшифровать данные.

Requirements:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит вторым параметром ([fileName]).
3. Создай поток для записи в файл, который приходит третьим параметром ([fileOutputName]).
4. В режиме "-e" программа должна зашифровать [fileName] и записать в [fileOutputName].
5. В режиме "-d" программа должна расшифровать [fileName] и записать в [fileOutputName].
6. Созданные для файлов потоки должны быть закрыты.
 */

public class Z17_ARGSIOEncryption {
    public static void main(String[] args) throws IOException {

        String msg = "";
        String key = "sex";
        int j = 0;
        int data;
        StringBuilder stringBuilder = new StringBuilder();
        FileInputStream fis = new FileInputStream(args[1]);
        FileOutputStream fos = new FileOutputStream(args[2]);

        while ((data = fis.read()) != -1) {
            stringBuilder.append((char) data);
        }

        if (args[0].equals("-e") || args[0].equals("-d")) {
            for (int i = 0; i < stringBuilder.length(); i++) {
                msg = msg + (char) (stringBuilder.charAt(i) ^ key.charAt(j));
                j++;
                if (j == 3) j = 0;
            }

            for (int i = 0; i < msg.length(); i++) {
                fos.write(msg.charAt(i));
            }
        }
        fis.close();
        fos.close();
    }
}

