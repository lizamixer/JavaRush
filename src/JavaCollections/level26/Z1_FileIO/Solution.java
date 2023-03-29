package JavaCollections.level26.Z1_FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
Проход по дереву файлов
1. На вход метода main() подаются два параметра.
Первый - path - путь к директории, второй - resultFileAbsolutePath - имя (полный путь) существующего файла, который будет содержать результат.
2. Переименовать resultFileAbsolutePath в allFilesContent.txt (используй метод FileUtils.renameFile(), и, если понадобится, FileUtils.isExist()).
3. Для каждого файла в директории path и в ее всех вложенных поддиректориях выполнить следующее:
Если у файла длина в байтах НЕ больше 50, то для всех таких файлов:
3.1. Отсортировать их по имени файла в возрастающем порядке, путь не учитывать при сортировке.
3.2. В allFilesContent.txt последовательно записать содержимое всех файлов из п. 3.1. После каждого тела файла записать "\n".
Все файлы имеют расширение txt.
В качестве разделителя пути используй "/".
Для создания файлов используй конструктор File(String pathname).

Requirements:
1. Файл, который приходит вторым параметром в main, должен быть переименован в allFilesContent.txt.
2. Нужно создать поток для записи в переименованный файл.
3. Содержимое всех файлов, размер которых не превышает 50 байт, должно быть записано в файл allFilesContent.txt в отсортированном по имени файла порядке.
4. Поток для записи в файл нужно закрыть.
5. Не используй статические переменные.
 */

public class Solution {
    //метод нахождения файлов в поддерикториях
    private static void searchFiles(File rootFile, List<File> fileList) {
        File[] dirFiles = rootFile.listFiles();

        if (dirFiles != null) {
            for (File file : dirFiles) {
                if (file.isDirectory()) {
                    searchFiles(file, fileList);
                } else {
                    if (file.length() <= 50) {
                        fileList.add(file);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //1
        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParentFile() + "/allFilesContent.txt");

        if (FileUtils.isExist(allFilesContent)) {
           FileUtils.deleteFile(allFilesContent);
        }
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);

        //2
        ArrayList<File> list = new ArrayList<>();
        searchFiles(new File(args[0]), list);

        TreeMap<String, String> map = new TreeMap<>();
        for (File file : list) {
            String path = String.valueOf(file);
            int index = path.lastIndexOf('/');
            map.put(path.substring(index + 1), path.substring(0, index));
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String path = entry.getValue() + "/" + entry.getKey();

            int i;
            try (FileInputStream fis = new FileInputStream(path);
                 FileOutputStream fos = new FileOutputStream(allFilesContent, true)) {
                while ((i = fis.read()) != -1) {
                    fos.write(i);
                }
                fos.write(10);
            } catch (IOException e) {
                System.out.println("Ooops");
            }
        }
    }
}



