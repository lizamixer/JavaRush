package level12;

//. Программа должна выводить числа на экран.
//2. Метод main не изменять.
//3. Метод fill(List list) должен вставлять 10 тысяч элементов в список.
//4. Метод get10000(List list) должен производить 10 тысяч вызовов get для списка.
//5. Метод getGetTimeInMs должен вызывать метод get10000(List list) только один раз.
//6. Метод getGetTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вызовов get для списка.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Z7arraylistVremyaVipolneniaGet {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList<>())));
        System.out.println(getGetTimeInMs(fill(new LinkedList<>())));
    }

    public static List<Object> fill(List<Object> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List<Object> list) {
        long start = System.currentTimeMillis();

        get10000(list);

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        return elapsed;
    }

    public static void get10000(List<Object> list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
