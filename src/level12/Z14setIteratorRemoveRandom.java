package level12;

//Создать множество чисел(Set), занести туда 20 различных чисел. Удалить из множества все числа больше 10.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Z14setIteratorRemoveRandom {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        for (int x = 1; x < 21; x++) {
            //Random r = new Random();
            //set.add(r.nextInt());
            set.add(x);
        }
        //System.out.println(set);
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        Integer a;
        while (iterator.hasNext()) {
            a = iterator.next();
            if (a.compareTo(10) > 0) {
                iterator.remove();
            }
        }
        //System.out.println(set);
    }

    public static void main(String[] args) {
        //removeAllNumbersGreaterThan10(createSet());
    }
}
