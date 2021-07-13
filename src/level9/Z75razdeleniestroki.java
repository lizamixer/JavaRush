package level9;//В методе map распарсь строку представляющую IPv6-адрес и верни результат в виде массива строк.
//Например, для входящей строки:
//2001:db8:11a3:9d7:1f34:8a2e:7a0:765d
//нужно вернуть такой массив:
//[2001, db8, 11a3, 9d7, 1f34, 8a2e, 7a0, 765d]
//Для парсинга строки используй StringTokenizer.


import java.util.Arrays;
import java.util.StringTokenizer;

public class Z75razdeleniestroki {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map("2001:db8:11a3:9d7:1f34:8a2e:7a0:765d")));
    }

    public static String[] map(String ipv6) {
        String delimiter = ":";
        StringTokenizer tokenizer = new StringTokenizer(ipv6, delimiter);
        String[] array = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            array[i++] = tokenizer.nextToken();
        }
        return array;
    }
}