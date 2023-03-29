package JavaCollections.level26;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
В метод main приходит список аргументов.
Первый аргумент - полный путь к файлу fileName.
Второй аргумент - путь к zip-архиву.
Добавить файл (fileName) внутрь архива в директорию 'new'.
Если в архиве есть файл с таким именем, то заменить его.

Пример входных данных:
C:/result.mp3
C:/pathToTest/test.zip

Файлы внутри test.zip:
a.txt
b.txt

После запуска Solution.main архив test.zip должен иметь такое содержимое:
new/result.mp3
a.txt
b.txt

Подсказка: нужно сначала куда-то сохранить содержимое всех энтри, а потом записать в архив все энтри вместе с добавленным файлом.
Пользоваться файловой системой нельзя.

Requirements:
1. В методе main создай ZipInputStream для архивного файла (второй аргумент main). Нужно вычитать из него все содержимое.
2. В методе main создай ZipOutputStream для архивного файла (второй аргумент main).
3. В ZipOutputStream нужно записать содержимое файла, который приходит первым аргументом в main.
4. В ZipOutputStream нужно записать все остальное содержимое, которое было вычитано из ZipInputStream.
5. Потоки для работы с архивом должны быть закрыты.
 */



public class Z9_ZIP_inprogress {
    public static void main(String[] args) throws IOException {
        File fileName = new File(args[0]);
        File zipFile = new File(args[1]);
        ArrayList<ZipEntry> list = new ArrayList<>();

        try(ZipInputStream zin = new ZipInputStream(new FileInputStream(zipFile))) {
            ZipEntry entry;
            while((entry=zin.getNextEntry())!=null) {
                list.add(entry);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }



    }

}
