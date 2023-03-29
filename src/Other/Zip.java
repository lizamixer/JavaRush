package Other;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Zip {
    public static void main(String[] args) throws IOException {
        //пишем данные из файлa в новый файл в зипе
        ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("/Users/elizavetaandryushina/Desktop/folder.zip"));
        zout.putNextEntry(new ZipEntry("two.txt"));
        FileInputStream fis = new FileInputStream("/Users/elizavetaandryushina/Desktop/one1.txt");
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        zout.write(buffer);
        zout.closeEntry();
        zout.close();


        ZipInputStream zin = new ZipInputStream(new FileInputStream("/Users/elizavetaandryushina/Desktop/folder.zip"));
        ZipEntry entry;
        while ((entry = zin.getNextEntry()) != null) {
            System.out.println("Entry in zip: " + entry.getName());
            System.out.println("Size entry " + entry.getSize()); //здесь всегда будет выводиться -1
        }
        zin.close();


        //чтобы выводился реальный размер
        ZipFile zipFile = new ZipFile("/Users/elizavetaandryushina/Desktop/folder.zip");
        Enumeration zipEnum = zipFile.entries();
        while (zipEnum.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) zipEnum.nextElement();
            System.out.println("Normal size: " + zipEntry.getSize()); //в байтах
        }


        //чтение файла из зипа

        //при создании зип архива на маке дополнительно создаются левые папки с наполнением
        //чтобы от них избавиться zip -d filename.zip __MACOSX/\*
        //https://stackoverflow.com/questions/10924236/mac-zip-compress-without-macosx-folder

        ZipFile zipFile1 = new ZipFile("/Users/elizavetaandryushina/Desktop/folder2.zip");
        Enumeration zipEnum1 = zipFile1.entries();
        while (zipEnum1.hasMoreElements()) {
            ZipEntry zipEntry1 = (ZipEntry) zipEnum1.nextElement();
            System.out.println("Entry: " + zipEntry1.getName());
            if (!zipEntry1.isDirectory()) {
                BufferedReader br = new BufferedReader(new InputStreamReader(zipFile1.getInputStream(zipEntry1)));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            }
        }
        zipFile1.close();

    }
}
