package JavaCore.level23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dmd {
    public static void main(String[] args) throws IOException {
        String str = "Это стоит 1 бакс, а вот это - 12. Переменная имеет имя file1. 110 - это число.";
        Pattern pat = Pattern.compile("(\\b\\d+\\b)");
        Matcher matcher = pat.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start() + " " + matcher.end());
        }
    }
}

