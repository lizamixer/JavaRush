package level9;//Используя StringTokenizer раздели query на части по разделителю delimiter.
//Максимально возможное количество токенов - 6.
//Пример:
//getTokens("com.javarush.task.pro.task09.task0915", "\\.")
//возвращает массив строк
//{"com", "javarush", "task", "pro", "task09", "task0915"}
//уровень 7 так и не удалось сдать эту задачу совершенно непонятно почему


import java.util.Arrays;
import java.util.StringTokenizer;

public class Z57razdeleniestroki {
    public static void main(String[] args) {
        String packagePath = "com.javarush.task.pro.task09.task0915";
        String[] tokens = getTokens(packagePath, ".a");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] array = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            array[i++] = tokenizer.nextToken();
        }
        return array;
    }
}