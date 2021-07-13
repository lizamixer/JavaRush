package level12;

//Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
//2. Метод getInsertTimeInMs должен вызывать метод insert10000 только один раз.
//3. Метод getInsertTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Z6arraylistVremyaVipolneniaAdd {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        long start = System.currentTimeMillis();

        insert10000(list);
        // напишите тут ваш код
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        return elapsed;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
