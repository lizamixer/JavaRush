import java.util.Arrays;
import java.util.Collections;

public class Massive {
    public static void main(String[] args) {
        int[] mass = {1,2,3};
        int[] copy = new int[mass.length];

        //1
        for (int i = 0; i < mass.length; i++) {
            copy[i] = mass[mass.length-i-1];
        }

        //2
        for(int i: copy) {
            System.out.print(i);
        }

        System.out.println();

        //перевернуть
        Collections.reverse(Arrays.asList(mass));
        for(int i: mass) {
            System.out.print(i);
        }
    }
}
