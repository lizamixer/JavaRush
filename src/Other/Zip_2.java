package Other;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//Как добавить директорию в архив
public class Zip_2 {
    public static void main(String[] args) {

        try(ZipOutputStream out = new ZipOutputStream(new FileOutputStream("c:/archive.zip"))){
            out.putNextEntry(new ZipEntry("myfolder/"));
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
