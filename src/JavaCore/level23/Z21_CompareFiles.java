package JavaCore.level23;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
Считать с консоли 2 пути к файлам - file1, file2.
Файлы содержат строки. Так как file2 является обновленной версией file1, то часть строк совпадает.
Нужно создать объединенную версию строк из обоих файлов и записать эти строки в список lines.
Правила объединения:

Если строка в обоих файлах совпадает, то в результат она попадает с операцией (приставкой) SAME.
Например, SAME строка1.
Если строка есть в file1, но ее нет в file2, то считаем, что строку удалили и в результат она попадает с операцией (приставкой) REMOVED.
Например, REMOVED строка2.
Если строки нет в file1, но она есть в file2, то считаем, что строку добавили и в результат она попадает с операцией (приставкой) ADDED.
Например, ADDED строка0.
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME.
Пустые строки даны в примере для наглядности и означают, что этой строки нет в определенном файле.
В оригинальном и редактируемом файлах пустых строк нет!
Пример 1:
содержимое оригинального файл (file1):
строка1
строка2
строка3
строка4
строка5
строка1
строка2
строка3
строка5
строка0

содержимое "редактированного" файла (file2):
строка1
строка3
строка5
строка0
строка1
строка3
строка4
строка5

результат объединения:
оригинальный    редактированный    общий
file1:          file2:             результат:(lines)

строка1         строка1            SAME строка1
строка2                            REMOVED строка2
строка3         строка3            SAME строка3
строка4                            REMOVED строка4
строка5         строка5            SAME строка5
                строка0            ADDED строка0
строка1         строка1            SAME строка1
строка2                            REMOVED строка2
строка3         строка3            SAME строка3
                строка4            ADDED строка4
строка5         строка5            SAME строка5
строка0                            REMOVED строка0

Пример 2:
содержимое оригинального файла (file1):
строка1

содержимое "редактированного" файла (file2):
строка1
строка0

результат объединения:
оригинальный    редактированный    общий
file1:          file2:             результат:(lines)

строка1         строка1            SAME строка1
                строка0            ADDED строка0

Requirements:
1. Класс Solution должен содержать класс LineItem.
2. Класс Solution должен содержать enum Type.
3. Класс Solution должен содержать публичное статическое поле lines типа List<LineItem>, которое сразу проинициализировано.
4. В методе main(String[] args) программа должна считывать пути к файлам с консоли (используй BufferedReader).
5. В методе main(String[] args) BufferedReader для считывания данных с консоли должен быть закрыт.
6. Программа должна считывать содержимое первого и второго файла (используй FileReader).
7. Потоки чтения из файлов (FileReader) должны быть закрыты.
8. Список lines должен содержать объединенную версию строк из файлов, где для каждой строки указана одна из операций ADDED, REMOVED, SAME.
 */

public class Z21_CompareFiles {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws FileNotFoundException {
        String file1 = null;
        String file2 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2))) {
            String line1;
            String line2;
            while ((line1 = bufferedReader1.readLine()) != null) {
                list1.add(line1);
            }
            while ((line2 = bufferedReader2.readLine()) != null) {
                list2.add(line2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (list1.size() > 0 && list2.size() > 0) {
            if (list1.get(0).equals(list2.get(0))) {
                lines.add(new LineItem(Type.SAME, list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            } else if (list1.get(1).equals(list2.get(0))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                list1.remove(0);
            } else {
                lines.add(new LineItem(Type.ADDED, list2.get(0)));
                list2.remove(0);
            }

        }
        if (list1.size() != 0) {
            for (String s : list1) {
                lines.add(new LineItem(Type.REMOVED, s));
            }
        }
        if (list2.size() != 0) {
            for (String s : list2) {
                lines.add(new LineItem(Type.ADDED, s));
            }
        }
//        for (LineItem s : lines) {
//            System.out.println(s);
//        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

//        public String toString() {
//            return type + " " + line;
//        }
    }
}

/* было
public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}

 */

