package JavaCore.level24;

import java.util.ArrayList;
import java.util.List;

/*
Кроссворд
1. Дан двумерный массив, который содержит буквы английского алфавита в нижнем регистре.
2. Метод detectAllWords должен найти все слова из words в массиве crossword.
3. Элемент(startX, startY) должен соответствовать первой букве слова, элемент(endX, endY) - последней.
text - это само слово, располагается между начальным и конечным элементами
4. Все слова есть в массиве.
5. Слова могут быть расположены горизонтально, вертикально и по диагонали как в нормальном, так и в обратном порядке.
6. Метод main не участвует в тестировании.

Requirements:
1. В классе Solution должен существовать метод detectAllWords.
2. В классе Solution должен существовать статический класс Word.
3. Класс Solution не должен содержать статические поля.
4. Метод detectAllWords должен быть статическим.
5. Метод detectAllWords должен быть публичным.
6. Метод detectAllWords должен возвращать список всех слов в кроссворде (согласно условию задачи).
 */

public class Z22_Crossword {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                //i строки j столбцы
                {'0', '1', '2', '3', '4', '5'},
                {'1', 'z', ' ', ' ', 'z', 'z'},
                {'2', 'z', 'z', 'z', 'z', 'z'},
                {'3', ' ', 'z', ' ', 'z', ' '},
                {'4', 'z', 'z', 'z', 'z', 'z'}
                /*
                  {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
                 */
        };
        detectAllWords(crossword, "z", "zz", "zzz", "zzzz").forEach(System.out::println); //здесь выдает не все вариации
        // detectAllWords(crossword, "home", "same", "jje", "ro").forEach(System.out::println); //здесь не продуман алгоритм с выходом за массив
        /*
        Ожидаемый результат
        home - (5, 3) - (2, 0)
        same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) { //этот код сложно читабельный
        List<Word> ex = new ArrayList<>();

        for (int w = 0; w < words.length; w++) {
            String text = words[w];

            char[] symbols = text.toCharArray();
            int lengthOfWord = symbols.length - 1;
            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[i].length; j++) {
                    Word word = new Word(text);
                    word.setStartPoint(j, i);
                    if (crossword[i][j] == (int) symbols[0]) {
                        if (symbols.length > 1) {
                            //по горизонтали вправо
                            if (j + lengthOfWord < crossword[i].length &&
                                    crossword[i][j + lengthOfWord] == symbols[lengthOfWord] && crossword[i][j + 1] == (int) symbols[1]) {
                                word.setEndPoint(j + lengthOfWord, i);
                                ex.add(word);
                            }
                            //по горизонтали влево
                            if (j - lengthOfWord >= 0 &&
                                    crossword[i][j - lengthOfWord] == symbols[lengthOfWord] && crossword[i][j - 1] == (int) symbols[1]) {
                                word.setEndPoint(j - lengthOfWord, i);
                                ex.add(word);
                            }
                            //по вертикали вниз
                            if (i + lengthOfWord < crossword.length &&
                                    crossword[i + lengthOfWord][j] == symbols[lengthOfWord] && crossword[i + 1][j] == (int) symbols[1]) {
                                word.setEndPoint(j, i + lengthOfWord);
                                ex.add(word);
                            }
                            //по вертикали вверх
                            if (i - lengthOfWord >= 0 &&
                                    crossword[i - lengthOfWord][j] == symbols[lengthOfWord] && crossword[i - 1][j] == (int) symbols[1]) {
                                word.setEndPoint(j, i - lengthOfWord);
                                ex.add(word);
                            }
                            //если слова по диагонали снизу вверх влево
                            if (i - lengthOfWord >= 0 && j - lengthOfWord >= 0 &&
                                    crossword[i - lengthOfWord][j - lengthOfWord] == symbols[lengthOfWord] && crossword[i - 1][j - 1] == (int) symbols[1]) {
                                word.setEndPoint(j - lengthOfWord, i - lengthOfWord);
                                ex.add(word);
                            }
                            //если слова по диагонали сверху вниз вправо
                            if (i + lengthOfWord < crossword.length && j + lengthOfWord < crossword[i].length &&
                                    crossword[i + lengthOfWord][j + lengthOfWord] == symbols[lengthOfWord] && crossword[i + 1][j + 1] == (int) symbols[1]) {
                                word.setEndPoint(j + lengthOfWord, i + lengthOfWord);
                                ex.add(word);
                            }
                            //если слова по диагонали снизу вверх вправо
                            if (i - lengthOfWord >= 0 && j + lengthOfWord < crossword[i].length &&
                                    crossword[i - lengthOfWord][j + lengthOfWord] == symbols[lengthOfWord] && crossword[i - 1][j + 1] == (int) symbols[1]) {
                                word.setEndPoint(j + lengthOfWord, i - lengthOfWord);
                                ex.add(word);
                            }
                            //если слова по диагонали сверху вниз влево
                            if (i + lengthOfWord < crossword.length && j - lengthOfWord >= 0 &&
                                    crossword[i + lengthOfWord][j - lengthOfWord] == symbols[lengthOfWord] && crossword[i + 1][j - 1] == (int) symbols[1]) {
                                word.setEndPoint(j - lengthOfWord, i + lengthOfWord);
                                ex.add(word);
                            }
                        } else {
                            word.setEndPoint(j, i);
                            ex.add(word);
                        }
                    }
                }
            }
        }
        return ex;
    }

    /*
     public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> ex = new ArrayList<>();

        int lengthDlina = crossword.length - 1;
        int lengthVisota = crossword[1].length - 1;

        for (int w = 0; w < words.length; w++) {
            String text = words[w];

            char[] symbols = text.toCharArray();

            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[i].length; j++) {

                    Word word = new Word(text);
                    word.setStartPoint(j, i);

                    if (crossword[i][j] == (int) symbols[0]) {
                        if (symbols.length > 1) {

                            for (int x = -1; x < 2; x++) {
                                for (int y = -1; y < 2; y++) {

                                    for (int k = 1; k < symbols.length; k++) {
                                        if ((i + x * k < lengthDlina) && (j + y * k < lengthVisota) && symbols[k] == crossword[i + x * k][j + y * k]) {
                                            if (k == symbols.length-1) {
                                                word.setEndPoint(j + y * k, i + x * k);
                                                ex.add(word);
                                            }
                                        } else break;
                                    }
                                }
                            }
                        } else {
                            word.setEndPoint(j, i);
                            ex.add(word);
                        }
                    }
                }
            }
        }
        return ex;
    }
     */

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}

