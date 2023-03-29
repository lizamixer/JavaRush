package JavaCollections.level26;

import java.io.File;
import java.io.IOException;
import java.util.*;

/*
Находим все файлы
Реализовать логику метода getFileTree, который должен в директории root найти список всех файлов включая вложенные.
Используй очередь, рекурсию не используй.
Верни список всех путей к найденным файлам, путь к директориям возвращать не надо.
Путь должен быть абсолютный.

Requirements:
1. Метод getFileTree должен принимать аргументом String root, по которому нужно найти все вложенные файлы.
2. Метод getFileTree должен возвращать список строк.
3. Нужно реализовать метод getFileTree: найти все файлы по указанному пути и добавить их в список.
4. Метод getFileTree должен быть вызван только 1 раз (рекурсию не использовать).
 */

public class Z2_Queue_SearchFiles {
    public static List<String> getFileTree(String root) throws IOException {
        File rootDir = new File(root);
        List<String> result = new ArrayList<>();
        Queue<File> fileTree = new PriorityQueue<>();

        Collections.addAll(fileTree, rootDir.listFiles());

        while (!fileTree.isEmpty())
        {
            File currentFile = fileTree.remove();
            if (currentFile.isDirectory()){
                Collections.addAll(fileTree, currentFile.listFiles());
            } else {
                result.add(currentFile.getAbsolutePath());
            }
        }

//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i));
//        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        //getFileTree("/Users/elizavetaandryushina/Desktop/NewDir");
    }
}

