package level10;

//При преобразовании из целых чисел в дробные могут отбрасываться самые младшие части числа. Проверим это на практике.
//В методе getDifference входящий аргумент уже преобразован в float.
//Определи, что отбросилось при этом преобразовании, и верни недостающую часть.

public class Z2privedenietipov {
    public static void main(String[] args) {
        int big = 1234567890;

        System.out.println(getDifference(big)); // 46 или -46
    }

    public static int getDifference(int big) {
        float approx = big;
        int n = big - (int) approx;
        //напишите тут ваш код
        return n;
    }
}