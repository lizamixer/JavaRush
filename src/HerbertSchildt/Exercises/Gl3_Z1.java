package HerbertSchildt.Exercises;

import java.io.IOException;

public class Gl3_Z1 {
    public static void main(String args[]) throws IOException {
        char ch, ignore;
        int count = 0;

        do {
            ch = (char) System.in.read();
            if (ch == ' ') count++;
        } while (ch != '.');

        System.out.println(count);
    }
}
