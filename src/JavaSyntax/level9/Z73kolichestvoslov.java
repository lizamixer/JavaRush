package level9;

//Реализуй метод wordsCount(String) чтобы он возвращал количество слов в строке, полученной входящим параметром.

public class Z73kolichestvoslov {
    public static void main(String[] args) {
        String string = "Кто желает поработать?";
        int getWordCount = getWordCount(string);
        System.out.println("Количество слов в строке \"" + string + "\" равно " + getWordCount);
    }

    public static int getWordCount(String string) {
        //напишите тут ваш код
        int count = 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}