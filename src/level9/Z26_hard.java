package level9;

//Дан двумерный массив chars. Тебе нужно заменить в методе main все внутренние элементы на дефис (минус).
//Пример массива:
//a b c d e f
//g h i j k l
//m n o p q r
//s t u v w x
//После отработки программы массив должен содержать:
//a b c d e f
//g - - - - l
//m - - - - r
//s t u v w x
//почему когда то нужно писать скобки в chars[i].length, а иногда нет, например в задаче 27 и 25?
public class Z26_hard {
    public static void main(String[] args) {
        char[][] chars = new char[4][6];

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                chars[i][j] = 70;
            }
        }

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if ((i > 0 && i < chars.length - 1) && (j > 0 && j < chars[i].length - 1)) {
                    chars[i][j] = '-';
                }
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
    }
}