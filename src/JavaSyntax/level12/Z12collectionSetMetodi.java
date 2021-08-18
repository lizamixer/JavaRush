package level12;

//Создать множество чисел(Set), занести туда 20 различных чисел. Удалить из множества все числа больше 10.

import java.util.HashSet;
import java.util.Set;

public class Z12collectionSetMetodi {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        for (int x = 1; x < 21; x++) {
            //Random r = new Random();
            //set.add(r.nextInt());
            set.add(x);
        }
        //System.out.println(set);
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        for (int i=0; i<21; i++){
            if (i > 10) {
                set.remove(i);
            }
        }
        //System.out.println(set);
    }

    public static void main(String[] args) {
        //removeAllNumbersGreaterThan10(createSet());
    }
}
