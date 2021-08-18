package Other;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class InputStream {
    public static void main(String[] args) throws Exception {
        java.io.InputStream inputStream = null;
        BufferedInputStream buffer = null;

        try {

            inputStream = new FileInputStream("/Users/elizavetaandryushina/Desktop/Liza.txt");

            buffer = new BufferedInputStream(inputStream);

            while(buffer.available()>0) {

                char c = (char)buffer.read();

                System.out.println("Был прочитан символ " + c);
            }
        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            inputStream.close();
            buffer.close();
        }
    }
}
