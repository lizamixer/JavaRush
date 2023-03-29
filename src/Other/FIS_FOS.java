package Other;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIS_FOS {
    public static void main(String[] args) {
        copyFile("/Users/elizavetaandryushina/Desktop/Liza.txt", "/Users/elizavetaandryushina/Desktop/Liza2.txt");
    }

    private static void copyFile(String source, String target) {

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target)) {

            int data;
            while ( (data = fis.read()) != -1) {
                fos.write(data);
            }

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
