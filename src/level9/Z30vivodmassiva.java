package level9;//В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.
//https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html

import java.util.Arrays;

public class Z30vivodmassiva {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiArray));
    }
}