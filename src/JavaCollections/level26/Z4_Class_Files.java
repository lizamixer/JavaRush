package JavaCollections.level26;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;  // испорты менять нельзя, но для проверки используем не новый файл а уже созданный
import java.util.List;

public class Z4_Class_Files {
    public static byte[] readBytes(String fileName) throws IOException {

        return Files.readAllBytes(Paths.get(fileName));
    }

    public static List<String> readLines(String fileName) throws IOException {

        return Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
    }

    public static void writeBytes(String fileName, byte[] bytes) throws IOException {

        Files.write(Paths.get(fileName), bytes);
    }

    public static void copy(String resourceFileName, String destinationFileName) throws IOException {

        //можно не использовать 3й параметр, если вы создаете новый файл
        Files.copy(Paths.get(resourceFileName), Paths.get(destinationFileName), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) throws IOException {
        //System.out.println(readBytes("/Users/elizavetaandryushina/Desktop/NewDir/auto.txt"));

        //System.out.println(readLines("/Users/elizavetaandryushina/Desktop/NewDir/auto.txt"));

        //byte[] byt = {'a', 'b', 'c'};
        //writeBytes("/Users/elizavetaandryushina/Desktop/NewDir/auto.txt", byt);

        //copy("/Users/elizavetaandryushina/Desktop/NewDir/auto.txt", "/Users/elizavetaandryushina/Desktop/NewDir/gusli.txt");
    }
}
