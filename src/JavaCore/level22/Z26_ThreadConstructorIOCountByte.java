package JavaCore.level22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.

Requirements:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
2. Для каждого файла создай нить ReadThread и запусти ее.
3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
4. Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
5. Поток для чтения из файла в каждой нити должен быть закрыт.
 */

public class Z26_ThreadConstructorIOCountByte {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();
    public static ArrayList<String> nameList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = reader.readLine()).equals("exit")) {
            nameList.add(line);
        }
        reader.close();

        for (String fileName : nameList) {
            new ReadThread(fileName).start();
        }
    }

    public static class ReadThread extends Thread {
        public String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        @Override
        public void run() {
            int[] array = new int[256];
            int maxValue = 0;
            int index = 0;
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                while (fileInputStream.available() > 0) {
                    //индекс массива это считанный байт и если он нам попался несколько раз,
                    //то значение в ячейке будет увеличиваться на 1. таким образом мы знаем и номер символа и
                    //его кол-во повторений
                    array[fileInputStream.read()]++;
                }
                //находим байт, который повторился макс кол-во раз
                for (int i = 0; i < array.length; i++) {
                    if (maxValue < array[i]) {
                        maxValue = array[i];
                    }
                }
                //находим номер ячейки, в которой лежит это максимальное значение
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == maxValue) {
                        index = i;
                    }
                }
                resultMap.put(fileName, index);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
