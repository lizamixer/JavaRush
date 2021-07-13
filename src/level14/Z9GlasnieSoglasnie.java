package level14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Z9GlasnieSoglasnie {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        char[] arr = str.replace(" ", "").toCharArray();
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> notvowels = new ArrayList<>();

        for (char ch : arr){
            if (isVowel(ch) == true)
                vowels.add(ch);
            else
                notvowels.add(ch);
        }

        for (Character c : vowels){
            System.out.print(c + " ");
        }

        System.out.println();
        for (Character c : notvowels){
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
