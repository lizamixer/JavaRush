package JavaCollections.level26;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.ZipInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


/*
Разархивируем файл
В метод main приходит список аргументов.
Первый аргумент - имя результирующего файла resultFileName, остальные аргументы - имена файлов fileNamePart.
Каждый файл (fileNamePart) - это кусочек zip архива. Нужно разархивировать целый файл, собрав его из кусочков.
Записать разархивированный файл в resultFileName.
Архив внутри может содержать файл большой длины, например, 50Mb.
Внутри архива может содержаться файл с любым именем.

Пример входных данных. Внутри архива находится один файл с именем abc.mp3:
C:/result.mp3
C:/pathToTest/test.zip.003
C:/pathToTest/test.zip.001
C:/pathToTest/test.zip.004
C:/pathToTest/test.zip.002


Requirements:
1. В методе main нужно создать ZipInputStream для архива, собранного из кусочков файлов. Файлы приходят аргументами в main, начиная со второго.
2. Создай поток для записи в файл, который приходит первым аргументом в main. Запиши туда содержимое файла из архива.
3. Поток для чтения из архива должен быть закрыт.
4. Поток для записи в файл должен быть закрыт.
 */


//не получается решить, тк на маке пока не удалось найти способ сделать многотомное архивирование
//данное решение выполняет другую задачу: соединяет разные архивы в один документ
//задача находится в прогрессе
public class Z8_ZIP__inprogress {
    public static void main(String[] args) {
        File resultFileName = new File(args[0]);
        ArrayList<String> list = new ArrayList<>(); //для хранения и сортировки файлов зип
        for (int i = 1; i <= args.length - 1; i++) {
            list.add(args[i]);
        }
        Collections.sort(list);
        for (int i = 0; i <= list.size() - 1; i++) {
            try (ZipInputStream zin = new ZipInputStream(new FileInputStream(list.get(i)))) {
                while ((zin.getNextEntry()) != null) {
                    for (int c = zin.read(); c != -1; c = zin.read()) {
                        FileWriter writer = new FileWriter(resultFileName, true);
                        BufferedWriter bufferWriter = new BufferedWriter(writer);
                        bufferWriter.write(c);
                        bufferWriter.close();
                    }
                    zin.closeEntry();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}