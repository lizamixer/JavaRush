package level9;//Реализуй метод isPalindrome(String), чтобы он проверял, является ли палиндромом слово, полученное входящим параметром.
//Палиндром — слово, одинаково читающееся в обоих направлениях.
//Регистр букв не учитывай.

public class Z63palindrom {
    public static void main(String[] args) {
        String word = "Ротор";
        String answer = isPalindrome(word) ? "Да" : "Нет";
        System.out.println("Слово \"" + word + "\" палиндром? " + answer);
    }

    public static boolean isPalindrome(String word) {
        //напишите тут ваш код
        StringBuilder builder = new StringBuilder(word);
        builder = builder.reverse();
        return word.equalsIgnoreCase(builder.toString());
    }
}
