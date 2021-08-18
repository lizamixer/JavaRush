package HerbertSchildt.Exercises;

import java.io.IOException;

public class Gl3_Z10 {
    public static void main(String args[]) throws IOException {
        char ch;
        int count = 0;

        do {
            ch = (char) System.in.read();
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
                count++;
                System.out.println(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
                count++;
                System.out.println(ch);
            }
        } while (ch != '.');
        System.out.println(count);

    }
}
