package level12;

//Класс Solution должен содержать методы main, insert10000, get10000, set10000, remove10000.
//2. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
//3. Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
//4. Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
//5. Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Z5arraylistMetodiandYdalenie {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.set(i, i);
        }
    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
    }
}