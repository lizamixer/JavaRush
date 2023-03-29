package JavaCollections.level26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Set;

/*
Что внутри папки?
Напиши программу, которая будет считать подробную информацию о папке и выводить ее на консоль.

Первым делом считай путь к папке с консоли.
Если введенный путь не является директорией - выведи "[полный путь] - не папка" и заверши работу.
Затем посчитай и выведи следующую информацию:

Всего папок - [количество папок в директории и поддиректориях]
Всего файлов - [количество файлов в директории и поддиректориях]
Общий размер - [общее количество байт, которое хранится в директории]

Используй только классы и методы из пакета java.nio.
Квадратные скобки [ ] выводить на экран не нужно.

Requirements:
1. Метод main должен считывать путь к папке с консоли.
2. Если введенный путь не является директорией - нужно вывести "[полный путь] - не папка" и завершить работу.
3. Используй только классы и методы из пакета java.nio.
4. На консоль должна быть выведена следующая информация: "Всего папок - [количество папок в директории и поддиректориях]".
5. На консоль должна быть выведена следующая информация: "Всего файлов - [количество файлов в директории и поддиректориях]".
6. На консоль должна быть выведена следующая информация: "Общий размер - [общее количество байт, которое хранится в директории]".
 */

public class Z7_walkFileTree {

    public static class SearchFileVisitor extends SimpleFileVisitor<Path> {
        private int countDir;
        private int countFiles;
        private long count;

        public int getDirectories() {
            return countDir-1;
        }

        public int getFiles() {
            return countFiles;
        }

        public long getCount() {
            return count;
        }

        public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
            if (Files.isDirectory(path)) countDir++;

            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
            if (Files.isRegularFile(path)) countFiles++;
            count += fileAttributes.size();

            return FileVisitResult.CONTINUE;
        }
    }

    public static void main(String[] args) throws IOException {
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dir = reader.readLine();
        Path path = Paths.get(dir);

        Set<FileVisitOption> fileVisitOptions = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        Files.walkFileTree(path, fileVisitOptions, Integer.MAX_VALUE, searchFileVisitor);

        if (Files.isDirectory(path)) {
            System.out.println("Всего папок - " + searchFileVisitor.getDirectories());
            System.out.println("Всего файлов - " + searchFileVisitor.getFiles());
            System.out.println("Общий размер - " + searchFileVisitor.getCount());
        } else System.out.println(path.toAbsolutePath() + " - не папка");
    }
}

