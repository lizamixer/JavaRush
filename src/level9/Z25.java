package level9;

//Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
//заполни его таблицей умножения и выведи в консоли в следующем виде:
//Числа в строке разделены пробелом.

public class Z25 {
    public static int[][] MULTIPLICATION_TABLE = new int[10][10];
    public static void main(String[] args) {

        int stroka = 1;
        int stolbec = 1;

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
                MULTIPLICATION_TABLE[i][j] = stroka * stolbec;
                stroka++;
            }
            stolbec++;
            stroka=1;
        }

        for (int a = 0; a < MULTIPLICATION_TABLE.length; a++) {
            for (int b = 0; b < MULTIPLICATION_TABLE.length; b++) {
                System.out.print(MULTIPLICATION_TABLE[a][b] + " ");
            }
            System.out.println();
        }
    }
}
