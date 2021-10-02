package JavaCore.level22;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/*
Собираем файл
Собираем файл из кусочков.
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.
Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].
Например, Lion.avi.
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки.

Requirements:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "end".
2. Создай поток для записи в файл без суффикса [.partN] в папке, где находятся все считанные файлы.
3. В новый файл перепиши все байты из файлов-частей *.partN.
4. Чтение и запись должны происходить с использованием буфера.
5. Созданные для файлов потоки должны быть закрыты.
6. Не используй статические переменные.
 */

public class Z28_NONIOCreateFile {
    public static void main(String[] args) throws IOException {
        final String PATH = "/Users/elizavetaandryushina/Desktop/www/";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file2 = null;
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        while (true) {
            //создаем исходник
            String line = reader.readLine();
            if (!line.equals("end")) {
                StringBuilder fileName = new StringBuilder(PATH);
                fileName.append(line);
                File file = new File(fileName.toString());
                file.createNewFile();

                //создаем мапу
                StringBuilder fileName3 = new StringBuilder(line);
                fileName3.delete(0, (line.lastIndexOf(".") + 5));
                treeMap.put(Integer.parseInt(fileName3.toString()), line);

                //создаем файл для файлов
                fileName.delete(fileName.lastIndexOf("."), fileName.length());
                //fileName.append(".txt"); по условию задачи расширение может быть любым
                file2 = new File(fileName.toString());
                file2.createNewFile();
            } else break;
        }

        FileWriter fw = new FileWriter(file2);
        for (Map.Entry<Integer, String> pair : treeMap.entrySet()) {
            String value = pair.getValue();
            fw.write(value + "\n");
        }
        reader.close();
        fw.close();

//        //FileOutputStream outputStream = new FileOutputStream(file2);
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        for (Map.Entry<Integer, String> pair : treeMap.entrySet()) {
//            String value = pair.getValue();
//            baos.write(value.getBytes());
//        }
//        //byte[] buffer = baos.toByteArray();
//        //outputStream.write(baos);
//
//        reader.close();
//        baos.close();
//        //outputStream.close();

    }
}
/*
Lion.avi.part2
Lion.avi.part1
Lion.avi.part3
end
 */
